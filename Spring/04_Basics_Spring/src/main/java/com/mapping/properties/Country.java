package com.mapping.properties;

import java.util.Map;

public class Country {
	
	private String countryName;
	
	//statename and captial
	private Map<String, String> states;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Map<String, String> getStates() {
		return states;
	}
	public void setStates(Map<String, String> states) {
		this.states = states;
	}
	
	public void printCountryDetails() {
		System.out.println("country name" + countryName);
		System.out.println("-------------state information--------");
		states.forEach((String stateName, String captial) -> System.out.println(stateName + " : " + captial));
	}

}
