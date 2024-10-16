package questionInterview;

import java.util.*;

public class HashMap1 {
	String name;
	
	public HashMap1(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "HashMap1 [name=" + name + "]";
	}

	public static void main(String[] args) {
		Map map = new HashMap();
		String str1 = "Hello";
		String str2 = "Hello";
		map.put(str1, "H1");
		map.put(str2, "H2");
		System.out.println(str1==str2);
		map.entrySet().forEach(System.out::println);
		
		str1 = new String("Hello");
		str2 = new String("Hello");
		map.put(str1, "H1");
		map.put(str2, "H2");
		System.out.println(str1==str2);
		map.entrySet().forEach(System.out::println);
		
		HashSet1 obj1 = new HashSet1("Hello");
		HashSet1 obj2 = new HashSet1("Hello");
		System.out.println(obj1==obj2);
		System.out.println(map.put(obj1,"H11"));
		System.out.println(map.put(obj2,"H22"));
		map.entrySet().forEach(System.out::println);
	}
}
