package questionInterview;import java.time.Instant;

//Singleton class must return only one instance. Mainly used for DB Connection or one time initialization requirement.
//It support both eager and lazy initialization
//For eager - private static Singleton instance = new Singleton() as it instantiate on class loading
//lazy  - below ex where when we use/access/call getInstance()

class Singleton {

	private static Singleton instance;
	
	public static Singleton getInstance() {
		if(instance==null) {
			instance =  new Singleton();
		}
		return instance;
	}
	
	private Singleton() {
		
	}
}

public class SingletonClass{
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj1==obj2);
	}
}
