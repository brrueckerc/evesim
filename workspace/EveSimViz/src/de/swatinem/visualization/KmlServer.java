package de.swatinem.visualization;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.micromata.opengis.kml.v_2_2_0.Change;
import de.micromata.opengis.kml.v_2_2_0.Create;
import de.micromata.opengis.kml.v_2_2_0.Delete;
import de.micromata.opengis.kml.v_2_2_0.Document;
import de.micromata.opengis.kml.v_2_2_0.Kml;
import de.micromata.opengis.kml.v_2_2_0.KmlFactory;
import de.micromata.opengis.kml.v_2_2_0.NetworkLinkControl;
import de.micromata.opengis.kml.v_2_2_0.Placemark;

class KmlServer extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -211651321171307982L;
	private static final boolean useLib = false; 
	Root mLastRoot = null;
	
	private void updateLib(HttpServletResponse response, String aUrl) throws FileNotFoundException, IOException
	{
		Kml kml = KmlFactory.createKml();
    	LinkedList<Object> list = new LinkedList<Object>();
    	NetworkLinkControl link = kml.createAndSetNetworkLinkControl().withMaxSessionLength(-1);

    	for(Service.Change c : Service.instance.mChanges)
        {
        	switch(c.type)
        	{
        	case CREATE:
    			Create create = KmlFactory.createCreate();
    			Document doc = create.createAndAddDocument().withTargetId("doc");
        		if(c.component instanceof Node)
        		{
        			Node n = (Node) c.component;
        			doc.createAndAddPlacemark()
        				.withId(n.getUuid().toString())
        				.withName(n.getTitle())
        				.withDescription(n.getDescription())
        				.createAndSetPoint()
        					.addToCoordinates(n.getLongitude(), n.getLatitude());
        		}
        		else if(c.component instanceof Connection)
        		{
        			Connection con = (Connection) c.component;
        			doc.createAndAddPlacemark()
	    				.withId(con.getUuid().toString())
	    				.createAndSetLineString()
	    					.withExtrude(true)
	    					.withTessellate(true)
	        				.addToCoordinates(con.getPoint1().getLongitude(), con.getPoint1().getLatitude())
	        				.addToCoordinates(con.getPoint2().getLongitude(), con.getPoint2().getLatitude());
        		}
        		list.add(create);
        		break;
        	case UPDATE:
        		Change change = KmlFactory.createChange();
        		if(c.component instanceof Node)
        		{
        			Node n = (Node) c.component;
        			Placemark p = KmlFactory.createPlacemark()
        				.withTargetId(n.getUuid().toString())
        				.withName(n.getTitle())
        				.withDescription(n.getDescription());
        			p.createAndSetPoint()
        				.addToCoordinates(n.getLongitude(), n.getLatitude());
        			change.addToAbstractObject(p);
        		}
        		else if(c.component instanceof Connection)
        		{
        			Connection con = (Connection) c.component;
        			Placemark p = KmlFactory.createPlacemark()
	    				.withId(con.getUuid().toString());
	    			p.createAndSetLineString()
    					.withExtrude(true)
    					.withTessellate(true)
        				.addToCoordinates(con.getPoint1().getLongitude(), con.getPoint1().getLatitude())
        				.addToCoordinates(con.getPoint2().getLongitude(), con.getPoint2().getLatitude());
           			change.addToAbstractObject(p);
        		}
        		list.add(change);
        		break;
        	case DELETE:
        		Delete d = KmlFactory.createDelete();
        		d.createAndAddPlacemark().withTargetId(c.component.getUuid().toString());
        		list.add(d);
        		break;
        	}
        }

    	link.createAndSetUpdate(aUrl, list);    	
    	
    	kml.marshal(response.getOutputStream());
	}
	private void fullLib(HttpServletResponse response) throws FileNotFoundException, IOException
	{
		Kml kml = KmlFactory.createKml();
		Document doc = kml.createAndSetDocument().withId("doc");
		for(Component c : mLastRoot.getChildren())
		{
			if(c instanceof Node)
			{
    			Node n = (Node) c;
				doc.createAndAddPlacemark()
    				.withId(n.getUuid().toString())
    				.withName(n.getTitle())
    				.withDescription(n.getDescription())
    				.createAndSetPoint()
    					.addToCoordinates(n.getLongitude(), n.getLatitude());
			}
			else if(c instanceof Connection)
			{
    			Connection con = (Connection) c;
    			doc.createAndAddPlacemark()
    				.withId(con.getUuid().toString())
    				.createAndSetLineString()
    					.withExtrude(true)
    					.withTessellate(true)
        				.addToCoordinates(con.getPoint1().getLongitude(), con.getPoint1().getLatitude())
        				.addToCoordinates(con.getPoint2().getLongitude(), con.getPoint2().getLatitude());

			}
		}
		kml.marshal(response.getOutputStream());		
	}

	private void updateManual(HttpServletResponse response, String aUrl) throws IOException
	{
		response.setContentType("application/xml");
		response.setStatus(HttpServletResponse.SC_OK);
        PrintWriter w = response.getWriter();
        // Java could REALLY use some verbatim strings
        w.print("<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
        		+"<kml xmlns=\"http://www.opengis.net/kml/2.2\">"
        		+"<NetworkLinkControl>"
        		+"<Update>"
        		+"<targetHref>"+aUrl+"</targetHref>");
    	for(Service.Change c : Service.instance.mChanges)
        {
        	switch(c.type)
        	{
        	case CREATE:
        		w.print("<Create><Document targetId=\"doc\">");
        		if(c.component instanceof Node)
        		{
        			Node n = (Node) c.component;
        			w.print("<Placemark id=\""+n.getUuid().toString()+"\">"
    						+"<name>"+n.getTitle()+"</name>"
    						+"<description><![CDATA["+n.getDescription()+"]]></description>"
    						+"<Point>"
    						+"<coordinates>"+n.getLongitude()+","+n.getLatitude()+",0</coordinates>"
    						+"</Point>"
    						+"</Placemark>");
        		}
        		else if(c.component instanceof Connection)
        		{
        			Connection con = (Connection) c.component;
    				w.print("<Placemark id=\""+con.getUuid().toString()+"\">"
    						+"<LineString>"
    						+"    <extrude>1</extrude>"
    						+"    <tessellate>1</tessellate>"
    						+"    <coordinates>"+con.getPoint1().getLongitude()+","+con.getPoint1().getLatitude()+",0 "+con.getPoint2().getLongitude()+","+con.getPoint2().getLatitude()+",0"
    						+"    </coordinates>"
    						+"  </LineString>"
    						+"</Placemark>");
        		}
        		w.print("</Document></Create>");
        		break;
        	case UPDATE:
        		w.print("<Change>");
        		if(c.component instanceof Node)
        		{
        			Node n = (Node) c.component;
        			w.print("<Placemark targetId=\""+n.getUuid().toString()+"\">"
    						+"<name>"+n.getTitle()+"</name>"
    						+"<description><![CDATA["+n.getDescription()+"]]></description>"
    						+"<Point>"
    						+"<coordinates>"+n.getLongitude()+","+n.getLatitude()+",0</coordinates>"
    						+"</Point>"
    						+"</Placemark>");
        		}
        		else if(c.component instanceof Connection)
        		{
        			Connection con = (Connection) c.component;
    				w.print("<Placemark targetId=\""+con.getUuid().toString()+"\">"
    						+"<LineString>"
    						+"    <extrude>1</extrude>"
    						+"    <tessellate>1</tessellate>"
    						+"    <coordinates>"+con.getPoint1().getLongitude()+","+con.getPoint1().getLatitude()+",0 "+con.getPoint2().getLongitude()+","+con.getPoint2().getLatitude()+",0"
    						+"    </coordinates>"
    						+"  </LineString>"
    						+"</Placemark>");
        		}
        		w.print("</Change>");
        		break;
        	case DELETE:
        		w.print("<Delete><Placemark targetId=\""+c.component.getUuid().toString()+"\"></Placemark></Delete>");
        		break;
        	}
        }		
    	w.print("  </Update>"
    			+"</NetworkLinkControl>"
    			+"</kml>");
	}
	private void fullManual(HttpServletResponse response) throws IOException
	{
		response.setContentType("application/xml");
		response.setStatus(HttpServletResponse.SC_OK);
        PrintWriter w = response.getWriter();
        // Java could REALLY use some verbatim strings
        w.print("<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
			+"<kml xmlns=\"http://www.opengis.net/kml/2.2\">"
			+"<Document id=\"doc\">");
		for(Component c : mLastRoot.getChildren())
		{
			if(c instanceof Node)
			{
				Node n = (Node)c;
				w.print("<Placemark id=\""+n.getUuid().toString()+"\">"
						+"<name>"+n.getTitle()+"</name>"
						+"<description><![CDATA["+n.getDescription()+"]]></description>"
						+"<Point>"
						+"<coordinates>"+n.getLongitude()+","+n.getLatitude()+",0</coordinates>"
						+"</Point>"
						+"</Placemark>");
			}
			else if(c instanceof Connection)
			{
				Connection con = (Connection)c;
				w.print("<Placemark id=\""+con.getUuid().toString()+"\">"
						+"<LineString>"
						+"    <extrude>1</extrude>"
						+"    <tessellate>1</tessellate>"
						+"    <coordinates>"+con.getPoint1().getLongitude()+","+con.getPoint1().getLatitude()+",0 "+con.getPoint2().getLongitude()+","+con.getPoint2().getLatitude()+",0"
						+"    </coordinates>"
						+"  </LineString>"
						+"</Placemark>");
			}
		}
		w.print("</Document></kml>");
	}

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// if the doc is loaded first, create a document with everything in it
		// that can be used as update target
    	if(mLastRoot != Service.instance.mRoot)
    	{
    		mLastRoot = Service.instance.mRoot;
    		if(useLib)
    			fullLib(response);
    		else
    			fullManual(response);

    		Service.instance.mChanges.clear();
    		return;
    	}
    	String url = request.getRequestURL().toString();
    	
		if(useLib)
			updateLib(response, url);
		else
			updateManual(response, url);    	

        Service.instance.mChanges.clear();
    }
}
