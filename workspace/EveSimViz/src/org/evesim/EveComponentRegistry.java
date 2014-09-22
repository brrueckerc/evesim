package org.evesim;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.UUID;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.EList;
import org.evesim.msg.MsgPackage;


/**
 * Used to register and lookup EveComponents and EveSessions.
 * 
 * @author reder
 *
 */
public class EveComponentRegistry {
	
	protected transient Logger logger = Logger.getLogger(EveComponentRegistry.class.getName());

	/**
	 * Singleton instance
	 */
	private transient static EveComponentRegistry instance = null;
	
	/**
	 * Registry of all sessions 
	 * @see #getSession(UUID)
	 */
	private transient Hashtable<UUID, EveSimServerSession> sessions;	

	/**
	 * Registry of all nodes
	 * @see #crawl(EveComponent)
	 * @see #lookupNode(EveComponent, UUID)
	 */
	private transient Hashtable<UUID, EveComponent> reg;

	/**
	 * 
	 * @return Singleton instance of EveComponentRegistry
	 */
	public static EveComponentRegistry getInstance() {
		if (instance == null) {
			instance = new EveComponentRegistry();
		}
		return instance;
	}
	
	protected EveComponentRegistry() {
		MsgPackage.eINSTANCE.eClass();
		
		sessions = new Hashtable<UUID, EveSimServerSession>();
		reg = new Hashtable<UUID, EveComponent>();
	}

	/**
	 * 
	 * @param sid
	 * @return Session belonging to session with id sid
	 */
	public EveSimServerSession getSession(UUID sid) {
		if (!sessions.containsKey(sid)) {
			sessions.put(sid, new EveSimServerSession(sid));
		}
		return sessions.get(sid);
	}

	/**
	 * Returns the root component belonging to the provided component. 
	 * Recursively invokes lookupRootComponent until getParent returns null 
	 * @param cmp initial component
	 * @return root component
	 */
	protected EveComponent lookupRootComponent(EveComponent cmp) {
		return cmp.getRootComponent();
	}

	/**
	 * Crawls the complete component tree where cmp is a part of and registers the 
	 * components with their id in this class'es lookup table
	 * @param cmp
	 * @see #lookupRootComponent(EveComponent)
	 */
	protected void crawl(EveComponent cmp) {
		//EveComponent root = lookupRootComponent(cmp);

		reg.put(cmp.getUuid(), cmp);

		EList<EveComponent> children = cmp.getChildren();

		if (children == null || children.isEmpty())
			return;

		Iterator<EveComponent> iter = children.iterator();
		while (iter.hasNext()) {
			EveComponent child = iter.next();
			crawl(child);
		}
	}

	/**
	 * Searches the registry for the specified node id. 
	 * If the node is not in the registry, the provided component is used as 
	 * an enty point to crawl its complete component tree. If, after the new indexing,
	 * the component is still not available, an exception is thrown.
	 * 
	 * @param cmp some node for indexing
	 * @param nodeID
	 * @return component to search
	 * @see #crawl(EveComponent)
	 */
	public EveComponent lookupNode(EveComponent cmp, UUID nodeID) {
		if (!reg.containsKey(nodeID)) {
			crawl(lookupRootComponent(cmp));
			if (!reg.containsKey(nodeID)) {
				throw new RuntimeException("Node not found: " + nodeID);
			}
		}
		return reg.get(nodeID);
	}

}
