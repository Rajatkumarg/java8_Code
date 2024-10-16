package a_java8_lambda;

@FunctionalInterface
interface NumTest2{
	int max(int a, int b);
}

public class P5 {

	public static void main(String[] args) {
//		NumTest2 obj = (a,b)->Math.max(a, b);
		NumTest2 obj = (a,b)->a>b ? a : b;
		System.out.println(obj.max(1, 0));
		System.out.println(obj.max(0, 1));
	}

}
