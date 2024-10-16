package test;

public class Student {
	private String name;
	private int roll;
	private boolean pinned;
	 public Occurance o;
	 
	 
	public Student() {
		super();
	}
	public Student( int roll,String name, boolean pinned) {
		super();
		this.name = name;
		this.roll = roll;
		this.pinned = pinned;
	}
	public boolean isPinned() {
		return pinned;
	}
	public void setPinned(boolean pinned) {
		this.pinned = pinned;
	}
	public Occurance getO() {
		return o;
	}
	public void setO(Occurance o) {
		this.o = o;
	}
	public Student(int roll, String name) {
		super();
		this.name = name;
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", isPinned= "+pinned+"]";
	}
	
}
