package l_java8_codingQue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class P5 {
	public static void main(String[] args) {
		//find the employee with the highest salary.
		List<Employee> employees = Arrays.asList(
			    new Employee(1, "John", "HR", 75000),
			    new Employee(2, "Jane", "IT", 82000),
			    new Employee(3, "Bob", "Finance", 92000),
			    new Employee(4, "Alice", "HR", 90000),
			    new Employee(5, "Alex", "IT", 85000)
			);
		employees.stream().collect(Collectors.maxBy((e1,e2)->(int)e1.getSalary()-(int)e2.getSalary())).ifPresentOrElse(System.out::println, null);
		//OR
		Employee emp = employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
		System.out.println("Employee with highest salary "+emp);
		
		//Group Employees by Department
		Map<String,List<Employee>> map = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(map);
		
		// Calculate the Average Salary by Department
		Map<String,Double> avgSalDeptMap = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(avgSalDeptMap);
		avgSalDeptMap.entrySet().stream().forEach((entry)->System.out.println("Average salary of "+entry.getKey()+" is "+entry.getValue()));
		
		//Write a stream-based solution to list employees whose salary is above a specified threshold (e.g., 85,000).
		System.out.println("Employee having salary more than 85000");
		employees.stream().filter(e->e.getSalary()>85000).collect(Collectors.toList()).forEach(System.out::println);
	
		//Get a List of All Employee Names in Alphabetical Order
		List<String> empNameInSorted = employees.stream().map(Employee::getName).sorted().collect(Collectors.toList());
		System.out.println(empNameInSorted);
	}
}
