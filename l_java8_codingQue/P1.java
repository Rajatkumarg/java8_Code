package l_java8_codingQue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Write a function to find out duplicate word in given string and print it
public class P1 {
	public static void main(String[] args) {
		//Normal approach
		String str = "This is a test. This test is only a test.";
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] strArray = str.split(" ");
		for(String s: strArray) {
			map.put(s, map.getOrDefault(s, 0)+1);
		}
		System.out.println(map);
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry);
			}
		}
		
		//using stream
		Stream strStream = Arrays.stream(str.split(" ")).map(s->s);
		map=  (Map<String, Integer>) strStream.collect(Collectors.toMap(s->s,s->1, Integer::sum));
		System.out.println(map);
		map.entrySet().stream().filter(entry->entry.getValue()>1).forEach(entry->System.out.println(entry.getKey()));
		map.entrySet().removeIf(entry->entry.getValue()<2);
		System.out.println("After removing non duplicate word : "+map);
	}
}
