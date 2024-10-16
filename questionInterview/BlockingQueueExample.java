package questionInterview;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
	public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5); // Capacity of 5

        // Producer Thread
        Thread producer = new Thread(() -> {
            int i = 0;
            try {
                while (true) {
                    queue.put(i); // Puts element into the queue
                    System.out.println("Produced: " + i);
                    i++;
                    Thread.sleep(2000); // Simulate delay
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer Thread
        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                	if(queue.peek()==null)
                		break;
                    int item = queue.take(); // Takes element from the queue
                    System.out.println("Consumed: " + item);
//                    Thread.sleep(300); // Simulate processing delay
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
