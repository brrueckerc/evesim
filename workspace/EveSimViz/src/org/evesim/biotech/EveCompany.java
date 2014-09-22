package org.evesim.biotech;
import java.util.ArrayList;

import uk.me.jstott.jcoord.IrishRef;
import uk.me.jstott.jcoord.LatLng;


public class EveCompany {
	private String company_name;
	private int establish_year;
	private double longitude;
	private double latitude;
	private ArrayList<String> directors = new ArrayList<String>();
	private ArrayList<String> child_companies = new ArrayList<String>();
	
	public EveCompany(String name, int year, double easting, double northing){
		this.company_name = name;
		this.establish_year = year;
		//System.out.println(easting + ";" + northing);
		IrishRef ref1 = new IrishRef(easting, northing);
		
		LatLng cor = ref1.toLatLng();
		System.out.println(cor.toString());

		this.latitude = cor.getLatitude();
		this.longitude = cor.getLongitude();
		
		//System.out.println(this.latitude + ";" + this.longitude);
		}
	
	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String companyName) {
		company_name = companyName;
	}

	public int getEstablish_year() {
		return establish_year;
	}

	public void setEstablish_year(int establishYear) {
		establish_year = establishYear;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public ArrayList<String> getDirectors() {
		return directors;
	}

	public void setDirectors(ArrayList<String> directors) {
		this.directors = directors;
	}

	public ArrayList<String> getChild_companies() {
		return child_companies;
	}

	public void setChild_companies(ArrayList<String> childCompanies) {
		child_companies = childCompanies;
	}
}
