package i_java8_stream_filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import z_entity.Player;

public class P15 {

	public static void main(String[] args) {
		List<String> nameList= Arrays.asList("Amit","ravi","gyan","Sumit","ram","rajat");
		
		long count =  nameList.stream().filter(s->s.length()<5).count();
		System.out.println(count);
		
	}

}
