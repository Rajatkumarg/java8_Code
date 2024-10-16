package k_java8_stream_miscellaneous;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import z_entity.Employee;
import z_entity.Player;

public class P13 {
		public static void main(String[] args) {
			List<String> fruit = Arrays.asList("Apple","Banana","Orange","Mango");
			System.out.println(fruit.stream().filter(s->s.length()%2==0).mapToInt(String::length).sum());
			
			char[] ch = {'A','B','C'};
			String s1 = String.valueOf(ch);
			System.out.println(s1);
			IntStream intStream = s1.chars();
			System.out.println(intStream);
//			intStream.forEach(System.out::println);
			intStream.peek(System.out::println).mapToObj(i->(char)i).forEach(System.out::println);
			char c = (char)65;
			System.out.println(c);
		}
}
