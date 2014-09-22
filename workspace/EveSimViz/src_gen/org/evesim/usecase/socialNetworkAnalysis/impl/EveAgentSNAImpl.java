/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.usecase.socialNetworkAnalysis.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.evesim.EveComponent;
import org.evesim.EveComponentRegistry;
import org.evesim.EveService;
import org.evesim.EveSimServerSession;
import org.evesim.impl.EveAgentImpl;
import org.evesim.msg.EveLogMessage;
import org.evesim.msg.EveSerializedMessage;
import org.evesim.msg.MsgFactory;
import org.evesim.timer.EveFunctionTimer;
import org.evesim.usecase.socialNetworkAnalysis.EveAgentSNA;
import org.evesim.usecase.socialNetworkAnalysis.EveGatewaySNA;
import org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisPackage;

import br.org.ipti.flypeer.trans.FlypeerResponseListener;
import br.org.ipti.flypeer.trans.xml.context.generator.SequentialFlow;
import br.org.ipti.flypeer.trans.xml.context.generator.Service;
import br.org.ipti.flypeer.trans.xml.context.generator.TransactionFlow;
import ec.util.MersenneTwister;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eve Agent SNA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.evesim.usecase.socialNetworkAnalysis.impl.EveAgentSNAImpl#getEditingPropability <em>Editing Propability</em>}</li>
 *   <li>{@link org.evesim.usecase.socialNetworkAnalysis.impl.EveAgentSNAImpl#getDeletingPropability <em>Deleting Propability</em>}</li>
 *   <li>{@link org.evesim.usecase.socialNetworkAnalysis.impl.EveAgentSNAImpl#getCreatingPropability <em>Creating Propability</em>}</li>
 *   <li>{@link org.evesim.usecase.socialNetworkAnalysis.impl.EveAgentSNAImpl#isStarted <em>Started</em>}</li>
 * </ul>
 * </p>
 *
 * @generated NOT
 */
public class EveAgentSNAImpl extends EveAgentImpl implements EveAgentSNA, FlypeerResponseListener{
	/**
	 * The default value of the '{@link #getEditingPropability() <em>Editing Propability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditingPropability()
	 * @generated
	 * @ordered
	 */
	protected static final int EDITING_PROPABILITY_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getEditingPropability() <em>Editing Propability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditingPropability()
	 * @generated
	 * @ordered
	 */
	protected int editingPropability = EDITING_PROPABILITY_EDEFAULT;
	/**
	 * The default value of the '{@link #getDeletingPropability() <em>Deleting Propability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletingPropability()
	 * @generated
	 * @ordered
	 */
	protected static final int DELETING_PROPABILITY_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getDeletingPropability() <em>Deleting Propability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeletingPropability()
	 * @generated
	 * @ordered
	 */
	protected int deletingPropability = DELETING_PROPABILITY_EDEFAULT;
	/**
	 * The default value of the '{@link #getCreatingPropability() <em>Creating Propability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatingPropability()
	 * @generated
	 * @ordered
	 */
	protected static final int CREATING_PROPABILITY_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getCreatingPropability() <em>Creating Propability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatingPropability()
	 * @generated
	 * @ordered
	 */
	protected int creatingPropability = CREATING_PROPABILITY_EDEFAULT;
	/**
	 * The default value of the '{@link #isStarted() <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStarted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STARTED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isStarted() <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStarted()
	 * @generated
	 * @ordered
	 */
	protected boolean started = STARTED_EDEFAULT;
	//private final static Logger logger = Logger.getLogger(EveAgentSNAImpl.class.getName());
	private static final long serialVersionUID = 5765006966356856167L;
	private EveGatewaySNA gateway;
	private MersenneTwister mt = new MersenneTwister();
	private HashMap<Integer,String> operations = new HashMap<Integer, String>();
	private HashMap<Integer,Long> transaction_times = new HashMap<Integer, Long>();
	private int counter = 0;
	private EveFunctionTimer timer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EveAgentSNAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <p>
	 * </p>
	 *
	 * @generated NOT
	 */
	@Override
	public void execute() {
		if(isStarted() == false){
			this.gateway = (EveGatewaySNA) this.getParent();
			if(this.gateway.isReady() == true){
				System.out.println("Agent Started");
				setStarted(true);	
			}
			EList<EveComponent> children = this.getChildren();
			Iterator<EveComponent> iter = children.iterator();

			while (iter.hasNext()) {
				EveComponent cmp = iter.next();
				if(cmp instanceof EveFunctionTimer){
					EveFunctionTimer tim = (EveFunctionTimer)cmp;
					this.timer = tim;
				}
			}
		}

		if(this.gateway.isReady() == true){
			if (demandedServices.size() > 0) {
				counter++;
				//based on the current count change the behavior
				changeBehavior();
				EveService serv = demandedServices.get(mt.nextInt(demandedServices.size()));
				String doc = serv.getName();
				if(doc != null){
					Integer op = mt.nextInt(100);
					if(op <= getCreatingPropability()){ //op < 25
						initTransaction("CREATE",doc, "Created");
						sendMessage("serial", "Agent: " + getName() + " tried CREATE: " + op);
					}
					else if(op >= getCreatingPropability() && op <= 100 - getDeletingPropability()){ //op > 25 und < 75
						initTransaction("EDIT", doc, "Edited");
						sendMessage("serial", "Agent: " + getName() + " tried EDIT: " + op);
					}
					else if(op > 100 - getDeletingPropability() ){//op > 75
						initTransaction("DELETE", doc,"Deleted");
						sendMessage("serial", "Agent: " + getName() + " tried DELETE: " + op);
					}
				}

			}
		}
		else{
			//logger.log(Level.INFO,"Gateway is not ready yet");
		}

	}

	private void changeBehavior() {
		switch (this.counter) {
		case 20:
			this.timer.setGradient((float)800);
			sendMessage("serial", "Agent: " + getName() + " changed behavior");
			break;
		case 30:
			this.timer.setGradient((float)500);
			sendMessage("serial", "Agent: " + getName() + " changed behavior");
			break;
		case 40:
			this.timer.setGradient((float)700);
			sendMessage("serial", "Agent: " + getName() + " changed behavior");
			break;
		default:
			break;
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <p>
	 * </p>
	 *
	 * @generated NOT
	 */
	private void initTransaction(String operation, String doc_name, String content) {
		TransactionFlow flow = new TransactionFlow();
		SequentialFlow seq = new SequentialFlow();
		//maybe add search here lateron
		Service dem_serv = new Service("DOCUMENT_EDITING_SERVICE");
		seq.addService(dem_serv);
		flow.setGenericFlow(seq);
		flow.addTransactionResult("result", dem_serv);
		HashMap<String, Serializable> param = new HashMap<String, Serializable>();
		param.put("session", this.getSessionID().toString());
		param.put("type", operation);
		param.put("agent", this.getName());
		param.put("document", doc_name);
		param.put("content", content);
		param.put("count", this.counter);
		param.put("timestamp", System.currentTimeMillis());
		this.gateway.getTransactionInitiator().startTransaction(param, flow, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SocialNetworkAnalysisPackage.Literals.EVE_AGENT_SNA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEditingPropability() {
		return editingPropability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setEditingPropability(int newEditingPropability) {
		int totalProp = getCreatingPropability() + getDeletingPropability() + newEditingPropability;
		if(totalProp <= 100){
			int oldEditingPropability = editingPropability;
			editingPropability = newEditingPropability;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SocialNetworkAnalysisPackage.EVE_AGENT_SNA__EDITING_PROPABILITY, oldEditingPropability, editingPropability));
		}
		else{
			newEditingPropability -= totalProp - 100;
			int oldEditingPropability = editingPropability;
			editingPropability = newEditingPropability;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SocialNetworkAnalysisPackage.EVE_AGENT_SNA__EDITING_PROPABILITY, oldEditingPropability, editingPropability));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDeletingPropability() {
		return deletingPropability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setDeletingPropability(int newDeletingPropability) {
		int totalProp = getCreatingPropability() + getEditingPropability() + newDeletingPropability;
		if(totalProp <= 100){
			int oldDeletingPropability = deletingPropability;
			deletingPropability = newDeletingPropability;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SocialNetworkAnalysisPackage.EVE_AGENT_SNA__DELETING_PROPABILITY, oldDeletingPropability, deletingPropability));
		}
		else{
			newDeletingPropability -= totalProp - 100;
			int oldDeletingPropability = deletingPropability;
			deletingPropability = newDeletingPropability;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, SocialNetworkAnalysisPackage.EVE_AGENT_SNA__DELETING_PROPABILITY, oldDeletingPropability, deletingPropability));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCreatingPropability() {
		return creatingPropability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatingPropability(int newCreatingPropability) {
		int oldCreatingPropability = creatingPropability;
		creatingPropability = newCreatingPropability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SocialNetworkAnalysisPackage.EVE_AGENT_SNA__CREATING_PROPABILITY, oldCreatingPropability, creatingPropability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStarted() {
		return started;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStarted(boolean newStarted) {
		boolean oldStarted = started;
		started = newStarted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SocialNetworkAnalysisPackage.EVE_AGENT_SNA__STARTED, oldStarted, started));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SocialNetworkAnalysisPackage.EVE_AGENT_SNA__EDITING_PROPABILITY:
			return getEditingPropability();
		case SocialNetworkAnalysisPackage.EVE_AGENT_SNA__DELETING_PROPABILITY:
			return getDeletingPropability();
		case SocialNetworkAnalysisPackage.EVE_AGENT_SNA__CREATING_PROPABILITY:
			return getCreatingPropability();
		case SocialNetworkAnalysisPackage.EVE_AGENT_SNA__STARTED:
			return isStarted();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SocialNetworkAnalysisPackage.EVE_AGENT_SNA__EDITING_PROPABILITY:
			setEditingPropability((Integer)newValue);
			return;
		case SocialNetworkAnalysisPackage.EVE_AGENT_SNA__DELETING_PROPABILITY:
			setDeletingPropability((Integer)newValue);
			return;
		case SocialNetworkAnalysisPackage.EVE_AGENT_SNA__CREATING_PROPABILITY:
			setCreatingPropability((Integer)newValue);
			return;
		case SocialNetworkAnalysisPackage.EVE_AGENT_SNA__STARTED:
			setStarted((Boolean)newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SocialNetworkAnalysisPackage.EVE_AGENT_SNA__EDITING_PROPABILITY:
			setEditingPropability(EDITING_PROPABILITY_EDEFAULT);
			return;
		case SocialNetworkAnalysisPackage.EVE_AGENT_SNA__DELETING_PROPABILITY:
			setDeletingPropability(DELETING_PROPABILITY_EDEFAULT);
			return;
		case SocialNetworkAnalysisPackage.EVE_AGENT_SNA__CREATING_PROPABILITY:
			setCreatingPropability(CREATING_PROPABILITY_EDEFAULT);
			return;
		case SocialNetworkAnalysisPackage.EVE_AGENT_SNA__STARTED:
			setStarted(STARTED_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SocialNetworkAnalysisPackage.EVE_AGENT_SNA__EDITING_PROPABILITY:
			return editingPropability != EDITING_PROPABILITY_EDEFAULT;
		case SocialNetworkAnalysisPackage.EVE_AGENT_SNA__DELETING_PROPABILITY:
			return deletingPropability != DELETING_PROPABILITY_EDEFAULT;
		case SocialNetworkAnalysisPackage.EVE_AGENT_SNA__CREATING_PROPABILITY:
			return creatingPropability != CREATING_PROPABILITY_EDEFAULT;
		case SocialNetworkAnalysisPackage.EVE_AGENT_SNA__STARTED:
			return started != STARTED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (editingPropability: ");
		result.append(editingPropability);
		result.append(", deletingPropability: ");
		result.append(deletingPropability);
		result.append(", creatingPropability: ");
		result.append(creatingPropability);
		result.append(", started: ");
		result.append(started);
		result.append(')');
		return result.toString();
	}

	@Override
	public void processFail(Map<String, Exception> arg0) {
		logger.log(Level.SEVERE,this.getName() + " received a fail in a transaction");

	}

	@Override
	public void processResponse(Map<String, Serializable> params) {
		String response  = (String)params.get("result");

		String[] service_params = response.split(",");
		String result = service_params[0];
		Long timestamp = Long.valueOf(service_params[1]);
		Integer count = Integer.valueOf(service_params[2]);
		Long time = System.currentTimeMillis() - timestamp;

		this.operations.put(count,result);
		this.transaction_times.put(count,time);

		sendMessage("serial", "Agent " + this.getName() + " has received " + service_params [0] + " with the transaction time " + service_params[1]);
		sendMessage("serial", operations.toString());
		sendMessage("serial", transaction_times.toString());

		System.out.println("Agent " + this.getName() + " has received " + service_params [0] + " with the transaction time " + time);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private void sendMessage(String type, String message) {
		EveSimServerSession session = EveComponentRegistry.getInstance().getSession(this.getSessionID());
		//send as an EveLogMessage
		if(type.equals("log")){
			EveLogMessage msg = MsgFactory.eINSTANCE.createEveLogMessage();
			msg.setSenderUUID(this.getUuid());
			msg.setMessage(message);
			msg.setTimestamp(System.currentTimeMillis());
			session.putMessage(msg);
		}
		//send as EveSerializedMessage
		else if(type.equals("serial")){
			EveSerializedMessage msg = MsgFactory.eINSTANCE.createEveSerializedMessage();
			msg.setSenderUUID(this.getUuid());
			msg.setPayload(message);
			msg.setTimestamp(System.currentTimeMillis());
			session.putMessage(msg);
		}
		else{
			//for other messages
		}
	}
} //EveAgentSNAImpl
