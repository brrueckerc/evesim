package org.evesim.xml;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.UUID;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.core.runtime.IProgressMonitor;
import org.evesim.EveAgent;
import org.evesim.EveConnection;
import org.evesim.EveNode;
import org.evesim.EveService;
import org.evesim.EveSimulation;
import org.evesim.EvesimFactory;
import org.evesim.usecase.semanticSearch.EveAgentSemanticSearch;
import org.evesim.usecase.semanticSearch.SemanticSearchFactory;
import org.evesim.usecase.socialNetworkAnalysis.EveEvolutionaryAgent;
import org.evesim.usecase.socialNetworkAnalysis.EveHistoryAgent;
import org.evesim.usecase.socialNetworkAnalysis.SocialNetworkAnalysisFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class EveNetworkDescriptionXMLReader extends DefaultHandler{
	private String tempString = new String();
	private EveSimulation sim = null;
	private EveNode node = null;
	private ArrayList agent_list;
	private EveAgent agent;
	private EveService service;
	private String servicePoolType = new String();
	private boolean connectionFlag = false;
	private boolean flag = false;
	private ArrayList<EveConnection> con_list = new ArrayList<EveConnection>();
	private String choosen;
	private IProgressMonitor monitor = null;

	public EveNetworkDescriptionXMLReader(String choosenOne){
		this.choosen = choosenOne;
		if(this.choosen.equals("EveAgent")){
			this.agent_list = new ArrayList<EveAgent>();
		}
		else if (this.choosen.equals("EveHistoryAgent")) {
			this.agent_list = new ArrayList<EveHistoryAgent>();
		}
		else if (this.choosen.equals("EveSemanticAgent")) {
			this.agent_list = new ArrayList<EveAgentSemanticSearch>();
		}
		else if (this.choosen.equals("EveEvolutionaryAgent")) {
			this.agent_list = new ArrayList<EveEvolutionaryAgent>();
		}
		else{
			this.agent_list = new ArrayList<EveAgent>();
		}
	}


	public EveNetworkDescriptionXMLReader(String choosenOne, IProgressMonitor monitor) {
		this.choosen = choosenOne;
		if(this.choosen.equals("EveAgent")){
			this.agent_list = new ArrayList<EveAgent>();
		}
		else if (this.choosen.equals("EveHistoryAgent")) {
			this.agent_list = new ArrayList<EveHistoryAgent>();
		}
		else if (this.choosen.equals("EveSemanticAgent")) {
			this.agent_list = new ArrayList<EveAgentSemanticSearch>();
		}
		else if (this.choosen.equals("EveEvolutionaryAgent")) {
			this.agent_list = new ArrayList<EveEvolutionaryAgent>();
		}
		else{
			this.agent_list = new ArrayList<EveAgent>();
		}
		this.monitor = monitor;
	}


	public EveSimulation getSimulationfromXML(String uri){
		this.sim = EvesimFactory.eINSTANCE.createEveSimulation();
		this.node = EvesimFactory.eINSTANCE.createEveNode();
		this.sim.addChild(node);
		this.node.setParent(sim);

		if(readXML(uri) == false || flag == false){
			System.out.println(flag);
			return null;
		}

		System.out.println(this.con_list.size());
		for (Iterator<EveConnection> iterator = con_list.iterator(); iterator.hasNext();) {
			EveConnection con = iterator.next();
			try{
				this.node.lookupComponent(UUID.nameUUIDFromBytes(removeSpaces(con.getDescription()).getBytes()));
				//System.out.println(con.getDescription());
				con.setConnectedComponent(this.node.lookupComponent(UUID.nameUUIDFromBytes(removeSpaces(con.getDescription()).getBytes())));

				//normal with the uri parsed (Agropedia uses name!!!)
				//				this.node.lookupComponent(UUID.nameUUIDFromBytes(removeSpaces(con.getParent().getName()).getBytes()));
				//				con.setParent(this.node.lookupComponent(UUID.nameUUIDFromBytes(removeSpaces(con.getParent().getName()).getBytes())));
				this.node.lookupComponent(UUID.nameUUIDFromBytes(removeSpaces(con.getParent().getUri().toString()).getBytes()));
				con.setParent(this.node.lookupComponent(UUID.nameUUIDFromBytes(removeSpaces(con.getParent().getUri().toString()).getBytes())));
			}catch (Exception e) {
				con.setParent(null);
			}
		}
		System.out.println("Return Sim");
		return sim;
	}
	public ArrayList<? extends EveAgent> getAgentsfromXML(String uri){
		if(readXML(uri) == false || flag == false){
			System.out.println(flag);
			return null;
		}
		System.out.println(flag);
		return agent_list;	
	}

	private boolean readXML(String uri){
		//get a factory
		SAXParserFactory spf = SAXParserFactory.newInstance();
		try {

			//get a new instance of parser
			SAXParser sp = spf.newSAXParser();

			//parse the file and also register this class for call backs
			sp.parse(uri, this);

		}catch(SAXException se) {
			se.printStackTrace();
			return false;
		}catch(ParserConfigurationException pce) {
			pce.printStackTrace();
			return false;
		}catch (IOException ie) {
			ie.printStackTrace();
			return false;
		}
		return true;
	}
	//Event Handlers
	public void startElement(String uri, String localName, String qName,Attributes attributes) throws SAXException {
		this.tempString="";
		try{
			if(qName.equalsIgnoreCase("NetworkDescription") || qName.equalsIgnoreCase("NetDesc")) {
				flag = true;
			}
			//agent parsed
			else if(qName.equalsIgnoreCase("node")) {
				//create a new instance of employee
				if(attributes.getValue("name") != null){
					//create the agent
					if(this.choosen.equals("EveAgent")){
						this.agent = EvesimFactory.eINSTANCE.createEveAgent();
					}
					else if (this.choosen.equals("EveHistoryAgent")) {
						this.agent = SocialNetworkAnalysisFactory.eINSTANCE.createEveHistoryAgent();
					}
					else if (this.choosen.equals("EveSemanticAgent")) {
						this.agent = SemanticSearchFactory.eINSTANCE.createEveAgentSemanticSearch();
					}
					else if (this.choosen.equals("EveEvolutionaryAgent")) {
						this.agent = SocialNetworkAnalysisFactory.eINSTANCE.createEveEvolutionaryAgent();
					}
					else{
						this.agent = EvesimFactory.eINSTANCE.createEveAgent();
					}


					//set the agent name
					if(attributes.getValue("name") != null){
						agent.setDescription(attributes.getValue("name"));
					}

					//set the description
					if(attributes.getValue("type") != null){
						agent.setDescription(attributes.getValue("type"));
					}

					//set the agents URI and remove spaces otherwise URI creation will fail
					if(attributes.getValue("uri") != null){
						agent.setUri(new URI(removeSpaces(attributes.getValue("uri"))));
						//set the UUID according to the given space free URI
						//Normal
						agent.setUuid(UUID.nameUUIDFromBytes(removeSpaces(attributes.getValue("uri")).getBytes()));
						//TODO
						//agropedia
						//agent.setUuid(UUID.nameUUIDFromBytes(removeSpaces(attributes.getValue("name")).getBytes()));
					}
					else{
						agent.setUuid(UUID.nameUUIDFromBytes(removeSpaces(attributes.getValue("name")).getBytes()));
					}
					if(attributes.getValue("timestamp") != null){
						agent.setTimeStamp(Long.decode(attributes.getValue("timestamp")));
						if(agent instanceof EveHistoryAgent){
							((EveHistoryAgent) agent).setBirthdate(new Date(agent.getTimeStamp()*1000L));
						}
					}
				}
			}
			//location parsed
			else if(qName.equalsIgnoreCase("location")){
				//parse and set the name of location
				if(attributes.getValue("name") != null){
					agent.setLocLocation(attributes.getValue("name"));
				}
				//parse and set the longitude of the location
				if(attributes.getValue("lng") != null){
					try{
						agent.setLocLongitude(Float.parseFloat(attributes.getValue("lng")));
					}
					catch (Exception e) {

					}
				}

				//parse and set the latitude of the location
				if(attributes.getValue("lat") != null){
					try{
						agent.setLocLatitude(Float.parseFloat(attributes.getValue("lat")));
					}
					catch (Exception e) {

					}

				}

			}

			//connection parsed
			else if(qName.equalsIgnoreCase("connection")){
				if(attributes.getValue("to") != null){
					//create connection
					EveConnection con = EvesimFactory.eINSTANCE.createEveConnection();

					if(attributes.getValue("type") != null){
						con.setType(attributes.getValue("type"));
					}
					con.setName("Connection to: " + new URI(removeSpaces(attributes.getValue("to"))));

					//add connected partner
					//con.setConnectedComponent(ag);
					con.setConnected(true);
					con.setDirectional(false);
					con.setDescription(attributes.getValue("to"));

					con.setParent(agent);
					//add child to agent for referencing
					//agent.addChild(con);
					//					//add connection to the connection array
					//					agent.getConnections().add(con);

					if(attributes.getValue("timestamp") != null){
						con.setTimeStamp(Long.decode(attributes.getValue("timestamp")));
					}

					if(attributes.getValue("strength") != null){
						try{
							con.setStrength(Float.parseFloat(attributes.getValue("strength")));
						}catch (Exception e) {
							con.setStrength(new Float(1));
						}
					}

					con_list.add(con);
				}
			}
			//check for service pool
			else if(qName.equalsIgnoreCase("servicePool")){
				if(attributes.getValue("type") != null){
					this.servicePoolType = attributes.getValue("type");
				}
			}
			else if(qName.equals("service")){
				this.connectionFlag = true;

				this.service = EvesimFactory.eINSTANCE.createEveService();
				if(attributes.getValue("id") != null){

				}
				if(attributes.getValue("name") != null){
					this.service.setName(this.servicePoolType + ": " + attributes.getValue("name"));
				}
				if(attributes.getValue("uri") != null){
					this.service.setName(removeSpaces(attributes.getValue("uri")));
				}
				this.agent.addChild(this.service);
				this.agent.getOfferedServices().add(this.service);

			}
			else if(qName.equals("description")){
				this.service.setDescription(tempString);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void characters(char[] ch, int start, int length) throws SAXException {
		tempString = new String(ch,start,length);
	}

	public void endElement(String uri, String localName,
			String qName) throws SAXException {
		//System.out.println(qName);
		if(qName.equalsIgnoreCase("node")) {
			//add it to the list
			if(this.agent != null){
				this.agent_list.add(this.agent);
				this.node.addChild(this.agent);
			}

		}
		else if(qName.equalsIgnoreCase("Name")){
			if(connectionFlag == false){
				this.agent.setName(tempString);
			}
			else{
				this.service.setName(this.servicePoolType + ": " + tempString);
				connectionFlag = false;
			}
		}
		else if(qName.equalsIgnoreCase("Description")){
			this.service.setDescription(tempString);
		}
		else{

		}
		if(monitor != null){
			this.monitor.worked(1);
		};
	}
	public void printData(){

		System.out.println("No of Agents '" + agent_list.size() + "'.");

		Iterator<?> it = agent_list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());

		}
	}
	public String removeSpaces(String s) {
		StringTokenizer st = new StringTokenizer(s," ",false);
		String t="";
		while (st.hasMoreElements()) t += st.nextElement();
		return t;
	}

}
