package multithreading;

public class P1 extends Thread{
	public static void main(String[] args) {
		new P1().start();
		for(int i=0 ; i<100; i++) {
			System.out.println("From main "+i);
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				
			}
		}
		
		
	}
	public void run() {
		for(int i=0 ; i<100; i++) {
			System.out.println("From run "+i);
		}
	}
}
