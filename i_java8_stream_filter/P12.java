package i_java8_stream_filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import z_entity.Player;

public class P12 {

	public static void main(String[] args) {
		List<String> nameList= Arrays.asList("Amit","ravi","gyan","Sumit","ram","rajat");
//		List<String> newList =  nameList.stream().filter(s->s.length()>4).map(String::toUpperCase)
//				.collect(Collectors.toList());
//		System.out.println(newList);
		
		List<String> newList =  nameList.stream().filter(s->s.length()>4).peek(System.out::println).map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(newList);
		
	}

}
