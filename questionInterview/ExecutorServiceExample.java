package questionInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {
	public static void main(String[] args) {
        // Create an ExecutorService with a fixed thread pool
//        ExecutorService executor = Executors.newFixedThreadPool(6);
//
//        // Submit tasks
//        Future<Integer> future1 = executor.submit(() -> {
//        	System.out.println("future1 before sleep");
//            TimeUnit.SECONDS.sleep(5);
//            System.out.println("future1 after sleep");
//            return 10;
//        });
//
//        Future<Integer> future2 = executor.submit(() -> {
//            TimeUnit.SECONDS.sleep(1);
//            return 20;
//        });
//
//        // Retrieve results
//        try {
//            Integer result1 = future1.get(); // This will block until the result is available
//            Integer result2 = future2.get(); // This will block until the result is available
//            System.out.println("Result 1: " + result1);
//            System.out.println("Result 2: " + result2);
//        } catch (InterruptedException | ExecutionException e) {
//            e.printStackTrace();
//        }
//
//        // Shutdown the executor service
//        executor.shutdown();
		// Create an ExecutorService with a fixed thread pool
        ExecutorService executor = Executors.newFixedThreadPool(3);
        System.out.println("-----1111-------");
        // Create a list of students
        List<Student> students = List.of(
            new Student("Alice", new int[]{85, 90, 88}),
            new Student("Bob", new int[]{78, 82, 91}),
            new Student("Charlie", new int[]{92, 95, 89})
        );

        // Create a list to hold Future objects
        List<Future<String>> futures = new ArrayList<>();
        System.out.println("--------222222-------");
        // Submit tasks to the ExecutorService
        for (Student student : students) {
        	System.out.println("----33333----- "+student);
            Callable<String> task = new GradeTask(student);
            System.out.println("-----444444------");
            Future<String> future = executor.submit(task);
            System.out.println("-----555555-----");
            futures.add(future);
            System.out.println("---666666---------");
        }

        // Retrieve and print results
        for (Future<String> future : futures) {
            try {
            	System.out.println("-----before future.get()------"+future);
                String result = future.get(); // This will block until the result is available
                System.out.println("------77777-------"+result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        // Shutdown the ExecutorService
        executor.shutdown();
   
    }
}
class GradeTask implements Callable<String> {
    private final Student student;

    public GradeTask(Student student) {
    	System.out.println("------const called---");
        this.student = student;
    }

    @Override
    public String call() {
    	System.out.println("call called "+student);
        double finalGrade = student.calculateFinalGrade();
        return student.getName() + "'s final grade: " + finalGrade;
    }
}