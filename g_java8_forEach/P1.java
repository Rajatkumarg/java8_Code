package g_java8_forEach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class P1 {
	static int sum;
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
//		Consumer<Integer> consumer = i -> sum+=i;
		list.forEach(i -> sum+=i);
		System.out.println(sum);
	}

}
