package h_java8_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P7 {

	public static void main(String[] args) {
		List<String> nameList= Arrays.asList("1","2","3");
		nameList.stream().map(Integer::parseInt).map(i->Math.pow(i,2)).forEach(System.out::println);
	}

}
