package z_entity;

import java.util.Objects;

public class Player{// implements Comparator<Player>{ //implements Comparable{
	private int ranking;
	private String name;
	private String address;
	private int age;
	
	public Player() {
		
	}
	public Player(int age) {
		this.age = age;
	}
	public Player(int ranking, String name) {
		super();
		this.ranking = ranking;
		this.name = name;
	}

	public Player(int age, int ranking, String name) {
		super();
		this.ranking = ranking;
		this.name = name;
		this.age = age;
	}
	
	public Player(int ranking, String name, String address) {
		super();
		this.ranking = ranking;
		this.name = name;
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Player [ranking=" + ranking + ", name=" + name + ", age=" + age + "]";
	}
	
//	@Override //Comparator
//	public int compare(Player p1, Player p2) {
//		return p1.getRanking()>p2.getRanking()? 1: p1.getRanking()==p2.getRanking() ? 0 : -1;
//	}
	
//	@Override //Comparable
//	public int compareTo(Object o) {
//		Player p1 = this;
//		Player p2 = (Player)o;
//		return p1.getRanking()>p2.getRanking()? 1: p1.getRanking()==p2.getRanking() ? 0 : -1;
//	}
	
}
