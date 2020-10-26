package practice_programs.generics;

public class Student<T extends Comparable<T>> implements Comparable<Student<T>>{
	
	private T regNo;
	private T name;
	private T dept;
	
	public Student() {
		
	}
	
	public Student(T regNo, T name, T dept) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.dept = dept;
	}
	
	public T getRegNo() {
		return regNo;
	}
	public void setRegNo(T regNo) {
		this.regNo = regNo;
	}
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public T getDept() {
		return dept;
	}
	public void setDept(T dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Student [regNo=" + regNo + ", name=" + name + ", dept=" + dept + "]";
	}

	@Override
	public int compareTo(Student<T> o) {
		return this.getRegNo().compareTo(o.getRegNo());
	}
}
