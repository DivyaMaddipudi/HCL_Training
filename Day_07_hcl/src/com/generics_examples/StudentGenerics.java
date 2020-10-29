package com.generics_examples;

class Students<T extends Comparable<T>> implements Comparable<Students<T>> {
	
	private T id;
	private T name;
	private T marks;
	
	public Students() {
		
	}
	public Students(T id, T name, T marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public T getId() {
		return id;
	}
	public void setId(T id) {
		this.id = id;
	}
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public T getMarks() {
		return marks;
	}
	public void setMarks(T marks) {
		this.marks = marks;
	}
	
	

	@Override
	public String toString() {
		return "PrintMaxObject [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Students<T> o) {
		
		return this.getMarks().compareTo(o.getMarks());
	}
}


class StudentGenerics {
	public static void main(String[] args) {
			
		Students student = new Students(1, "divya", 89);
		Students student1 = new Students(2, "divya", 85);
		Students student2 = new Students(3, "divya", 90);
		System.out.println(findMax(student1, student1, student2));
	}

	private static <T extends Comparable<T>> T findMax(T a, T b, T c) {
		T max = a;
		if(a.compareTo(b) < 0) {
			max = b;
		}
		if(max.compareTo(c) < 0) {
			max = c;
		}
		return max;
	}
}

