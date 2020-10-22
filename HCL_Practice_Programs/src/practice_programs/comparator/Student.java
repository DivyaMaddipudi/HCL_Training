package practice_programs.comparator;

public class Student {
	
	private int regNo;
	private String name;
	private String dept;
	private int age;
	public Student(int regNo, String name, String dept, int age) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}
	
	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [regNo=");
		builder.append(regNo);
		builder.append(", name=");
		builder.append(name);
		builder.append(", dept=");
		builder.append(dept);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}
}
