package a_java8_lambda;

@FunctionalInterface
interface NumTest{
	boolean isEven(int n);
}

public class P3 {

	public static void main(String[] args) {
		NumTest obj = n->n%2==0;
		System.out.println(obj.isEven(10)+" "+obj.isEven(11));
	}

}
