package h_java8_stream;

import java.util.Arrays;

public class P1 {

	public static void main(String[] args) {
		int []arr = {10,20,30};
		Arrays.stream(arr).forEach(System.out::println);
	}

}
