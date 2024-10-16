package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class P8 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("bat");
		list.add("cat");
		Student s1 = new Student(1, "Rajat");
		Student s2 = new Student(2, "Nishant");
		Student s3 = new Student(3, "Muti");
		Student s4 = new Student(5, "Muti");;
//		Student s4 = null;
		List<Student> stuList = new ArrayList<Student>();
		stuList.add(s1);
		stuList.add(s2);
		stuList.add(s3);
		stuList.add(s4);
//		Map<String,Integer> newList = stuList.stream().filter(Objects::nonNull).collect(Collectors.toMap(Student::getName, Student::getRoll));
		
	}
}
