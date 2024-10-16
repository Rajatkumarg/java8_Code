package c_java8_Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import z_entity.Employee;

public class P5 {
	//public interface Function<T,R>{
	//R apply(T t);
	//}
//	compose and andThen - reverse to each other
	public static void main(String[] args) {
		Function<Integer, Integer> add = n->n*2;
		Function<Integer, Integer> mul = n->n*n;
		Function<Integer, Integer> addThenMul = add.andThen(mul);
		System.out.println(addThenMul.apply(4));
		addThenMul = mul.compose(add);
		System.out.println(addThenMul.apply(4));
	}
}
