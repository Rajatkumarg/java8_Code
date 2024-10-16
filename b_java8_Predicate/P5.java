package b_java8_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import z_entity.User;

//Predicate<T> - boolean test(T t);
public class P5 {

	public static void main(String[] args) {
		User u1 = new User("Rajat","Admin");
		User u2 = new User("Nishant","Admin");
		User u3 = new User("Abhishek","Admin");
		User u4 = new User("Pramod","Employee");
		User u5 = new User("Akash","Employee");
		User u7 = new User("Ramesh","HR");
		User u8 = new User("Arnav","Consultant");
		User u6 = new User("Rahul","Employee");
		List<User> userList = Arrays.asList(u3, u4, u1, u2,  u5, u6, u7, u8);
		Predicate<User> p = Predicate.isEqual(new User("Nishant","Admin"));
		System.out.println(findUser(userList, p));
	}

	private static boolean findUser(List<User> userList, Predicate<User> p) { 
		return userList.stream().anyMatch(p);
//		for(User user: userList)
//			if(p.test(user))
//				return true;
//		return false;
	}
}
