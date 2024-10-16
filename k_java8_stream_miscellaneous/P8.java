package k_java8_stream_miscellaneous;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import z_entity.Employee;

public class P8 {
	static List<String> nameList;
		public static void main(String[] args) {
			nameList = List.of("Rajat Kumar","Muti Gupta","Nishant Sah");
			System.out.println(getFirstName("Gupta"));
		}
		public static String getFirstName(String name) {
			return nameList.stream().filter(fullname->fullname.split(" ")[1].equals(name)).findFirst().orElse("No Match Found");
		}
}
