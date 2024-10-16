package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P1 {
 
	public static void main(String[] args) {
		Student s1 = new Student(1, "Rajat");
		Student s2 = new Student(1, "Nishant");
		Student s3 = new Student(1, "Muti");
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(s1);
		stuList.add(s2);
		stuList.add(s3);
		System.out.println(stuList);
		Student ss = stuList.stream().filter(s->s!=null && s.getName().equals("Rajat")).findFirst().orElse(null);
		System.out.println(ss);
		List<Student> newStuList = stuList.stream().filter(s -> s.getName().equals("Rajat")).collect(Collectors.toList());
		System.out.println(newStuList);
		
		
		List<String> strList = stuList.stream().filter(s -> s.getName().equals("Rajat")).map(s->s.getName().concat(" Kumar"))
				.map(obj->obj)
				.collect(Collectors.toList());
		
		
		
		
		System.out.println(strList);
		stuList.stream().forEach(System.out::println);
		
		
		if(s1.getO().getA()==10) {
			s1.getO().setA(20);
		}
		System.out.println("AAA");
		System.out.println(s1.getO().getA());
	}

}
