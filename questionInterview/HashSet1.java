package questionInterview;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
	String name;
	
	public HashSet1(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "HashSet1 [name=" + name + "]";
	}

	public static void main(String[] args) {
		Set set = new HashSet();
		String str1 = "Hello";
		String str2 = "Hello";
		set.add(str1);
		set.add(str2);
		System.out.println(str1==str2);
		System.out.println(set);
		
		str1 = new String("Hello");
		str2 = new String("Hello");
		System.out.println(set.add(str1));
		System.out.println(set.add(str2));
		System.out.println("--------"+str1==str2);
		System.out.println(set);
		
		HashSet1 obj1 = new HashSet1("Hello");
		HashSet1 obj2 = new HashSet1("Hello");
		System.out.println(obj1==obj2);
		System.out.println(set.add(obj1));
		System.out.println(set.add(obj2));
		System.out.println(set);
	}
}
