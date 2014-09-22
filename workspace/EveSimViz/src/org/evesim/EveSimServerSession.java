package org.evesim;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.evesim.msg.EveLogMessage;
import org.evesim.msg.EveMessage;
import org.evesim.msg.EveMessageBundle;
import org.evesim.msg.EveUpdateMessage;
import org.evesim.msg.MsgFactory;
import org.evesim.msg.MsgPackage;

/**
 * ServerNode side session functionality for EveSimulations
 * 
 * @author reder
 * 
 */
public class EveSimServerSession {

	static {
		MsgPackage.eINSTANCE.eClass();
	}

	public static final Logger logger = Logger.getLogger(EveSimServerSession.class.getName());

	private transient MsgFactory factory = null;

	private boolean active = false;

	/**
	 * Message queue for one session
	 */
	private ArrayList<EveMessage> msgQueue = null;

	/**
	 * Reference to this session's root component
	 */
	private EveComponent rootComponent = null;

	/**
	 * Unique Session ID
	 */
	private UUID sid;

	/**
	 * ThreadGroup for this session. All sessions threads should belong to this
	 * threadgroup.
	 * 
	 * @see EveSimThreadGroup
	 */
	private EveSimThreadGroup tg;

	/**
	 * Dummy log method
	 * 
	 * @param message
	 */
	public void log(String message) {
		logger.info("[SID " + sid + "] " + message);
	}

	/**
	 * Initializes a new session.
	 * 
	 * @param sid
	 */
	public EveSimServerSession(UUID sid) {
		this.sid = sid;
		tg = new EveSimThreadGroup("EveSession [SID " + sid + "]", this);
		factory = MsgFactory.eINSTANCE;
		log("session created.");
	}

	/**
	 * Getter for session id
	 * 
	 * @return
	 */
	public UUID getSid() {
		return sid;
	}

	/**
	 * Setter for session id
	 * 
	 * @param sid
	 */
	public void setSid(UUID sid) {
		this.sid = sid;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * Returns the mesage queue for this session. A new instance is created at
	 * first call. This method is private as the methods to use have
	 * syncronization methods for thread safety.
	 * 
	 * @return session's message queue
	 */
	private ArrayList<EveMessage> getMsgQueue() {
		if (msgQueue == null)
			msgQueue = new ArrayList<EveMessage>();
		return msgQueue;
	}

	/**
	 * Removes all messages from the message queue and returns these messages in
	 * a message bundle. This method is synchronized on the sid attribute. (see
	 * putMessage)
	 * 
	 * @return All current messages for this session
	 * @see #putMessage(EveMessage)
	 */
	public EveMessageBundle getMessages() {
		EveMessageBundle bundle = null;
		synchronized (sid) {
			bundle = factory.createEveMessageBundle();
			bundle.getMessages().addAll(getMsgQueue());
			logger.log(Level.INFO,"Nr of messages: " + bundle.getMessages().size());
			getMsgQueue().clear();
		}
		return bundle;
	}

	/**
	 * Adds a new message to the message queue. This method is synchronized on
	 * the sid attribute. (see putMessage)
	 * 
	 * @param msg
	 * @see EveSimServerSession#getMessages()
	 */
	public void putMessage(EveMessage msg) {
		synchronized (sid) {
			getMsgQueue().add(msg);
			logger.log(Level.INFO,"PUT MESSAGE: " + msg);
		}
	}

	/**
	 * Getter for rootComponent.
	 * 
	 * @return
	 */
	public EveComponent getRootComponent() {
		return rootComponent;
	}

	/**
	 * Setter for rootComponent. <br>
	 * A new Adapter is added to the root component, as all changed values
	 * should notifications to this session.
	 * 
	 * @param rootComponent
	 */
	public void setRootComponent(EveComponent rootComponent) {
		this.rootComponent = rootComponent;

		EContentAdapter adapter = new EContentAdapter() {
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
				notifyChangedItem(notification);
			}
		};

		rootComponent.eAdapters().add(adapter);
	}

