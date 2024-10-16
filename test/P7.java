package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class P7 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("bat");
		list.add("cat");
		List<String> list1 = new ArrayList<String>();
		list1.add("Appl");
		list1.add("ba");
		list1.add("ca");
//		Collections.disjoint(Collections.singleton(requestDto.getProductType()), datadto.getProductTypes())
		System.out.println(Collections.disjoint(list, list1));
		Set<List<String>> list2 = Collections.singleton(list);
	}
}
