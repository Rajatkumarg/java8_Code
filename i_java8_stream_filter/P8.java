package i_java8_stream_filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P8 {

	public static void main(String[] args) {
		List<Integer> nameList= Arrays.asList(2,5,4,15,10,78);
		nameList.stream().filter(i->i%5==0).forEach(System.out::println);
	}

}
