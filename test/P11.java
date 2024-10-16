package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P11 {
public static void main(String[] args) {
//	String s = "Abcd";
//	System.out.println(s.indexOf(99));
//	System.out.println(s.compareTo("atrg"));
	
//	StringBuffer sb = new StringBuffer("1");
//	sb.ensureCapacity(20);
//	System.out.println(sb.capacity());
//	System.out.println(sb.length());
	
	List<String> l = Arrays.asList("A","B","A");
	System.out.println(l);
	Set<String> s = new HashSet(l);
	System.out.println(s);
}
}
