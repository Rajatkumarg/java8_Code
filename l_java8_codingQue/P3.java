package l_java8_codingQue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Given a list of integers, find the most frequent element using streams. If there are multiple elements with the same frequency, return any one of them.
public class P3 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 4);
		
		Map<Integer,Integer> map = numbers.stream().collect(Collectors.toMap(n->n,n->1,Integer::sum));
		System.out.println(map.entrySet().stream().max((a,b)->a.getValue()-b.getValue()).get().getKey());
		
		//OR
		
		int mostFrequent = numbers.stream()
			    .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
			    .entrySet().stream()
			    .max(Map.Entry.comparingByValue())
			    .get().getKey();
			System.out.println(mostFrequent);

	}
}
