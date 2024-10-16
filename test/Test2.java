package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
public static void main(String[] args) {
//	String str = "Ram"+"\\+[.]+";
//	System.out.println(str);
//	
//	str = "Apple@Bat@Cat";
//	String arr[] = str.split("@");
//	Arrays.stream(arr).forEach(System.out::println);
	
	List<String> l1 = new ArrayList<>();
	l1.add("A");
	l1.add("B");
	System.out.println(l1);
	
	List l2 = new ArrayList(l1);
//	l2.addAll(l1);
	l2.add("C");
	System.out.println(l2);
	System.out.println(l1);
}
}
