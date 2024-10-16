package test;

public class Singleton {
    private static Singleton instance;

    private String name;
    
    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class UseSingleton{
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		s.setName("Rajat");
		System.out.println(s+"  "+s.getName());
		Singleton t = Singleton.getInstance();
		System.out.println(t+"  "+t.getName());
		t.setName("Nishant");
		System.out.println(s.getName());
		s.showMessage();
		t.showMessage();;;;
	}
}