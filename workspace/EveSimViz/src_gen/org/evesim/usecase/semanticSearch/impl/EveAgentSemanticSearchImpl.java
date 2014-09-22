/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.usecase.semanticSearch.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EClass;
import org.evesim.EveComponentRegistry;
import org.evesim.EveConnection;
import org.evesim.EveService;
import org.evesim.EveSimServerSession;
import org.evesim.EvesimFactory;
import org.evesim.impl.EveAgentImpl;
import org.evesim.msg.EveDataMessage;
import org.evesim.msg.EveLogMessage;
import org.evesim.msg.EveSerializedMessage;
import org.evesim.msg.MsgFactory;
import org.evesim.usecase.semanticSearch.EveAgentSemanticSearch;
import org.evesim.usecase.semanticSearch.SemanticSearchFactory;
import org.evesim.usecase.semanticSearch.SemanticSearchPackage;
import org.evesim.usecase.services.EveFitness;
import org.evesim.usecase.services.EveSearchAttributes;
import org.evesim.usecase.services.EveSemanticSearchServiceClass;

import br.org.ipti.flypeer.trans.xml.context.generator.SequentialFlow;
import br.org.ipti.flypeer.trans.xml.context.generator.Service;
import br.org.ipti.flypeer.trans.xml.context.generator.TransactionFlow;
import ec.util.MersenneTwister;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eve Agent Semantic Search</b></em>'.
 * It is used to handle and simulate the semantic search use case.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated NOT
 */
@SuppressWarnings("serial")

public class EveAgentSemanticSearchImpl extends EveAgentImpl implements EveAgentSemanticSearch {

	//is the agent started
	private boolean started = false;
	//demanded services with the best fitting founded services
	private HashMap<EveService, EveFitness> foundedServices = new HashMap<EveService, EveFitness>();
	//logger for the class
	private final static Logger logger = Logger.getLogger(EveAgentSemanticSearch.class.getName());
	//Mersenne Twister for random numbers
	private MersenneTwister mt = new MersenneTwister();
	//the service from the demanded services that is currently demanded
	private	EveService demandedService = null;
	//search ID for the specific search
	private Long searchID;
	//wrapper class that contains the searched service, the searching peer and the search ID
	private EveSearchAttributes sAttributes;
	//search counter
	private int countSearches = 0;
	private long meanTransactionTime = 0;
	private long longestTransactionTime = 0;
	private long shortestTransactionTime = 0;
	private long totalTransactionTime = 0;
	private HashMap<Integer,Long> times = new HashMap<Integer, Long>();
	//option flags
	//broadcast search is implemented
	private boolean broadcastSearch = true;
	private boolean dfsSearch = false;
	private boolean bfsSearch = false;

	private EveSemanticSearchServiceClass sem_search = new EveSemanticSearchServiceClass();
	ArrayList<String> result_list = new ArrayList<String>();
	ArrayList<String> offered_list = new ArrayList<String>();
	boolean init = false;




