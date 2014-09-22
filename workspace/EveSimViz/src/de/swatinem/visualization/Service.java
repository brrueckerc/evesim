package de.swatinem.visualization;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.servlet.Context;
import org.mortbay.jetty.servlet.ServletHolder;

public class Service
{
	/**
	 * Stuff that has to do with the Jetty webserver
	 */
    final static int SERVER_PORT = 10223;
    final static Logger logger = Logger.getLogger(Service.class.getName());
    private Server mServer;

    /**
	 * The Root instance which is bound to this Service and that
	 * is tracked for changes
	 */
	Root mRoot;

	/**
	 * Represents a Change to the Model
	 * @author swatinem
	 *
	 */
	static class Change {
		public enum Type {
			CREATE,
			UPDATE,
			DELETE
		}
		public Type type;
		public Component component;
		public Change(Type aType, Component aComponent)
		{
			type = aType;
			component = aComponent;
		}
	}
	/**
	 * Lists all the Changes since the last Update
	 * needs to be package-private so the Server can access it directly
	 */
	List<Change> mChanges = new LinkedList<Change>();

	/**
	 * This is the singleton instance
	 */
	public static Service instance = new Service();
	
	private Service()
	{
		// copied from @author reder
        mServer = new Server(SERVER_PORT);
        Context root = new Context(mServer, "/", Context.SESSIONS);
        root.addServlet(new ServletHolder(new StaticServer()), "/default/*");
        root.addServlet(new ServletHolder(new KmlServer()), "/kml/*");
	}
	
	public void startup() {
        try {
            mServer.start();
        } catch (Exception ex) {
            logger.log(Level.SEVERE, "Embedded webserver could not be started. Visualisations may not work.", ex);
        }		
	}

    public void shutdown() {
        try {
            mServer.stop();
        } catch (Exception ex) {
            logger.log(Level.SEVERE, "Error while shutting down embedded web server.", ex);
        }
    }
    
    private void addChange(Notification aNot)
    {
    	if(aNot.getNotifier() instanceof Root && aNot.getEventType() == Notification.ADD)
    	{
			// lets hope the EMF List does not allow adding the same object again
			mChanges.add(new Change(Change.Type.CREATE, (Component) aNot.getNewValue()));
			// TODO: catch the case that a Connection is added without referencing a valid Node
    	}
    	else if(aNot.getNotifier() instanceof Component)
    	{
    		Component com = null;
    		Iterator<Change> it = null;
    		switch(aNot.getEventType())
    		{
    		case Notification.SET:
    			// Ignore the update if there is already a previous update or create for
    			// the same Component. Do not add irrelevant redundancy in that case
    			com = (Component) aNot.getNotifier();
    			String attr = ((EAttribute)aNot.getFeature()).getName();
    			if(attr.equals("longitude") || attr.equals("latitude"))
    			{
    				Node n = (Node)com;
        			// the coordinates of a node have changed, make sure to generate a update
        			// for every dependent connection as well
    				for(Component comp : mRoot.getChildren())
    				{
    					if(!(comp instanceof Connection))
    						continue;
    					Connection con = (Connection)comp;
    					if(con != null && (con.getPoint1() == n || con.getPoint2() == n))
    					{
    						// add a change event for the connection if there isnt one already
    		    			it = mChanges.iterator();
    		    			boolean add = true;
    		    			while(it.hasNext())
    		    			{
    		    				Change c = it.next();
    		    				if(c.component.getUuid().equals(con.getUuid()))
    		    				{
    		    					if(c.type == Change.Type.CREATE || c.type == Change.Type.UPDATE)
    		    					{
    		    						add = false;
    		    						break;
    		    					}
    		    				}
    		    			}
    		    			if(add)
    		    				mChanges.add(new Change(Change.Type.UPDATE, con));
    					}	
    				}
    			}
    			it = mChanges.iterator();
    			while(it.hasNext())
    			{
    				Change c = it.next();
    				if(c.component.getUuid().equals(com.getUuid()))
    				{
    					if(c.type == Change.Type.CREATE || c.type == Change.Type.UPDATE)
    						return;
    				}
    			}
        		mChanges.add(new Change(Change.Type.UPDATE, com));
    			break;
    		case Notification.REMOVING_ADAPTER:
    			// If we delete a component, remove every change queued for it.
    			// If there is a queued create for the same element, do not add the delete
    			// to the change queue either
    			com = (Component) aNot.getNotifier();
    			boolean skipDelete = false;
    			it = mChanges.iterator();
    			while(it.hasNext())
    			{
    				Change c = it.next();
    				if(c.component.getUuid().equals(com.getUuid()))
    				{
    					if(c.type == Change.Type.CREATE)
    						skipDelete = true;
    					it.remove();
    				}
    			}
    			if(!skipDelete)
    				mChanges.add(new Change(Change.Type.DELETE, com));
    			if(com instanceof Node)
    			{
    				Node n = (Node)com;
    				Iterator<Component> it2 = mRoot.getChildren().iterator();
    				while(it2.hasNext())
    				{
    					Component com2 = it2.next();
    					if(!(com2 instanceof Connection))
    						continue;
    					Connection con = (Connection)com2;
    					if(con.getPoint1() == n || con.getPoint2() == n)
    						it2.remove();
    				}
    			}
    			break;
    		}
    	}
    }

	/**
	 * This binds aRoot to the Service.
	 * The Service will track all the changes in aRoots children after binding it. 
	 * @param aRoot
	 */
	public void bindRoot(Root aRoot)
	{
		if(mRoot != null)
			mRoot.eAdapters().clear();
		mRoot = aRoot;
		mChanges.clear();
		EContentAdapter adapter = new EContentAdapter() {
			public void notifyChanged(Notification notification) {
				super.notifyChanged(notification);
				addChange(notification);
			}
		};
		mRoot.eAdapters().add(adapter);
	}
}
