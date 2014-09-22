package org.evesim;


/**
 * The Session Thread Group shall be used for all threads running in one thread group for two reasons.
 * Firstly, using the thread group, the sessions threads can be identified. And secondly, all uncaught Exceptions
 * are handled by the ThreadGroups uncaughtException handler and then are sent back to the session initiator.
 * @author reder
 *
 */
public class EveSimThreadGroup extends ThreadGroup {
	
	/**
	 * Reference to this thread groups session
	 */
	private EveSimServerSession eveSession;

	public EveSimThreadGroup(String name, EveSimServerSession eveSession) {
		super(name);
		this.eveSession = eveSession;
	}

	/* (non-Javadoc)
	 * @see java.lang.ThreadGroup#uncaughtException(java.lang.Thread, java.lang.Throwable)
	 */
	@Override
	public void uncaughtException(Thread t, Throwable e) {		
		eveSession.anonymousException(t.getName(), e);
	}
	
	

}
