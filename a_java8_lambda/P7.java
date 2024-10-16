package a_java8_lambda;

@FunctionalInterface
interface MyMath{
	Integer factor(int n);
}

public class P7 {

	public static void main(String[] args) {
		MyMath obj = n->{
			int i=2;
			while(n>i) {
				if(n%i==0)
					return i;
				i++;
			}
			return n;
		};
		System.out.println(obj.factor(10));
		System.out.println(obj.factor(1));
		System.out.println(obj.factor(2));
		System.out.println(obj.factor(3));
		System.out.println(obj.factor(4));
	}
}