	/**
	 * <!-- begin-user-doc -->
	 * Eve Agent Semantic Search Constructor
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected EveAgentSemanticSearchImpl() {
		super();
		//set default name
		this.setName("DefaultSemanticAgent");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SemanticSearchPackage.Literals.EVE_AGENT_SEMANTIC_SEARCH;
	}
	/**
	 * <!-- begin-user-doc -->
	 * The execute method is called by the child timer of the agent to invoke the agents task
	 * 
	 * <!-- end-user-doc -->
	 * <p>
	 * </p>
	 *
	 * @generated NOT
	 */
	@Override
	public void execute() {
		if(init == false){
			for (Iterator<EveService> iterator = this.getOfferedServices().iterator(); iterator.hasNext();) {
				EveService ser = (EveService) iterator.next();
				this.offered_list.add(ser.getName());
			}
			startSearch();
			logger.log(Level.INFO,"Initialised Semantic Agent: " + getName());
		}
		else{
			startSearch();
			logger.log(Level.INFO,"Executed Semantic Agent: " + getName());
		}		
	}
	/**
	 * <!-- begin-user-doc -->
	 * In order to communicate with the EveSim infrastructure the agent has to send status or update messages to the GUI which
	 * can be achieved using the EveSim communication via the session
	 * <!-- end-user-doc -->
	 * <p>
	 * </p>
	 *
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	private void sendMessage(String type, Object message) {
		EveSimServerSession session = EveComponentRegistry.getInstance().getSession(this.getSessionID());
		//send as an EveLogMessage
		if(type.equals("log")){
			EveLogMessage msg = MsgFactory.eINSTANCE.createEveLogMessage();
			msg.setSenderUUID(this.getUuid());
			msg.setMessage((String)message);
			msg.setTimestamp(System.currentTimeMillis());
			session.putMessage(msg);
		}
		//send as EveSerializedMessage
		else if(type.equals("serial")){
			EveSerializedMessage msg = MsgFactory.eINSTANCE.createEveSerializedMessage();
			msg.setSenderUUID(this.getUuid());
			msg.setPayload((String)message);
			msg.setTimestamp(System.currentTimeMillis());
			session.putMessage(msg);
		}
		else if(type.equals("data")){
			EveDataMessage msg = MsgFactory.eINSTANCE.createEveDataMessage();
			msg.setSenderUUID(this.getUuid());
			HashMap<String, Serializable> map = (HashMap<String, Serializable>) message;
			for(String key : map.keySet()) {
			    Serializable value = map.get(key);
			    msg.getHashtable().put(key, value);
			}
			msg.setTimestamp(System.currentTimeMillis());
			session.putMessage(msg);			

		}
		else{
			//for other messages
		}
	}
	/**
	 * <!-- begin-user-doc -->
	 * The agent starts searching by randomly choosing a demanded service it wants to search wrapping it 
	 * and calling the flagged search method
	 * <!-- end-user-doc -->
	 * <p>
	 * </p>
	 *
	 * @generated NOT
	 */
	public void startSearch() {
		logger.log(Level.INFO, "SearchAgent: " + this.getName() + " started searching.");
		//check the demanded services
		if (demandedServices.size() > 0) {
			//randomly choose a service
			demandedService = demandedServices.get(mt.nextInt(demandedServices.size()));
			//generate search ID
			searchID = new Date().getTime();
			//generate the search attributes wrapper object
			sAttributes = new EveSearchAttributes(this.searchID, this,
					demandedService);
			this.countSearches++;
			//System.out.println(this.getCountSearches());

			//start the search with the flagged search mode} 
			if (this.broadcastSearch == true) {
				this.doSearchBroadcast(sAttributes);
			}
			else if (this.dfsSearch == true) {
				this.startSearchDFS(sAttributes);

			} else if (this.bfsSearch == true){
				this.doSearchBFS(sAttributes);
			}
			else{

			}
		}
	}

