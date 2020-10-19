package ntu_oops.classes3;

public class MyComplex {
	
	private double real;
	private double imag;
	
	public MyComplex() {
		
	}
	
	public MyComplex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}

	public void setValue(double real, double imag) {
		
	}
	@Override
	public String toString() {
		return "MyComplex [real=" + real + ", imag=" + imag + "]";
	}
	
}
