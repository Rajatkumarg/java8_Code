package k_java8_stream_miscellaneous;

import java.util.Arrays;
import java.util.List;

public class P3 {
		public static void main(String[] args) {
			List<String> nameList= Arrays.asList("Amit","ravi","gyan","Sumit","ram","rajat");
			boolean b =  nameList.stream().noneMatch(s->s.startsWith("g"));
			System.out.println(b);
			
		}
}
