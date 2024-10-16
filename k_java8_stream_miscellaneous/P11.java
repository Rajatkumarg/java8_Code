package k_java8_stream_miscellaneous;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import z_entity.Employee;

public class P11 {
		public static void main(String[] args) {
			List<Integer> arr = List.of(2,1,3,4,5);
			System.out.println(arr.stream().mapToInt(e->e).sum());
		}
}
