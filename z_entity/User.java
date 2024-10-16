package z_entity;

import java.util.Objects;

public class User {
	private String name;
	private String type;
	public User(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", type=" + type + "]";
	}
	@Override // This is for P5 Predicate.isEqual(Object) internally calls equals
	public boolean equals(Object o) {
		return this.getName().equals(((User)o).getName()) && this.getType().equals(((User)o).getType());
	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(name, type);
//	}
//	@Override
//	public boolean equals(Object obj) {
//		System.out.println("this "+this);
//		System.out.println("obj: "+obj);
//		System.out.println("getClass: "+getClass());
//		System.out.println("this.getClass: "+this.getClass());
//		System.out.println(obj.getClass());
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		User other = (User) obj;
//		return Objects.equals(name, other.name) && Objects.equals(type, other.type);
//	}
	
}
