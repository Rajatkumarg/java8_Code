package b_java8_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Predicate<T> - boolean test(T t);
public class P2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,-2,14,-3,-12,4,6,1,-9);
		Set<Integer> brr ;
		
		Predicate<Integer> obj = n->n>0;
		list.forEach(n->{
			if(obj.test(n))
				System.out.print(n+" ");
		});
		
//		list.stream().filter(n->n>0).forEach(System.out::println);
		
//		brr = list.stream().filter(n->n>0).collect(Collectors.toSet());
//		System.out.println(brr);
	}
}
