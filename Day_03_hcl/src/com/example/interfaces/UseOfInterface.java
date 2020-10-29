package com.example.interfaces;

interface MathConstant {
	public static final double PI = Math.PI;
}

class MathLib implements MathConstant {
	public void cal() {
		double val = PI*3;
	}
}

class MathLib2 implements MathConstant {
	public void cal() {
		double val = PI*3;
	}
}

public class UseOfInterface {

}
