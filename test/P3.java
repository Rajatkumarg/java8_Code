package test;

public class P3 {
	public static void main(String[] args) {
		String s = "part#partner#type";
		String[] str = s.split("#");
		String part = str[0];
		String partner = str[1];
		String type = str[2];
		System.out.println(part+" "+partner+" "+type);
	}
}
