package questionInterview;

import java.util.stream.IntStream;

public class Test {
	public static void main(String[] args) {
		String str = "ROTATO";
		boolean isPallindrome = IntStream.range(0, str.length()/2).
				allMatch(i->str.charAt(i)==str.charAt(str.length()-1-i));
		System.out.println(isPallindrome);
		
	}
}
