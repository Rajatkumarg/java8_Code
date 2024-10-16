package b_java8_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import z_entity.User;

//Predicate<T> - boolean test(T t);
public class P4 {

	public static void main(String[] args) {
		User u1 = new User("Rajat","Admin");
		User u2 = new User("Nishant","Admin");
		User u3 = new User("Abhishek","Admin");
		User u4 = new User("Pramod","Employee");
		User u5 = new User("Akash","Employee");
		User u7 = new User("Ramesh","HR");
		User u8 = new User("Arnav","Consultant");
		User u6 = new User("Rahul","Employee");
		List<User> userList = Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8);
		System.out.println(process(userList));
	}

	private static List<User> process(List<User> userList) { 
		Predicate<User> name = u->u.getName().startsWith("A");
		Predicate<User> admin = u->u.getType().equalsIgnoreCase("admin");
		Predicate<User> emp = u->u.getType().equalsIgnoreCase("employee"); 
		Predicate<User> p = name.and((admin.or(emp)).negate());
		return userList.stream().filter(u->p.test(u)).collect(Collectors.toList());
	}
}
