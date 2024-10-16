package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class Occurance {
	
	int a= 10;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static void main(String[] args) {
		String str = "Hello World";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] charArray  = str.toCharArray();
		System.out.println(str);
		System.out.println(charArray);
//		for(char ch: charArray) {
//			if(map.containsKey(ch)){
//				int value = map.get(ch);
//				map.put(ch, value+1);
//			}
//			else {
//				map.put(ch, 1);
//			}
//		}
		for(int i=0 ; i<str.length() ; i++) {
			char ch = str.charAt(i);
			if(map.containsKey(ch)){
				int value = map.get(ch);
				map.put(ch, value+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
		System.out.println(entrySet);
		
		for(Map.Entry<Character, Integer> entry: entrySet) {
			System.out.println(entry.getKey()+" comes "+entry.getValue()+" times");
		}
		
		
		Set<String> set = Set.of("Apple","Bat","Cat");
		for(String s: set) {
			System.out.println(s);
		}
	}
}
