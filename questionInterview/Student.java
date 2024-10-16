package questionInterview;

import java.util.Arrays;

public class Student {
	private String name;
    private int[] grades; // Array of grades for different assignments

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int[] getGrades() {
        return grades;
    }

    public double calculateFinalGrade() {
        // Simulate time-consuming calculation
        try {
        	System.out.println("-----8888----calculateFinalGrade before sleep");
            Thread.sleep(1000); // Simulate delay
            System.out.println("-----8888----calculateFinalGrade after sleep");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        double d = Arrays.stream(grades).average().orElse(0.0);
        System.out.println("-----99999999-------"+d);
        return d;
    }

	@Override
	public String toString() {
		return "Student [name=" + name + ", grades=" + Arrays.toString(grades) + "]";
	}
    
}
