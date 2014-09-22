package org.evesim.biotech;

import java.util.HashMap;

public class EveResearcher {
	private int number;
	private String name;
	private HashMap<String,Double> connectedCompanies = new HashMap<String, Double>();
	
	public EveResearcher(int number,String name){
		this.name = name;
		this.number = number;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public HashMap<String, Double> getConnectedCompanies() {
		return connectedCompanies;
	}

	public void setConnectedCompanies(HashMap<String, Double> connectedCompanies) {
		this.connectedCompanies = connectedCompanies;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
