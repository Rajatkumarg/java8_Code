package h_java8_stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P2 {

	public static void main(String[] args) {
		char []arr = {'A','B','C'};
		String s = String.valueOf(arr);
		System.out.println(s);
		IntStream intStream = s.chars();
//		intStream.forEach(System.out::println);
		intStream.forEach(i->System.out.println((char)i));
	}

}
