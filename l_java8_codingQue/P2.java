package l_java8_codingQue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P2 {
	public static void main(String[] args) {
		//Given a list of strings, group them by their length and
//		count the number of strings in each group using streams.
		
		List<String> words = Arrays.asList("apple", "banana", "grape", "apple", "cherry", "date", "elderberry", "fig");
		
		words.stream().collect(Collectors.groupingBy(String::length)).entrySet().forEach(System.out::println);
		
		Map<Integer,Long> map = words.stream().collect(Collectors.groupingBy(s->s.length(), Collectors.counting()));
		System.out.println(map);
		
		//Given a list of strings, sort them first by their length, 
		//and then alphabetically within groups of the same length using streams.
		words.stream().sorted(Comparator.comparingInt(String::length).thenComparing(String::compareTo)).forEach(System.out::println);
	}
}
