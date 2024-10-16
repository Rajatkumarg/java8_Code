package a_java8_lambda;

@FunctionalInterface
interface ReverseString2{
	String reverse(String str);
}

public class P6 {

	public static void main(String[] args) {
		ReverseString2 obj = str -> {
			String rev="";
			for(int i=str.length()-1 ; i>=0 ; i--) {
				rev+=str.charAt(i);
			}				
			return rev;
		};
		System.out.println(obj.reverse("Hello"));
	}
}
 