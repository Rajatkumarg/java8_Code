package h_java8_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P4 {

	public static void main(String[] args) {
		List<String> nameList= Arrays.asList("Rajat","Nishant","Muti");
		nameList.stream().map(String::toUpperCase).forEach(System.out::println);
	}

}
