package j_java8_stream_limit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,2,6,1,8,3);
		list.stream().sorted((a,b)->b.compareTo(a)).limit(3).forEach(System.out::println);
		//OR
		list.stream().sorted(new MyIntSort()).limit(3).forEach(System.out::println);
		
	}

}
class MyIntSort implements Comparator<Integer>{

	@Override
	public int compare(Integer a, Integer b) {
		return b.compareTo(a);
	}

	
}