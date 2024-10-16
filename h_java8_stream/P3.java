package h_java8_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P3 {

	public static void main(String[] args) {
		List<String> nameList= Arrays.asList("Rajat","Nishant","Muti");
		Long l1 = System.currentTimeMillis();
		nameList.stream().map(s->s.substring(0,3)).forEach(System.out::println);;//slow
		System.out.println(System.currentTimeMillis()-l1);
		l1 = System.currentTimeMillis();
		Stream<String> stream = nameList.stream().map(s->s.substring(0,3));//fast
		stream.forEach(System.out::println);
		System.out.println(System.currentTimeMillis()-l1);
	}

}
