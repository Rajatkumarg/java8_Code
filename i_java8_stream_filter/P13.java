package i_java8_stream_filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import z_entity.Player;

public class P13 {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(5,4,3,1,2);
		List<Integer> newList = list.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(newList);
	}

}