	/**
	 * Generates an update information message when a notification is recieved
	 * from a model object.
	 * 
	 * @param notification
	 * @return update message
	 * 
	 */
	protected EveUpdateMessage generateUpdateMessage(Notification notification) {
		int featureId = ((EStructuralFeature) notification.getFeature()).getFeatureID();
		String featureName = ((EStructuralFeature) notification.getFeature()).getName();
		EveComponent cmp = (EveComponent) notification.getNotifier();
		
		if (notification.getEventType() == Notification.SET) {
			EveUpdateMessage msg = generateUpdateMessage_typeSet(notification, featureId, cmp);
			return msg;
		} else {
			throw new UnsupportedOperationException("Event type: "+notification.getEventType()+" not allowed for attribute: "+featureName+".");
		}
		
	}

	private EveUpdateMessage generateUpdateMessage_typeSet(Notification notification, int featureId, EveComponent cmp) {
		EveUpdateMessage msg = factory.createEveUpdateMessage();		
		msg.setFeatureID(featureId);
		msg.setSessionUUID(cmp.getSessionID());
		msg.setOldValue(notification.getOldValue());
		msg.setNewValue(notification.getNewValue());
		msg.setTimestamp(new Date().getTime());
		msg.setSenderUUID(cmp.getUuid());
		msg.setRecieverUUID(cmp.getUuid());
		return msg;
	}

	/**
	 * An exception recived from this session's thread group uncaught exception
	 * handler will be pushed to this method. The message is directly enqueued
	 * in the output message queue
	 * 
	 * @param sender
	 * @param e
	 */
	public void anonymousException(String sender, Throwable e) {

		StringBuffer text = new StringBuffer();
		text = text.append("Exception occured. Sender: ");
		text = text.append(sender);
		text = text.append("Exception: ");
		text = text.append(e.toString());

		EveLogMessage msg = factory.createEveLogMessage();
		StringWriter buf = new StringWriter();
		e.printStackTrace(new PrintWriter(buf));
		msg.setDetail(buf.toString());
		msg.setMessage(text.toString());
		msg.setTimestamp(new Date().getTime());
		msg.setSessionUUID(sid);
		putMessage(msg);
	}

	/**
	 * This method is invoked by the ecore adapter to notifyon changes in the
	 * model tree
	 * 
	 * @param notification
	 */
	public void notifyChangedItem(Notification notification) {
		EveUpdateMessage msg = generateUpdateMessage(notification);
		putMessage(msg);
	}

	public void startAllAgents() {
		startAllControllables(getRootComponent());
	}

	/**
	 * Traverses through the model tree starting at rootCmp and invokes the
	 * start method on all instances with the interface Controllable
	 * 
	 * @param rootCmp
	 *            component to start crawling
	 * @see Controllable
	 * @see Controllable#start()
	 */
	public static void startAllControllables(EveComponent rootCmp) {
		if (rootCmp == null)
			return;
		EList<EveComponent> children = rootCmp.getChildren();
		if (children == null)
			return;

		Iterator<EveComponent> iter = children.iterator();
		while (iter.hasNext()) {
			EveComponent cmp = iter.next();
			if (cmp instanceof IControllable) {
				logger.info("Start component UUID: " + cmp.toString());
				((IControllable) cmp).start();
			}
			startAllControllables(cmp);
		}
	}

	/**
	 * Gettr for this sessions ThreadGroup
	 * 
	 * @return
	 */
	public ThreadGroup getThreadGroup() {
		return tg;
	}

	public void stopAllAgents() {
		stopAllAgents(getRootComponent());
	}
	
	public void stopAllAgents(EveComponent rootCmp) {
		if (rootCmp == null)
			return;
		EList<EveComponent> children = rootCmp.getChildren();
		if (children == null)
			return;

		Iterator<EveComponent> iter = children.iterator();
		while (iter.hasNext()) {
			EveComponent cmp = iter.next();
			if (cmp instanceof IControllable) {
				logger.info("Stop component UUID: " + cmp.toString());
				((IControllable) cmp).stop();
			}
			startAllControllables(cmp);
		}
		
	}

	public void dispose() {
		// clean up
	}

}
