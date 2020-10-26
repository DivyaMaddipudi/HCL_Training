package practice_programs.generics;

import java.util.Comparator;

class SortBasedOnSalaryThenName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int value = o1.getSalary().compareTo(o2.getSalary());
		if(value == 0) {
			value  = o1.getName().compareTo(o2.getName());
		}
		return value;
	}
}

public class Employee<T extends Comparable<T>> implements Comparable<Employee<T>>{
	
	private T id;
	private T name;
	private T salary;
	
	public Employee() {
		
	}

	public Employee(T id, T name, T salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public T getSalary() {
		return salary;
	}

	public void setSalary(T salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee<T> o) {
		return this.getId().compareTo(o.getId());
	}
}
