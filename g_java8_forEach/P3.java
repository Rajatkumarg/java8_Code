package g_java8_forEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class P3 {
	static int sum;
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,-3,4,5);
		Predicate<Integer> predicate = i->i>=0;
		list.forEach(i->{
			if(predicate.test(i))
				System.out.println(i);
		});
	}

}