	private void doSearchBFS(EveSearchAttributes sAttributes) {
		//NOT IMPLEMENTED
	}
	private void startSearchDFS(EveSearchAttributes sAttributes) {
		//NOT IMPLEMENTED
	}
	/**
	 * <!-- begin-user-doc -->
	 * The search broadcast just calls an unspecified service in broadcast to search for the demanded document
	 * <!-- end-user-doc -->
	 * <p>
	 * </p>
	 *
	 * @generated NOT
	 */
	private void doSearchBroadcast(EveSearchAttributes sAttributes) {
		EveConnection target_connection = this.getConnections().get(mt.nextInt(this.getConnections().size()));
		EveAgentSemanticSearch target_agent = (EveAgentSemanticSearch) target_connection.getConnectedComponent();
		EveFitness res = target_agent.doSemanticSearch(sAttributes);
		logger.log(Level.INFO,"Semantic Agent searched " + sAttributes.getDemandedService().getName() +" and found " + res.getResult().getName());
		HashMap<String, Serializable> data = new HashMap<String, Serializable>();
		data.put("SearchID",sAttributes.getSearchID().toString());
		data.put("SearchingAgent",sAttributes.getDemandingAgent().getName());
		data.put("SearchedService", sAttributes.getDemandedService().getName());
		data.put("FoundedService", res.getResult().getName());
		data.put("Ranking", res.getRanking());
		sendMessage("data", data);

	}
	/**
	 * <!-- begin-user-doc -->
	 * Now the the search is wrapped into a Flypeer transaction to transfer the request to a Flypeer service 
	 * Flypeer only calls one searched service per transaction so the broadcast is only transfered to one service currently.
	 * Probably there will be a solution, e.g. 1) one service per agent "FLYPEER-DOCUMENTS-ON-OFFER+AgentName"
	 * 2) register that documents offered at the service and receive the request of others that need the documents
	 * <!-- end-user-doc -->
	 * <p>
	 * </p>
	 *
	 * @generated NOT
	 */
	private void startFlypeerSearch(EveSearchAttributes sAttributes) {
		//generate the service flow
		SequentialFlow seq_flow = new SequentialFlow();
		//specify the called service
		Service service = new Service("FLYPEER-DOCUMENTS-ON-OFFER");
		//add the service to the flow
		seq_flow.addService(service);

		//Embed the service flow in a transaction
		TransactionFlow gen_flow = new TransactionFlow();
		//add the specified result to the transaction flow
		//gen_flow.addTransactionResult("returnService", service);

		//gen_flow.addDependency("returnService", service);

		//set the sequential flow as the generic flow of the transaction
		gen_flow.setGenericFlow(seq_flow);

		//generate parameters
		HashMap<String, Serializable> param = new HashMap<String, Serializable>();
		//param.put("demandedService", sAttributes.toString());
		param.put("demandedService", sAttributes.getDemandedService().getName());
		param.put("startTimeStamp", System.currentTimeMillis());
		param.put("searchCount", this.getCountSearches());

		//start transaction set the class as response listener to receive the answers

	}
	@Override
	public EveFitness doSemanticSearch(EveSearchAttributes sAttributes) {
		this.sem_search = new EveSemanticSearchServiceClass();
		result_list = this.sem_search.doSearch(this.offered_list, sAttributes.getDemandedService().getName());
		EveFitness best_fit = getbestFitness(result_list);
		return best_fit;

	}
	private EveFitness getbestFitness(ArrayList<String> fit) {
		EveFitness result = null;
		for (int i = 0; i < fit.size(); i++){
			if(i == 0){
				String[] params = fit.get(i).split(",");
				EveService ser = EvesimFactory.eINSTANCE.createEveService();
				ser.setName(params[0]);
				result = new EveFitness(ser,new Float(params[1]));
			}
			else{
				String[] params = fit.get(i).split(",");
				EveService ser = EvesimFactory.eINSTANCE.createEveService();
				ser.setName(params[0]);
				if(result.getRanking() < new Float(params[1])){
					result = new EveFitness(ser,new Float(params[1]));
				}
			}
		}
		return result;
	}
	/**
	 * <!-- begin-user-doc -->
	 * Return the founded service to the EveSim GUI
	 * <!-- end-user-doc -->
	 * <p>
	 * </p>
	 * @param count 
	 *
	 * @generated NOT
	 */
	private void returnResults(EveFitness fit_service, EveService eveService, Integer count) {
		//return founded service as a serial message to the simulation
		sendMessage("serial" , "Search Nr." + this.countSearches + ", MeanTransactionTime: " + meanTransactionTime + ", Max: " + longestTransactionTime + ", Min: " + shortestTransactionTime + " Agent: [" + this.getName() + "] has found: [" + fit_service.getResult().getName() + "] with ranking: [" + fit_service.getRanking() +"] + for the DemandedService: ["+eveService.getName()+"]");
		sendMessage("serial", this.getTimes().toString());
	}
	/**
	 * <!-- begin-user-doc -->
	 * When a service is found it is stored and in order to only store the highest ranked services the method has to 
	 * compare the rankings and store the best ranked service
	 * <!-- end-user-doc -->
	 * <p>
	 * </p>
	 * @param count 
	 *
	 * @generated NOT
	 */
	private void addFoundedandUsedService(EveFitness result, EveService eveService, Integer count) {
		if(this.foundedServices.size() != 0){
			if(this.foundedServices.containsKey(eveService) && this.foundedServices.get(eveService).getRanking() < result.getRanking()){
				this.foundedServices.put(eveService, result);
			}
		}
		else{
			this.foundedServices.put(eveService, result);
		}
		returnResults(result,eveService,count);
	}
	/**
	 * <!-- begin-user-doc -->
	 * As Flypeer is currently limited to simple type parameters the service response has to be parsed back into complex types.
	 * The service return string contains "NameOfTheFoundedService,Ranking,NameOfTheSearchedService". In order to store them the 
	 * complex types are recreated and filled with the information.
	 * <!-- end-user-doc -->
	 * <p>
	 * </p>
	 *
	 * @generated NOT
	 */
	private void processSearchResults(Map<String, Serializable> responses) {
		//get response
		String foundedServiceString = (String)responses.get("returnService");
		//split by ','
		String[] service_params = foundedServiceString.split(",");

		//create the founded service
		EveService founded_ser = EvesimFactory.eINSTANCE.createEveService();
		founded_ser.setName(service_params[0]);

		//create the EveFitness with the returned ranking
		EveFitness fit = new EveFitness(founded_ser, new Float(service_params[1]));

		//create the demanded service
		EveService demanded_service = EvesimFactory.eINSTANCE.createEveService();
		demanded_service.setName(service_params[2]);
		//System.out.println(service_params[3]);
		//parse time stamp
		Long timestamp = Long.valueOf(service_params[3]);
		Integer count = Integer.valueOf(service_params[4]);
		timestamp = System.currentTimeMillis() - timestamp;
		this.times.put(count, timestamp);
		storeTime(timestamp);
		//System.out.println(this.times.toString());

		//store the result
		addFoundedandUsedService(fit, demanded_service,count);
	}
	private void storeTime(long time) {
		if(time > longestTransactionTime || longestTransactionTime == 0){
			longestTransactionTime = time;
			totalTransactionTime+=time;
			meanTransactionTime = totalTransactionTime/countSearches;
		}
		else if(time < shortestTransactionTime || shortestTransactionTime == 0){
			shortestTransactionTime = time;
			totalTransactionTime+=time;
			meanTransactionTime = totalTransactionTime/countSearches;
		}
		totalTransactionTime+=time;
		meanTransactionTime = totalTransactionTime/countSearches;
	}

