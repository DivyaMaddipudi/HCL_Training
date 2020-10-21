package com.overriding_object_methods;

class Emp implements Cloneable{
	
	private int id;
	private String name;
	private double salary;
	
	
	
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize is called");
		super.finalize();
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Emp [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", salary=");
		builder.append(salary);
		builder.append("]");
		return builder.toString();
	}

}

public class DemoOnOverridingEqualsMethod {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
//		Object emp = new Emp(121, "divya", 5000.0);
//		Object emp1 = new Emp(121, "divya", 5000.0);
//		Class c1 = emp.getClass();
//		Class c2 = emp1.getClass();
//		System.out.println(c1);
//		System.out.println(c2);
		
//		Emp emp = new Emp(121, "divya", 5000.0);
//		Emp emp1 = new Emp(121, "divya", 5000.0);
//		
//		if(emp.equals(emp1)) {
//			System.out.println("equal");
//		} else {
//			System.out.println("not");
//		}
		
		
//		Emp emp = new Emp(121, "divya", 5000.0);
//		Emp emp2= (Emp) emp.clone();
//		System.out.println(emp);
//		System.out.println(emp2);
		
		Emp emp = new Emp(121, "divya", 5000.0);
		emp = null;
		Runtime.getRuntime().gc();
		
		
		StringBuilder b = new StringBuilder('x').append('y');
		System.out.println(b);
		//System.gc();
		
		
	}

}
