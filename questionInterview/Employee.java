package questionInterview;

import java.io.Serializable;

public class Employee implements Serializable{
	private static final long serialVersionUID = 1L; // Helps in version control

    private String name;
    private int age;
    private transient String password; // This field won't be serialized

    public Employee(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", password='" + password + "'}";
    }
}
