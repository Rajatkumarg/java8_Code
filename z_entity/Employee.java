package z_entity;

public class Employee {
	private String name;
	private int projectsDone;
	private double salary;
	private char grade;
	public Employee(String name, int projectsDone, double salary) {
		super();
		this.name = name;
		this.projectsDone = projectsDone;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getProjectsDone() {
		return projectsDone;
	}
	public void setProjectsDone(int projectsDone) {
		this.projectsDone = projectsDone;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public char getGrade() {
		return this.grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", projectsDone=" + projectsDone + ", salary=" + salary + ", grade=" + grade
				+ "]";
	}
	
}
