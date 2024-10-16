package test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MyTest {
	public static void main(String[]args) {
		List<String> people = Arrays.asList("Ram","Ravi","Cheena");
		Map<Character, String> sortedMap = people.stream().
				collect(Collectors.toMap	(str-> str.charAt(0),str->str,(existing,replacement)-> existing,TreeMap::new));
		sortedMap.forEach((key,value)-> System.out.println("key:"+key+"value:"+ value));
	}

}
