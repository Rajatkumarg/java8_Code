package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class P5 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add(null);
		list.add("bat");
		list.add("cat");
		System.out.println(list.contains("bat"));
		System.out.println(list.stream().filter(s-> s!=null && s.equals("Apple")).count());
		
		Map<String, String> map = new HashMap<String,String>();
		System.out.println(map.get("a"));
		map.put("a", "Apple");
		System.out.println(map);
		map.put("a", map.get("a")+", "+"Bat");
		System.out.println(map);
		
		list = new ArrayList();
//		list.add("Apple");
//		System.out.println(list.stream().filter(s->s.equals("Apple")).count());
		System.out.println(list.isEmpty());
		for(String s: list) {
			System.out.println(s+"A");
		}
	}
}
