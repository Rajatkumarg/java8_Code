package l_java8_codingQue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P6 {
	public static void main(String[] args) {
		//1.Count the Number of Unique Characters in a String
		String str = "Rajat";
		IntStream intStream =  str.chars();
		List<Character> list = intStream.mapToObj(e->(char)e).collect(Collectors.toList());
		long l =list.stream().distinct().count();
		System.out.println(l);
		//OR
		System.out.println(str.chars().distinct().count());
		
		//2.Find the Most Frequent Character in a String
		Map<Character,Long> map = str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		char ch =map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
		System.out.println(ch);
		
		//3.Reverse Words in a Sentence
		String input = "The sky is blue";
		List<String> wordList = Arrays.asList(input.split(" "));
		Collections.reverse(wordList);
		String output = wordList.stream().collect(Collectors.joining(" "));
		System.out.println(output);
		
		//4. Check if Two Strings are Anagrams
		String str1 = "listen";
        String str2 = "silent";
        boolean b =Arrays.equals(str1.chars().sorted().toArray(), str2.chars().sorted().toArray());
        System.out.println(b);
        
        //5. Remove All Vowels from a String
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        String word = str.chars().mapToObj(e->(char)e).filter(c->!vowels.contains(c)).map(String::valueOf).collect(Collectors.joining());
        System.out.println(word);
	}
}
