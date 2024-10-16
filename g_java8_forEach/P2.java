package g_java8_forEach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.ArrayList;

public class P2 {
	static int sum;
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<Integer> newList = new ArrayList<Integer>();
		Consumer<Integer> consumer = i -> {if(i%2==0) newList.add(i);}; 
		list.forEach(consumer);
		newList.forEach(System.out::println);
	}

}
