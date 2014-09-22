/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.evesim.usecase.semanticSearch.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EClass;
import org.evesim.EveComponentRegistry;
import org.evesim.EveSimServerSession;
import org.evesim.impl.EveServiceImpl;
import org.evesim.msg.EveLogMessage;
import org.evesim.msg.EveSerializedMessage;
import org.evesim.msg.MsgFactory;
import org.evesim.usecase.semanticSearch.EveServiceSemanticSearch;
import org.evesim.usecase.semanticSearch.SemanticSearchFactory;
import org.evesim.usecase.semanticSearch.SemanticSearchPackage;
import org.evesim.usecase.services.EveFlypeerServiceFileContainer;

import br.org.ipti.flypeer.authn.AuthnData;
import br.org.ipti.flypeer.authn.AuthnData.TYPE;
import br.org.ipti.flypeer.main.CommandSimplePeer;
import br.org.ipti.flypeer.main.PeerStatusNotifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eve Service Semantic Search</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated NOT
 */
public class EveServiceSemanticSearchImpl extends EveServiceImpl implements EveServiceSemanticSearch {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7088554538115595181L;
	private boolean started = false;
	private boolean filled = false;

	public boolean isFilled() {
		return filled;
	}

	private final static Logger logger = Logger.getLogger(EveServiceSemanticSearchImpl.class.getName());
	private EveFlypeerServiceFileContainer file_container_wsdl;
	private EveFlypeerServiceFileContainer file_container_services;
	private EveFlypeerServiceFileContainer file_container_seeds;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected EveServiceSemanticSearchImpl() {
		super();
//		if(filled == false){
//			try {
//				this.file_container_services = new EveFlypeerServiceFileContainer();
//				File file_services = new File(".\\META-INF\\services\\br.org.ipti.flypeer.services.FlypeerBusinessService");
//				this.file_container_services.marshall(file_services);
//
//				this.file_container_wsdl = new EveFlypeerServiceFileContainer();
//				File file_wsdl = new File(".\\bin\\DocumentsOnOfferService.wsdl");
//				this.file_container_wsdl.marshall(file_wsdl);
//
//				this.file_container_seeds = new EveFlypeerServiceFileContainer();
//				File file_seeds = new File(".\\bin\\seeds.properties");
//				this.file_container_seeds.marshall(file_seeds);
//				
//				System.out.println(this.file_container_services.getSize());
//				System.out.println(this.file_container_seeds.getSize());
//				System.out.println(this.file_container_wsdl.getSize());
//				
//				if(file_container_seeds.isvalid() && file_container_services.isvalid() && file_container_wsdl.isvalid()){
//					filled = true;
//					System.out.println(filled);
//				}
//				else{
//					throw new Exception("File filling failed");
//				}
//
//
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	protected EClass eStaticClass() {
		return SemanticSearchPackage.Literals.EVE_SERVICE_SEMANTIC_SEARCH;
	}

	public void execute(){
		if(started == false){
			//init();

			CommandSimplePeer simple = new CommandSimplePeer();
			AuthnData data = new AuthnData(TYPE.DEFAULT, UUID.randomUUID().toString(), "pass");
			simple.start(data, new PeerStatusNotifier() {

				@Override
				public void peerStarted() {
					logger.log(Level.INFO,"The Peer has started");
					sendMessage("log", "DocumentsOnOfferService started successfully");
					started = true;

				}
			});
		}
		else{
			logger.log(Level.INFO,"The Peer has been started before");
		}
	}
	@SuppressWarnings("unused")
	private void init() {
		if(this.file_container_seeds.isvalid() == true && this.file_container_seeds.getSize() != 0){
			this.file_container_seeds.unmarshall(".");
			System.out.print("SUCCESS seeds");
		}
		if(this.file_container_wsdl.isvalid() == true && this.file_container_wsdl.getSize() != 0){
			this.file_container_wsdl.unmarshall(".");
			System.out.print("SUCCESS wsdl");
		}
		boolean success = false;
		File dirs = new File("./META-INF/services");
		if(dirs.exists()){
			success = true;
		}
		else{
			success = dirs.mkdirs();
		}

		System.out.println(success);
		System.out.println(this.file_container_services.isvalid());
		System.out.println(this.file_container_services.getSize());
		if(success == true && this.file_container_services.isvalid() == true && this.file_container_services.getSize() != 0){
			System.out.print("START services");
			this.file_container_services.unmarshall(".\\META-INF\\services");
			System.out.print("SUCCESS services");
		}

		File file = new File("seeds.properties"); 
		try {
			file.createNewFile();
			Writer output = null;
			String text = "##\n" + 
			"# List of rendezvous\n"+
			"##\n"+
			"seeds_1=tcp://www.opaals.at:9701\n" +
			"seeds_2=tcp://193.1.208.240:80\n" +
			"seeds_3=tcp://www.ipti.org.br:9701\n";

			output = new BufferedWriter(new FileWriter(file));
			output.write(text);
			output.close();
			System.out.println("Your file has been written to: " + file.getAbsolutePath());    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		if (success) { 
		} else { } 

		File wsdl = new File("DocumentsOnOfferService.wsdl"); 
		try {
			wsdl.createNewFile();
			Writer output = null;
			String text = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
			"<wsdl:definitions targetNamespace=\"http://www.ibm.com/wbse"+
			"xmlns:apachesoap=\"http://xml.apache.org/xml-soap\" xmlns:impl=\"http://www.ibm.com/wbse"+
			"xmlns:intf=\"http://www.ibm.com/wbse\" xmlns:wsdl=\"http://schemas.xmlsoap.org/wsdl/" +
			"xmlns:wsdlsoap=\"http://schemas.xmlsoap.org/wsdl/soap/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">" +

			"<wsdl:message name=\"demandedService\">" +
			"<wsdl:part name=\"demandedService\" type=\"xs:string\" />" +
			"</wsdl:message>" +

			"<wsdl:message name=\"returnService\">" + 
			"<wsdl:part name=\"returnService\" type=\"xs:string\" />" +
			"</wsdl:message>" +

			"<wsdl:portType name=\"ProcessDemandingRequest\">" +
			"<wsdl:operation name=\"process\">" +
			"<wsdl:input message=\"demandedService\" />" +
			"<wsdl:output message=\"returnService\" />" +
			"</wsdl:operation>" +
			"</wsdl:portType>" +

			"<wsdl:service name=\"FLYPEER://FLYPEER-DOCUMENTS-ON-OFFER\">" +
			"<wsdl:documentation>Documents On Offer Service</wsdl:documentation>" +
			"</wsdl:service>" +
			"</wsdl:definitions>";

			output = new BufferedWriter(new FileWriter(wsdl));
			output.write(text);
			output.close();
			System.out.println("Your file has been written to: " + wsdl.getAbsolutePath());    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		if (success) { 
		} else { } 
		
		File services = new File(".\\META-INF\\services\\br.org.ipti.flypeer.services.FlypeerBusinessService"); 
		try {
			services.createNewFile();
			Writer output = null;
			String text = "DocumentsOnOfferService";
			output = new BufferedWriter(new FileWriter(services));
			output.write(text);
			output.close();
			System.out.println("Your file has been written to: " + services.getAbsolutePath());    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		if (success) { 
		} else { } 
	}

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


	public static void main(String[] args){
		EveServiceSemanticSearchImpl service = (EveServiceSemanticSearchImpl)SemanticSearchFactory.eINSTANCE.createEveServiceSemanticSearch();
		service.execute();
	}

} //EveServiceSemanticSearchImpl
