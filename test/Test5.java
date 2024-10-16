package test;
import java.util.*;

//Write a function to find out duplicate words in a given string?
//
//String string = "Big black bug bit a big black dog on his big black nose";
//
//Output
//
//Duplicate words in a given string: big 3 black 3
public class Test5 {
	
	public static void findDuplicate(String input) {
		if(input == null || input.isEmpty()) {
			System.out.println("Input string is empty");
			return;
		}
		String[] words = input.split(" ");
		Map<String, Integer> wordCount = new HashMap<>();
		for(String word : words) {
			word = word.toLowerCase();
			wordCount.put(word,wordCount.getOrDefault(word,0)+1);
		}
		boolean foundDuplicate = false;
		for(Map.Entry<String, Integer>entry:wordCount.entrySet()) {
//			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+":"+entry.getValue());
				foundDuplicate = true;
//			}
		}
		if(!foundDuplicate) {
			System.out.println("no duplicates");
		}
		
	}
	public static void main (String args[]) {
		String input = "Big black bug bit a big black dog on his big black nose";
		findDuplicate(input);
	}

}
