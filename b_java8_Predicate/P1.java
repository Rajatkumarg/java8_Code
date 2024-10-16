package b_java8_Predicate;

import java.util.function.Predicate;

//Predicate<T> - boolean test(T t);
public class P1 {

	public static void main(String[] args) {
//		Predicate obj = str->((String)str).equals(new StringBuffer((String)str).reverse().toString());
		Predicate<String> obj = str->str.equals(new StringBuffer(str).reverse().toString());
		System.out.println(obj.test("Hello"));
		System.out.println(obj.test("12321"));
	}

}
