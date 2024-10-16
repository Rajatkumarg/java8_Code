package questionInterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String str = "My name is Rajat Kumar. My name is rajat kumar";
		//remove duplicates
		String newStr = Arrays.stream(str.split(" ")).map(String::toLowerCase).distinct().collect(Collectors.joining(" "));
		System.out.println(newStr);
		//remove duplicates
		Set<String> set = Arrays.stream(str.split(" ")).map(String::toLowerCase).collect(Collectors.toSet());
		set.forEach(System.out::println);
		//remove all duplicates
		List<String> unique = Arrays.stream(str.split(" "))
		.map(String::toLowerCase)
		.collect(Collectors.groupingBy(word->word, Collectors.counting()))
		.entrySet()
		.stream()
		.filter(entry->entry.getValue()==1)
		.map(entry->entry.getKey())
		.collect(Collectors.toList());
		System.out.println(unique);
		
		//find each letter occurance
		String string = "Rajat Kumar";
		char[] arr = string.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(char ch: arr) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
