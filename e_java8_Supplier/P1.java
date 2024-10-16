package e_java8_Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class P1 {
//	@FunctionalInterface
//	public interface Supplier<T> {
//	    T get();
//	}
	public static void main(String[] args) {
		Supplier<Integer> obj = ()->new Random().nextInt(10);
		System.out.println(obj.get());
	}

}
