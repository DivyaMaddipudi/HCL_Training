package com.day2.covarientType;

class Milk {
	public int spoilTime() {
		return 16;
	}
}

class PasteurizedMilk extends Milk {
	
	public int spoilTime() {
		return 16*3;
	}
}

class KrishD {
	public Milk getMilk() {
		return new Milk();
	}
}

class krishDImp extends KrishD {
	
	@Override
	public PasteurizedMilk getMilk() {
		return new PasteurizedMilk();
	}
}
public class DemoCovarientType {
	
	public static void main(String[] args) {
		krishDImp kImp = new krishDImp();
		System.out.println(kImp.getMilk().spoilTime());
	}

}
