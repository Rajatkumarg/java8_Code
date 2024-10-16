package l_java8_codingQue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Given a list of lists of integers, flatten it into a single list using streams.
public class P4 {
	public static void main(String[] args) {
		List<List<Integer>> nestedList = Arrays.asList(
			    Arrays.asList(1, 2, 3),
			    Arrays.asList(4, 5),
			    Arrays.asList(6, 7, 8, 9)
			);
		List<Integer> newlist = nestedList.stream().flatMap(list->list.stream()).collect(Collectors.toList());
		System.out.println(newlist);
		
		//Given a list of integers, partition it into two lists: 
		//one containing the even numbers and the other containing the odd numbers using streams.
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Map<Boolean,List<Integer>> map = numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));
		System.out.println(map);
	}
}
