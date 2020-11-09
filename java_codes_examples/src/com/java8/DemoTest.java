package com.java8;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class City {
	
	String cityName;

	public City(String cityName) {
		super();
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("City [cityName=");
		builder.append(cityName);
		builder.append("]");
		return builder.toString();
	}
	
}
public class DemoTest {
	public static void main(String[] args) throws IOException {

		
		Set<City> cities = cities();
		int i =0;
		for(Iterator<City> indexOfCity = cities.iterator();indexOfCity.hasNext();i++) {
			System.out.println(indexOfCity.next() + ":" + i);
		}
		
	}
	
	public static Set<City> cities() {
		
		Set<City> cities = new HashSet<>();
		cities.add(new City("dubai"));
		cities.add(new City("usa"));
		cities.add(new City("aus"));
		cities.add(new City("india"));
		
		return cities;
	}

}
