package org.evesim.usecase.services;

import in.iirk.semSearch.SemSearchWrapper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.evesim.EveService;
import org.evesim.EvesimFactory;

import br.org.ipti.flypeer.model.BasicPeer;
import br.org.ipti.flypeer.model.FlypeerRollbackListener;
import br.org.ipti.flypeer.model.FlypeerServiceListener;
import br.org.ipti.flypeer.model.ServiceContext;
import br.org.ipti.flypeer.services.FlypeerBusinessService;
import br.org.ipti.flypeer.services.wsdl.WSDLFile;

@WSDLFile(name = "DocumentsOnOfferService.wsdl")
public class DocumentsOnOfferService implements FlypeerBusinessService,FlypeerServiceListener, FlypeerRollbackListener{
	
	BasicPeer service_peer;
	List<String> offered_services;
	EveSemanticSearchServiceClass sem_search;
	
	private final static Logger logger = Logger.getLogger(DocumentsOnOfferService.class.getName());
	
	
	@Override
	public void clear(String arg0) {
		logger.info("DocumentsOnOfferService was cleared.");
	}

	@Override
	public FlypeerRollbackListener getRollbackListener() {
		return this;
	}

	@Override
	public FlypeerServiceListener getServiceListener() {
		return this;
	}

	@Override
	public void start(BasicPeer peer) {
		this.service_peer = peer;
		this.sem_search = new EveSemanticSearchServiceClass();
		this.offered_services = new ArrayList<String>();
		this.offered_services.add("Semiclassical propagation of wavepackets with complex and real trajectories");
		this.offered_services.add("Spectral analysis and the dynamic response of complex networks");
		this.offered_services.add("Invasion and extinction in the mean field approximation for a spatial   host-pathogen model");
		this.offered_services.add("Robustness of spontaneous pattern formation in spatially distributed   genetic populations");
		this.offered_services.add("Stability and instability of polymorphic populations and the role of   multiple breeding seasons in phase III of Wrights shifting balance   theory");
		this.offered_services.add("Fermi-Dirac statistics and traffic in complex networks");
	}

	@Override
	public void stop() {
		logger.warning("DocumentsOnOfferService stopped");

	}

	@Override
	public void rollback(ServiceContext params) {
		logger.warning("DocumentsOnOfferService received a rollback");
		
	}

	@Override
	public Serializable serviceEvent(ServiceContext parameters) throws Exception {
		logger.info("Service Called");
		String dem_ser_name = (String)parameters.getParameter("demandedService");
		Long timestamp = (Long)parameters.getParameter("startTimeStamp");
		Integer count = (Integer)parameters.getParameter("searchCount");
		logger.info(dem_ser_name);
		
		String iitk_sem_search = SemSearchWrapper.callSemanticSearch(dem_ser_name);
		
		ArrayList<String> fit = new ArrayList<String> ();
		try{
		fit = sem_search.doSearch(offered_services, dem_ser_name);
		}
		catch (Exception e){
			e.printStackTrace();
		}
		System.out.println(fit.toString());

		String returnService = new String();
		EveFitness best_fit = getbestFitness(fit);
		returnService = best_fit.toString()+","+dem_ser_name+","+timestamp+","+count;
		logger.info(returnService);

		return returnService;
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

}
