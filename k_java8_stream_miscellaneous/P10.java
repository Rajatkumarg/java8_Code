package k_java8_stream_miscellaneous;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import z_entity.Employee;

public class P10 {
		public static void main(String[] args) {
			int[] arr = {2,1,3,4,5};
			System.out.println(Arrays.stream(arr).average().getAsDouble());
		}
}
