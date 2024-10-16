package test;

public class Exception1 {
	public static void main(String[] args) {
		try {
		exceptionMethod();;
		}
		catch(Exception e) {
			System.out.println("Hi");
		}
		
	}
	
	public static String exceptionMethod() {
		try {
			try {
				throw new Exception("Exception in MyException");
			}catch(MyException e) {
				System.out.println("In Exception");
				if('a'>'b')
				throw new MyException("MyException");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage().equals("MyException"));
		}
		return "Abc";
	}
	
}
