package org.evesim.usecase.services;

import java.io.Serializable;
import java.util.Vector;

import org.evesim.EveAgent;
import org.evesim.EveService;

public class EveSearchAttributes implements Serializable{
	
	Long searchID;
	private EveService demandedService;
	private EveAgent demandingAgent;
	private Vector<EveService> demandedServicePool;
	private Vector<EveFitness> bestFittingServices; 
	private Integer ttl = null;

	public EveSearchAttributes(){

	}
	public EveSearchAttributes(Long searchID, EveAgent agent, EveService demandedService, Vector<EveService> demandedServicePool, Integer ttl){
		this.searchID =searchID;
		this.demandingAgent = agent;
		this.demandedService = demandedService;
		this.demandedServicePool = demandedServicePool;
		this.ttl = ttl;
	}
	public EveSearchAttributes(Long searchID,EveAgent agent, EveService demandedService){
		this.searchID =searchID;
		this.demandingAgent = agent;
		this.demandedService = demandedService;
	}
	public Long getSearchID() {
		return searchID;
	}
	public void setSearchID(Long searchID) {
		this.searchID = searchID;
	}
	public EveService getDemandedService() {
		return demandedService;
	}
	public void setDemandedService(EveService demandedService) {
		this.demandedService = demandedService;
	}
	public EveAgent getDemandingAgent() {
		return demandingAgent;
	}
	public void setDemandingAgent(EveAgent demandingAgent) {
		this.demandingAgent = demandingAgent;
	}
	public Vector<EveService> getDemandedServicePool() {
		return demandedServicePool;
	}
	public void setDemandedServicePool(Vector<EveService> demandedServicePool) {
		this.demandedServicePool = demandedServicePool;
	}
	public Integer getTtl() {
		return ttl;
	}
	public void setTtl(Integer ttl) {
		this.ttl = ttl;
	}
	public Vector<EveFitness> getbestFittingServices() {
		return bestFittingServices;
	}
	public void setbestFittingServices(Vector<EveFitness> searchHistory) {
		this.bestFittingServices = searchHistory;
	}
	@Override
	public String toString(){
		return demandedService.getName() + "," + demandingAgent;
	}
}
