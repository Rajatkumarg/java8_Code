package l_java8_codingQue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P7 {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
	            new Student("Alice", "Computer Science", 3.8),
	            new Student("Bob", "Mathematics", 3.5),
	            new Student("Charlie", "Physics", 3.9),
	            new Student("David", "Computer Science", 3.6),
	            new Student("Eve", "Mathematics", 3.7)
	        );
		
		//1. Find the Student with the Highest GPA in Each Major
		Map<String,Optional<Student>> map =  students.stream().collect(Collectors.groupingBy(Student::getMajor, Collectors.maxBy(Comparator.comparingDouble(Student::getGpa))));
		map.entrySet().forEach(entry->{
			System.out.println(entry.getKey()+" "+entry.getValue().get().getGpa());
		});
		System.out.println("------------11111----------------");
		//2. find the top 3 students with the highest GPA
		students.stream().sorted(Comparator.comparing(Student::getGpa).reversed()).limit(3).forEach(System.out::println);
		students.stream().sorted(Comparator.comparingDouble(Student::getGpa).reversed()).limit(3).forEach(System.out::println);
		System.out.println("-------------------22222-------------");
		//3. calculate the average GPA of students for each major.
		students.stream().collect(Collectors.groupingBy(s->s.getMajor(), Collectors.averagingDouble(s->s.getGpa()))).entrySet().forEach(entry->{
			System.out.println(entry.getKey()+" "+entry.getValue());
		});;
		students.stream().collect(Collectors.groupingBy(Student::getMajor, Collectors.averagingDouble(Student::getGpa))).entrySet().forEach(System.out::println);
		System.out.println("------------3333333--------------");
		
		//4. Assume each student has a list of courses also they are enrolled in. Find list of all unique courses across all students.
		//students.stream().flatMap(s->s.getCourses().stream()).distinct().collect(Collectors.toList()).forEach(System.out::println);;
		//5. partition students into two groups: those who have a GPA above a certain threshold (e.g., 3.7) and those who do not.
		students.stream().collect(Collectors.partitioningBy(s->s.getGpa()>3.7)).entrySet().forEach(entry->{
			System.out.println(entry.getKey()+" "+entry.getValue());
		});
		
		System.out.println("--------4444444-------------");
		//remove duplicate words
		String str = "I live in India. India is in my my Heart";
		Stream<String> stream = Arrays.stream(str.split(" "));
		String result = stream.distinct().collect(Collectors.joining(" "));
		System.out.println(result);
	}
}
