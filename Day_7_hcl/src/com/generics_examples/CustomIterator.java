package com.generics_examples;
import java.util.*;
// how to create custom iterator: Iterable, Iterator

class Student {
	private int id;
	private String name;
	private int marks;
	
	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
}
class School implements Iterable<Student>{
	private List<Student> students;
	
	public School() {
		
	}
	public School(List<Student> students) {
		this.students = students;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}

	@Override
	public Iterator<Student> iterator() {
		return new SchoolIterator();
	}
	
	class SchoolIterator implements Iterator<Student> {
		int index = 0;
		@Override
		public boolean hasNext() {
			if(index >= students.size())
				return false;
			return true;
		}

		@Override
		public Student next() {
			return students.get(index++);
		}
		
		@Override
		public void remove() {
			students.remove(index);
		}
	}
	
}
public class CustomIterator {
	public static void main(String[] args) {
		
		School school = new School();
		school.addStudent(new Student(121, "divya", 89));
		
	}
}
