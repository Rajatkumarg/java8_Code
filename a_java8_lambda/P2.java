package a_java8_lambda;

@FunctionalInterface
interface ReverseString{
	String reverse(String str);
}

public class P2 {

	public static void main(String[] args) {
//		ReverseString obj = s->new String(new StringBuffer(s).reverse());
//		System.out.println(obj.reverse("Hello"));
		ReverseString obj = s->{return new String(new StringBuffer(s).reverse());};
		System.out.println(obj.reverse("Hello"));
	}

}
