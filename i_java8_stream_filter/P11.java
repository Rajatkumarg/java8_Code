package i_java8_stream_filter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import z_entity.Player;

public class P11 {

	public static void main(String[] args) {
		List<Integer> nameList= Arrays.asList(5,3,1,2);
		
//		Comparator<Integer> comp = (o1,o2)->o2-o1;
//		nameList.stream().sorted((o1,o2)->o2-o1).forEach(System.out::println);
		
		//OR
		
//		nameList.stream().sorted(new MyIntSort()).forEach(System.out::println);
		
		//OR
		
		nameList.stream().sorted(new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return b-a;
			}
		}).forEach(System.out::println);
		
	}

}
//class MyIntSort implements Comparator<Integer>{
//
//	@Override
//	public int compare(Integer o1, Integer o2) {
//		// TODO Auto-generated method stub
//		return o1-o2;
//	}
//
//}