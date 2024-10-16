package j_java8_stream_limit;

import java.util.Arrays;
import java.util.List;

public class P1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,2,6,1,8,3);
		list.stream().limit(3).forEach(System.out::println);
	}

}
