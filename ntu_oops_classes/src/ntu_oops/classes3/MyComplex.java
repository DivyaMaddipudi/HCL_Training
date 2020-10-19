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
		this.real = real;
		this.imag = imag;
	}
	
	@Override
	public String toString() {
		return real + " + " + imag + "i" ;
	}
	
	public boolean isReal() {
		return (imag == 0);
	}
	
	public boolean isImaginary() {
		return (real == 0);
	}
	
	public boolean equals(double real, double imag) {
		boolean isEqual = false;
		if(this.real == real && this.imag == imag) {
			isEqual = true;
		}
		return isEqual;
	}
	
	public boolean equals(MyComplex complex) {
		boolean isEqual = false;
		if(this.real == complex.real && this.imag == complex.imag) {
			isEqual = true;
		}
		return isEqual;
	}
	
	public double magnitude() {
		return Math.sqrt(Math.pow(getReal(), 2) + Math.pow(getImag(), 2));
	}
	
	public double argument() {
		return Math.atan2(getImag(), getReal());
	}
	
	public MyComplex add(MyComplex complex) {
		
		complex.setReal(complex.real);
		complex.setImag(complex.imag);
		
		double sumReal = 0.0;
		double sumImag = 0.0;
		
		sumReal = this.real + this.real;
		sumImag = this.imag + this.imag;
		
		setReal(sumReal);
		setImag(sumImag);
		
		return this;
		
	}
	
	public MyComplex addNew(MyComplex complex) {
		
		double sumReal = 0.0;
		double sumImag = 0.0;
		
		sumReal = getReal() + complex.real;
		sumImag = getImag() + complex.imag;
		
		return new MyComplex(sumReal, sumImag);
	}
	
	public String conjugate() {
		return this.real + " - " + this.imag + "i";
	}
	
}
