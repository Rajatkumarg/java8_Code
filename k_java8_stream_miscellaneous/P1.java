package k_java8_stream_miscellaneous;

import java.util.Arrays;
import java.util.List;

public class P1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,2,6,1,8,3,2,1);
		list.stream().distinct().forEach(System.out::println);
	}
}
