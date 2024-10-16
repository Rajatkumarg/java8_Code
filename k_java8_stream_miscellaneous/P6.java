package k_java8_stream_miscellaneous;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import z_entity.Employee;

public class P6 {
		public static void main(String[] args) {
			List<Employee> empList = List.of(
				new Employee("Ram",54,1000),
				new Employee("Shyam",58,4000),
				new Employee("Mohan",62,3000),
				new Employee("Sohan",52,2000)
				);
			Employee emp = empList.stream().max((e1,e2)->e1.getProjectsDone()-e2.getProjectsDone()).orElse(null);
			System.out.println(emp);
		}
}
