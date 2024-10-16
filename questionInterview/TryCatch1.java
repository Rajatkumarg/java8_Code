package questionInterview;

public class TryCatch1 {
	public static void main(String[] args) {
		System.out.println(method());
	}

	static int method() {
		try {
			System.out.println(10);
			int b = 10/0;
			System.out.println(15);
			return 1;
		} catch (Exception e) {
			System.out.println(20);
			return 2;
		} finally {
			System.out.println(30);
			return 3;
		}
	}
}
