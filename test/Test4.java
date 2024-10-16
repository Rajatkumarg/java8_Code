package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test4 {
public static void main(String[] args) {
	Student s1 = new Student(1, "Rajat");
	Student s2 = new Student(2, "Nishant");
	Student s3 = new Student(3, "Muti");
	List<Student> stuList = new ArrayList<Student>();
	stuList.add(s1);
	stuList.add(s2);
	stuList.add(s3);
	List<Student> newList = stuList.stream().filter(obj->obj.getName().equals("Nishant")).map(obj->{
		for(char ch: obj.getName().toCharArray()) {
		Student s = new Student();
		s.setName(ch+"");
		return s;
		}
		return new Student();
	}).collect(Collectors.toList());
	System.out.println(newList);
}
}
