package com.demo.bean.wiring;

public class Caar {
	
	private Tyre tyre;
	private Engine engine;
	private String personName;
	
	public Tyre getTyre() {
		return tyre;
	}



	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}



	public Engine getEngine() {
		return engine;
	}



	public void setEngine(Engine engine) {
		this.engine = engine;
	}



	public String getPersonName() {
		return personName;
	}



	public void setPersonName(String personName) {
		this.personName = personName;
	}



	public void travel() {
		System.out.println("moving all");
		tyre.rotation();
		engine.move();
	}
	

}
