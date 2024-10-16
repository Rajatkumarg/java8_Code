package l_java8_codingQue;

import java.util.List;

public class Student {
    private String name;
    private String major;
    private double gpa;
    private List<String> courses;
	public Student(String name, String major, double gpa) {
		super();
		this.name = name;
		this.major = major;
		this.gpa = gpa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", major=" + major + ", gpa=" + gpa + "]";
	}
    
}
