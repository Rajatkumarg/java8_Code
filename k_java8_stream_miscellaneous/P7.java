package k_java8_stream_miscellaneous;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import z_entity.Employee;

public class P7 {
		public static void main(String[] args) {
			List<Employee> empList = List.of(
				new Employee("Ram",54,1000),
				new Employee("Shyam",58,4000),
				new Employee("Mohan",62,3000),
				new Employee("Sohan",52,2000)
				);
			Optional<Employee> optional = empList.stream().filter(emp->emp.getProjectsDone()>50 && emp.getProjectsDone()<60).findFirst();
			optional.ifPresent(System.out::println);
		}
}