	//Getters & Setters
	public boolean isStarted() {
		return started;
	}
	public EveService getDemandedService() {
		return demandedService;
	}

	public void setDemandedService(EveService demandedService) {
		this.demandedService = demandedService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Main class to test the agent functionality
	 * <!-- end-user-doc -->
	 * <p>
	 * </p>
	 *
	 * @generated NOT
	 */
	public static void main(String[] args) throws IOException {
		MersenneTwister mt = new MersenneTwister();
		ArrayList<EveAgentSemanticSearchImpl> agentlist = new ArrayList<EveAgentSemanticSearchImpl>();
		EveAgentSemanticSearchImpl agent = (EveAgentSemanticSearchImpl)SemanticSearchFactory.eINSTANCE.createEveAgentSemanticSearch();
		agent.setName("ChristophRuecker@SUAS");
		//		EveAgentSemanticSearchImpl agent1 = (EveAgentSemanticSearchImpl)SemanticSearchFactory.eINSTANCE.createEveAgentSemanticSearch();
		//		agent1.setName("RaimundEder@SUAS");
		//		EveAgentSemanticSearchImpl agent2 = (EveAgentSemanticSearchImpl)SemanticSearchFactory.eINSTANCE.createEveAgentSemanticSearch();
		//		agent1.setName("ThomasKurz@SUAS");
		//		EveAgentSemanticSearchImpl agent3 = (EveAgentSemanticSearchImpl)SemanticSearchFactory.eINSTANCE.createEveAgentSemanticSearch();
		//		agent3.setName("ThomasHeistracher@SUAS");

		EvesimFactory fac = EvesimFactory.eINSTANCE;

		EveService ser = fac.createEveService();
		ser.setName("Complex Network Models");
		EveService ser1 = fac.createEveService();
		ser1.setName("Complex Robustness of Populations");
		EveService ser2 = fac.createEveService();
		ser2.setName("Robustness of spontaneous pattern formation in spatially distributed genetic populations");
		EveService ser3 = fac.createEveService();
		ser3.setName("pattern formation in distributed genetic populations");
		EveService ser4 = fac.createEveService();
		ser4.setName("instability of polymorphic populations");

		agent.getDemandedServices().add(ser);
		agent.getDemandedServices().add(ser4);
		agent.getDemandedServices().add(ser2);

		//		agent1.getDemandedServices().add(ser1);
		//		agent1.getDemandedServices().add(ser3);
		//		agent1.getDemandedServices().add(ser2);
		//
		//		agent2.getDemandedServices().add(ser4);
		//		agent2.getDemandedServices().add(ser2);
		//
		//		agent3.getDemandedServices().add(ser);
		//		agent3.getDemandedServices().add(ser4);
		//		agent3.getDemandedServices().add(ser3);

		agent.execute();
		//		agent1.execute();
		//		agent2.execute();
		//		agent3.execute();

		agentlist.add(agent);
		//		agentlist.add(agent1);
		//		agentlist.add(agent2);
		//		agentlist.add(agent3);

		while(agent.isStarted() == false){ //|| agent1.isStarted() == false || agent2.isStarted() == false || agent3.isStarted() == false){
			try {
				Thread.sleep(1000);
				System.out.println("Waiting");
			} catch (InterruptedException ex) {ex.printStackTrace();}
		}

		for(int i = 0; i < 250; i++){
			try {
				Thread.sleep(mt.nextInt(1000));
				//System.out.println("Waiting");
			} catch (InterruptedException ex) {ex.printStackTrace();}
			agentlist.get(mt.nextInt(agentlist.size())).execute();
		}
		try
		{
			try {
				Thread.sleep(5000);
				System.out.println("Waiting");
			} catch (InterruptedException ex) {ex.printStackTrace();}

			FileWriter writer = new FileWriter("agents.csv");

			for(int i = 0; i < agentlist.size();i++){
				for(Integer key : agentlist.get(i).getTimes().keySet()){
					writer.append(agentlist.get(i).getTimes().get(key).toString());
					writer.append(";");
				}
				writer.append("\n");
			}

			writer.flush();
			writer.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		} 


	}
	public HashMap<Integer, Long> getTimes() {
		return times;
	}
	public int getCountSearches() {
		return countSearches;
	}



} //EveAgentSemanticSearchImpl
