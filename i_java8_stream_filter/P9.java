package i_java8_stream_filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P9 {

	public static void main(String[] args) {
		List<String> nameList= Arrays.asList("Amit","ravi","gyan","Sumit","ram");
		nameList.stream().filter(str->Character.isUpperCase(str.charAt(0))).forEach(System.out::println);
	}

}
