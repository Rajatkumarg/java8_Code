package a_java8_lambda;

@FunctionalInterface
interface StringToIntMapper{
	int map(String str);
}

public class P1 {

	public static void main(String[] args) {
		StringToIntMapper obj = s->s.length();
		System.out.println(obj.map("Hello"));
	}

}
