package c_java8_Function;

import java.util.Arrays;
import java.util.List;

//public interface Function<T,R>{
//R apply(T t);
//}

import java.util.function.Function;
import java.util.stream.Collectors;

import z_entity.Employee;

public class P4 {

	public static void main(String[] args) {
		Employee e1 = new Employee("Rajat",4,50000);
		Employee e2 = new Employee("Rajat",8,20000);
		Employee e3 = new Employee("Rajat",2,120000);
		Employee e4 = new Employee("Rajat",6,90000);
		Employee e5 = new Employee("Rajat",1,60000);
		Employee e6 = new Employee("Rajat",0,80000);
		
		List<Employee> empList = Arrays.asList(e1, e2, e3, e4, e5, e6);
		
		Function<Employee, Character> obj = emp->{
			return emp.getProjectsDone()>5 ? 'A' : emp.getProjectsDone()>2 ? 'B' : emp.getProjectsDone()>0 ? 'C' :'D';
		};
		
//		List<Character> charList = empList.stream().map(obj).collect(Collectors.toList());
//		System.out.println(charList);
		
		empList = empList.stream().map(e->{
			e.setGrade(obj.apply(e));
			return e;
		}).collect(Collectors.toList());
		System.out.println(empList);
	}
}
