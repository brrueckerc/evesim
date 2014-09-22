package org.evesim.usecase.services;


import java.io.Serializable;

import org.evesim.EveService;

public class EveFitness implements Comparable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	EveService result;
	float ranking;

	public EveFitness(){

	}

	public EveFitness(EveService result, float ranking) {
		setResult(result);
		setRanking(ranking);
	}

	public EveService getResult() {
		return result;
	}

	public void setResult(EveService result) {
		this.result = result;
	}

	public float getRanking() {
		return ranking;
	}

	public void setRanking(float value) {
		this.ranking = value;
	}

	public int compareTo(Object o) {
		EveFitness obj = (EveFitness)o;
		if (Math.abs(obj.getRanking() - this.getRanking()) < 0.00) {
			return 0;
		} else if (obj.getRanking() < this.getRanking()){
			return -1;
		} else {
			return 1;
		}
	}

	public String toString() {
		String result = "";
		if (getResult() == null){
			result += "[null]: ";
		}
		else{
			result += getResult().getName() + ",";
			result += getRanking();
		}
		return result;
	}


}
