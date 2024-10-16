package d_java8_Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class P2 {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3,4,5);
		Consumer<List<Integer>> modify = list->{
			for(int i=0 ; i<list.size() ; i++)
				list.set(i, list.get(i)*2);
		};
		Consumer<List<Integer>> display = list->{
			for(int i=0 ; i<list.size() ; i++)
				System.out.println(list.get(i));
		};
		modify.andThen(display).accept(intList);
		
		//best
		intList.stream().map(i->{System.out.println("i: "+i); return i*2;}).forEach(System.out::println);
	}

}
