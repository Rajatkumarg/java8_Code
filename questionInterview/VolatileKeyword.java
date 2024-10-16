package questionInterview;

class VolatileKeyword extends Thread { 

	// using volatile 
//	The working field is now declared as volatile. 
//	This means that any write to this field is immediately visible to all threads.
//	The volatile keyword prevents the field from being cached in a thread's local memory,
//	ensuring that all threads see the latest value. 
//	It puts value in primary memory so that all threads can access the latest updated value
	volatile boolean working = true; 

	// if non-volatile it will 
	// sleep in main and 
	// runtime error will coocur 
	public void run() 
	{ 
		long count = 0;
		System.out.println("11111");
		while (working) { 
			count++; 
			System.out.println(count);
		} 

		System.out.println("Thread terminated."
						+ count); 
	} 

	// Driver code 
	public static void main(String[] args) throws InterruptedException 
	{ 
		VolatileKeyword test = new VolatileKeyword(); 
		test.start(); 
		Thread.sleep(1000); 
		System.out.println("After Sleeping in Main"); 
		test.working = false; 
		test.join(); 
		System.out.println("Working set to "
						+ test.working); 
	} 
}
