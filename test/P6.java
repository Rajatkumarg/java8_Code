package test;

import java.util.*;

public class P6 {
	public static void main(String[] args) {
		int a = Math.addExact(1, 4);
		System.out.println(a);
		Map<String,String> map = new HashMap<String,String>();
		map.put("A", "Apple");
		System.out.println(map);
		System.out.println(map.get("B"));
		System.out.println(null+"abc");
		String s1 = null;
		String s2 = null;
		String s3 = s2+"+"+s1;
		System.out.println(s3);
		String s4 = null;
		String s5 = null;
		String s6 = s4+"+"+s5;
		System.out.println(s6);
		System.out.println(s6.equals(s3));
	}
}
