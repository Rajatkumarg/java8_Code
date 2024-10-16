package k_java8_stream_miscellaneous;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class P5 {
		public static void main(String[] args) {
			List<Integer> nameList= Arrays.asList(5,3,1,7,2,9,8);
			Optional<Integer> optional =  nameList.stream().max((a,b)->a-b);
			if(optional.isPresent())
			System.out.println(optional.get());
//			nameList.stream().min((a,b)->a-b).ifPresent(System.out::println);
		}
}
