package c_java8_Function;

//public interface Function<T,R>{
//	R apply(T t);
//}

import java.util.function.Function;

public class P1 {

	public static void main(String[] args) {
		Function<String, String> obj = name->name.split(" ")[0];
		System.out.println(obj.apply("Rajat Kumar"));
	}
}