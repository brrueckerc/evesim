package org.evesim.biotech;

import java.util.ArrayList;


public class EveDirector {
	private ArrayList<String> director_list = new ArrayList<String>();
	private String name;
	
	public EveDirector(String name){
		this.name = name;
		
	}
	
	public ArrayList<String> getDirector_list() {
		return director_list;
	}

	public void setDirector_list(ArrayList<String> directorList) {
		director_list = directorList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
