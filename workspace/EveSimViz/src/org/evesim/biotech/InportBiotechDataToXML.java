package org.evesim.biotech;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.evesim.EveAgent;
import org.evesim.EveConnection;
import org.evesim.EveNode;
import org.evesim.EveSimulation;
import org.evesim.EvesimFactory;
import org.evesim.EvesimPackage;

public class InportBiotechDataToXML {

	private ArrayList<EveCompany> companies;
	private ArrayList<EveCompany> companies_small = new ArrayList<EveCompany>();
	private ArrayList<EveDirector> directors = new ArrayList<EveDirector>();
	private String temp_name; 
	private int left;
	private int right;
	private int temp_nr;
	private int temp_year = 0;
	private double temp_north = 0; 
	private double temp_east = 0;
	private String temp_director = new String();
	private ArrayList<String> temp_companies = new ArrayList<String>();
	private ArrayList<String> temp_children = new ArrayList<String>();
	private HashMap<Integer,String> patent_companies = new HashMap<Integer, String>();
	private HashMap<Integer, EveResearcher> patent_researcher = new HashMap<Integer, EveResearcher>();


	public InportBiotechDataToXML(){
		this.companies = new ArrayList<EveCompany>();
		this.temp_name = new String();
	}

	public void parseCompanies(){
		try{

			//csv file containing data

			String strFile = "C:/biotech/companies.csv";

			//create BufferedReader to read csv file

			BufferedReader br = new BufferedReader( new FileReader(strFile));
			String strLine = "";
			StringTokenizer st = null;
			int lineNumber = 0, tokenNumber = 0;

			//read comma separated file line by line

			while( (strLine = br.readLine()) != null)

			{
				lineNumber++;
				st = new StringTokenizer(strLine, ";");
				while(st.hasMoreTokens())
				{
					if(tokenNumber == 0){
						this.temp_name = st.nextToken();
					}
					else if(tokenNumber == 1){
						this.temp_year = Integer.parseInt(st.nextToken());
					}
					else if(tokenNumber == 2){
						this.temp_east = Double.parseDouble(st.nextToken());
					}
					else if(tokenNumber == 3){
						this.temp_north = Double.parseDouble(st.nextToken());
					}

					tokenNumber++;
				}
				EveCompany comp = new EveCompany(temp_name, temp_year, temp_east, temp_north);
				this.companies.add(comp);
				tokenNumber = 0;
			}
			//						System.out.println(this.companies.toString());
			//						System.out.println(this.companies.get(0).getCompany_name().toString());
			//						System.out.println(this.companies.get(0).getEstablish_year());
			//						System.out.println(this.companies.get(0).getLatitude());
			//						System.out.println(this.companies.get(0).getLongitude());
		}

		catch(Exception e)

		{
			e.printStackTrace();
			System.out.println("Exception while reading csv file: " + e);

		}
	}
	public void parseDirectors(){
		try{

			//csv file containing data

			String strFile = "C:/biotech/directors.csv";

			//create BufferedReader to read csv file

			BufferedReader br = new BufferedReader( new FileReader(strFile));
			String strLine = "";
			StringTokenizer st = null;
			int lineNumber = 0, tokenNumber = 0;

			//read comma separated file line by line

			while( (strLine = br.readLine()) != null)

			{
				lineNumber++;
				st = new StringTokenizer(strLine, ";");
				while(st.hasMoreTokens())
				{
					if(tokenNumber == 0){
						this.temp_name = st.nextToken();
						//System.out.println(this.temp_name);
					}
					else if(tokenNumber > 0){
						String temp = new String(st.nextToken());
						//System.out.println(temp);
						this.temp_companies.add(temp);
					}

					tokenNumber++;
				}

				//match director with companies
				EveDirector dir = new EveDirector(this.temp_name);
				Iterator<String> it = this.temp_companies.iterator();
				while(it.hasNext()){
					dir.getDirector_list().add(it.next());
				}
				this.directors.add(dir);

				this.temp_companies.clear();
				this.temp_name=null;

				tokenNumber = 0;
			}
		}

		catch(Exception e)

		{
			e.printStackTrace();
			System.out.println("Exception while reading csv file: " + e);

		}


	}
	public void parseChildren(){
		try{

			//csv file containing data

			String strFile = "C:/biotech/spinners.csv";

			//create BufferedReader to read csv file

			BufferedReader br = new BufferedReader( new FileReader(strFile));
			String strLine = "";
			StringTokenizer st = null;
			int lineNumber = 0, tokenNumber = 0;

			//read comma separated file line by line

			while( (strLine = br.readLine()) != null)

			{
				lineNumber++;
				st = new StringTokenizer(strLine, ";");
				while(st.hasMoreTokens())
				{
					if(tokenNumber == 0){
						this.temp_name = st.nextToken();
						//System.out.println(this.temp_name);
					}
					else if(tokenNumber > 0){
						String temp = new String(st.nextToken());
						//System.out.println(temp);
						this.temp_children.add(temp);
					}

					tokenNumber++;
				}
				tokenNumber = 0;

				Iterator<EveCompany> it = this.companies.iterator();
				Iterator<String> iter = this.temp_children.iterator();
				while(it.hasNext()){
					EveCompany comp = it.next();
					//System.out.println(comp.getCompany_name());
					//System.out.println(temp_name);
					if(comp.getCompany_name().equals(temp_name)){
						while(iter.hasNext()){
							comp.getChild_companies().add(iter.next());
						}
					}
				}
				this.temp_children.clear();
			}
		}

		catch(Exception e)

		{
			e.printStackTrace();
			System.out.println("Exception while reading csv file: " + e);

		}

	}
	public void parsePatentCompanies(){
		try{

			//csv file containing data

			String strFile = "C:/biotech/invent_companies.csv";

			//create BufferedReader to read csv file

			BufferedReader br = new BufferedReader( new FileReader(strFile));
			String strLine = "";
			StringTokenizer st = null;
			int lineNumber = 0, tokenNumber = 0;

			//read comma separated file line by line

			while( (strLine = br.readLine()) != null)

			{
				lineNumber++;
				st = new StringTokenizer(strLine, ";");
				while(st.hasMoreTokens())
				{
					if(tokenNumber == 0){
						this.temp_nr = Integer.parseInt(st.nextToken());
						//System.out.println(this.temp_nr);
					}
					else if(tokenNumber == 1){
						this.temp_name = st.nextToken();
						//System.out.println(this.temp_name);
						this.patent_companies.put(this.temp_nr,this.temp_name);
					}
					else{
						break;
					}

					tokenNumber++;
				}
				tokenNumber = 0;
			}
			//System.out.println(this.patent_companies.size());
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void parsePatentPeople(){
		try{

			//csv file containing data

			String strFile = "C:/biotech/invent_people.csv";

			//create BufferedReader to read csv file

			BufferedReader br = new BufferedReader( new FileReader(strFile));
			String strLine = "";
			StringTokenizer st = null;
			int lineNumber = 0, tokenNumber = 0;

			//read comma separated file line by line

			while( (strLine = br.readLine()) != null)

			{
				lineNumber++;
				st = new StringTokenizer(strLine, ";");
				while(st.hasMoreTokens())
				{
					if(tokenNumber == 0){
						this.temp_nr = Integer.parseInt(st.nextToken());
						//System.out.println(this.temp_nr);
					}
					else if(tokenNumber == 1){
						this.temp_name = st.nextToken();
						//System.out.println(this.temp_name);
						EveResearcher re = new EveResearcher(this.temp_nr, this.temp_name);
						this.patent_researcher.put(this.temp_nr,re);
					}
					else{
						break;
					}

					tokenNumber++;
				}
				tokenNumber = 0;
			}
			//System.out.println(this.patent_researcher.size());
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void parsePatentConnections(){
		try{

			//csv file containing data

			String strFile = "C:/biotech/invent_arcs.csv";

			//create BufferedReader to read csv file

			BufferedReader br = new BufferedReader( new FileReader(strFile));
			String strLine = "";
			StringTokenizer st = null;
			int lineNumber = 0, tokenNumber = 0;

			//read comma separated file line by line

			while( (strLine = br.readLine()) != null)

			{
				lineNumber++;
				st = new StringTokenizer(strLine, ";");
				while(st.hasMoreTokens())
				{
					if(tokenNumber == 0){
						this.left = Integer.parseInt(st.nextToken());
						//System.out.println(this.left);
					}
					else if(tokenNumber == 1){
						this.right = Integer.parseInt(st.nextToken());
						//System.out.println(this.right);
					}
					else if(tokenNumber == 2){
						Double strength = Double.parseDouble(st.nextToken());
						this.patent_researcher.get(left).getConnectedCompanies().put(this.patent_companies.get(right), strength);
						//System.out.println(strength);
					}
					else{
						break;
					}

					tokenNumber++;
				}
				tokenNumber = 0;
			}
			//System.out.println(this.patent_researcher.size());
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void convertToEveSim(){

		//System.out.println("Companies " + this.companies.size());
		//System.out.println("patent Companies " + this.patent_companies.size());
		Iterator<EveCompany> iterat = this.companies.iterator();
		while(iterat.hasNext()){
			EveCompany comp = iterat.next();
			String name = comp.getCompany_name();
			for (Integer key : this.patent_companies.keySet()) {

				String value = this.patent_companies.get(key);
				if(value.equals(name)){
					this.companies_small.add(comp);
				}
			}
		}
		//System.out.println("Companies " + this.companies_small.size());

		EveSimulation sim = EvesimFactory.eINSTANCE.createEveSimulation();
		EveNode node = EvesimFactory.eINSTANCE.createEveNode();
		sim.addChild(node);
		node.setParent(sim);

		Iterator<EveCompany> iter = this.companies.iterator();
		while(iter.hasNext()){
			EveCompany comp = iter.next();
			EveAgent agent = EvesimFactory.eINSTANCE.createEveAgent();
			agent.setName(removeSpaces(comp.getCompany_name()));
			agent.setUuid(UUID.nameUUIDFromBytes(removeSpaces(comp.getCompany_name()).getBytes()));

			agent.setDescription(Integer.toString(comp.getEstablish_year()));
			agent.setLocLongitude((float)comp.getLongitude());
			agent.setLocLatitude((float)comp.getLatitude());
			agent.setParent(node);
			node.addChild(agent);
		}
		//begin spinners
		//				Iterator<EveCompany> it = this.companies.iterator();
		//				while(it.hasNext()){
		//					EveCompany com = it.next();
		//					System.out.println(com.getCompany_name());
		//					Iterator<String> ite = com.getChild_companies().iterator();
		//					while(ite.hasNext()){
		//						try{
		//							//create connection
		//							EveConnection con = EvesimFactory.eINSTANCE.createEveConnection();
		//		
		//							//create the connection partner
		//							String child = ite.next();
		//							System.err.println(child);
		//							con.setName(child);
		//							con.setType("child_company");
		//							con.setDirectional(false);
		//							con.setName("Connection to: " + new URI(removeSpaces(child)));
		//							con.setStrength(new Float(1.0));
		//							con.setConnected(true);
		//		
		//							con.setConnectedComponent(node.lookupComponent(UUID.nameUUIDFromBytes(removeSpaces(child).getBytes())));
		//							con.setParent(node.lookupComponent(UUID.nameUUIDFromBytes(removeSpaces(com.getCompany_name()).getBytes())));
		//		
		//							System.out.println(con.toString());
		//							System.out.println(con.getConnectedComponent());
		//		
		//						}catch (Exception e) {
		//							e.printStackTrace();
		//						}
		//		
		//					}
		//end spinners

		//begin directors
		//		Iterator<EveCompany> it_dir = this.companies.iterator();
		//		while(it_dir.hasNext()){
		//			EveCompany comp = it_dir.next();
		//			Iterator<EveDirector> itera = this.directors.iterator();
		//			while(itera.hasNext()){
		//				EveDirector temp = itera.next();
		//				System.out.println(temp.getName());
		//				for(int i = 0; i < temp.getDirector_list().size();i++){
		//					if(temp.getDirector_list().get(i).equals(comp.getCompany_name())){
		//						for(int j = 0; j < temp.getDirector_list().size();j++){
		//							if(!temp.getDirector_list().get(j).equals(comp.getCompany_name())){
		//								EveConnection con = EvesimFactory.eINSTANCE.createEveConnection();
		//								System.out.println(temp.getName());
		//								//create the connection partner
		//								//									EveAgent ag = EvesimFactory.eINSTANCE.createEveAgent();
		//
		//								//									ag.setUuid(UUID.nameUUIDFromBytes(removeSpaces(temp.getDirector_list().get(j)).getBytes()));
		//								//									try {
		//								//										ag.setUri(new URI(removeSpaces(temp.getDirector_list().get(j))));
		//								//										con.setType("director");
		//								//										con.setName("Connection to: " + new URI(removeSpaces(temp.getDirector_list().get(j))) + " via " + temp.getName());
		//								//									} catch (URISyntaxException e) {
		//								//										e.printStackTrace();
		//								//									}
		//								//									con.setConnectedComponent(ag);
		//								//									con.setConnected(true);
		//								con.setName("Connection via " + temp.getName() + " to " + temp.getDirector_list().get(j));
		//								con.setType("director");
		//								con.setStrength(new Float(1.0));
		//								con.setConnected(true);
		//								con.setDirectional(false);
		//
		//								con.setConnectedComponent(node.lookupComponent(UUID.nameUUIDFromBytes(removeSpaces(temp.getDirector_list().get(j)).getBytes())));
		//								con.setParent(node.lookupComponent(UUID.nameUUIDFromBytes(removeSpaces(comp.getCompany_name()).getBytes())));
		//
		//							}
		//						}
		//					}
		//
		//				}
		//			}
		//end directors

		//begin patents
		Iterator<EveCompany> it_dir = this.companies.iterator();
		while(it_dir.hasNext()){
			EveCompany comp = it_dir.next();
			for (Integer key : this.patent_researcher.keySet()) {
				EveResearcher value = this.patent_researcher.get(key);
				HashMap<String, Double> map = value.getConnectedCompanies();
				for(String key_name : map.keySet()){
					if(comp.getCompany_name().equals(key_name)){
						for(String comp_con : map.keySet()){
							if(!comp_con.equals(comp.getCompany_name())){
								EveConnection con = EvesimFactory.eINSTANCE.createEveConnection();
								//create the connection partner
								//								EveAgent ag = EvesimFactory.eINSTANCE.createEveAgent();
								//
								//								ag.setUuid(UUID.nameUUIDFromBytes(removeSpaces(comp_con).getBytes()));
								//								try {
								//									ag.setUri(new URI(removeSpaces(comp_con)));
								//									con.setType("patent");
								//									con.setName("Connection to: " + new URI(removeSpaces(comp_con)) + " via " + this.patent_researcher.get(key).getName());
								//								} catch (URISyntaxException e) {
								//									e.printStackTrace();
								//								}
								con.setName("Connection via " + this.patent_researcher.get(key).getName() + " to " + comp_con);
								con.setType("director");
								con.setStrength(new Float(1.0));
								con.setConnected(true);
								con.setDirectional(false);

								con.setConnectedComponent(node.lookupComponent(UUID.nameUUIDFromBytes(removeSpaces(comp_con).getBytes())));
								con.setParent(node.lookupComponent(UUID.nameUUIDFromBytes(removeSpaces(comp.getCompany_name()).getBytes())));
							}
						}
					}

				}
			}


			//end patents
		}


		//System.out.println(sim);
		// Initialize the model
		EvesimPackage.eINSTANCE.eClass();
		// Register the XMI resource factory for the .evesim extension
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;

		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("evesim", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(org.eclipse.emf.common.util.URI
				.createURI("evesim/resource.evesim"));

		resource.getContents().add(sim);
		//System.out.println(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString());
		//System.out.println(resource.getAllContents().toString());
		saveResource("C://temp/test.evesim",resource);	 
		//System.out.println(ResourcesPlugin.getWorkspace().getRoot().getProjects()[0].getName());


		//children connections


	}

	//parse companies

	public String removeSpaces(String s) {
		StringTokenizer st = new StringTokenizer(s," ",false);
		String t="";
		while (st.hasMoreElements()) t += st.nextElement();
		return t;
	}
	//parse csv file

	//match data with companies
	//convert cumulated data to xml

	public static void main(String[] args){
		InportBiotechDataToXML inport = new InportBiotechDataToXML();

		inport.parseCompanies();
		inport.parsePatentCompanies();
		inport.parsePatentPeople();
		inport.parsePatentConnections();
		inport.parseDirectors();
		inport.parseChildren();

		inport.convertToEveSim();



	}
	public static void saveResource(String urlStr, Resource resource){
		try{
			File fil = new File(urlStr);
			fil.createNewFile();

			BufferedOutputStream bs = new BufferedOutputStream(new FileOutputStream(urlStr));

			resource.save(bs,Collections.EMPTY_MAP);
			bs.flush();


		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
