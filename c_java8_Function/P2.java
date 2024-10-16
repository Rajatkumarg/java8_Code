package c_java8_Function;

//public interface Function<T,R>{
//R apply(T t);
//}

import java.util.function.Function;

public class P2 {

	public static void main(String[] args) {
		String arr[] = {"Rajat Kumar","Nishant Kumar","Muti Gupta"};
		Function<String[], String> obj = names->{
			StringBuffer sb = new StringBuffer();
			for(String name: names) {
				sb.append(name.substring(0,name.indexOf(" "))+"\n");
			}
			return sb.toString();
		};
		System.out.println(obj.apply(arr));
	}
}
