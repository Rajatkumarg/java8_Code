package k_java8_stream_miscellaneous;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import z_entity.Employee;
import z_entity.Player;

public class P20 {
	public static void main(String[] args) {
//		Random random = new Random();
//		int r = random.nextInt(100);
//		System.out.println(r);
//		Stream.generate(()->new Random().nextInt(100)).forEach(System.out::println);
		List<Integer> intList = Stream.generate(()->new Random().nextInt(100)).limit(10).collect(Collectors.toList());
		System.out.println(intList);
		
		intList = Stream.iterate(2, i->i*3).limit(5).collect(Collectors.toList());
		System.out.println(intList);
		
		//sum of first 5 odd no
		int sum = Stream.iterate(1, i->i+2).limit(5).mapToInt(e->e).peek(System.out::println).sum();
		System.out.println(sum);
	}
}
