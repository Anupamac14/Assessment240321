
public class ThreadName extends Thread {



	public static void main(String[] args) {
		
		ThreadName thread1 = new ThreadName();
		ThreadName thread2 = new ThreadName();
		ThreadName thread3 = new ThreadName();
		thread2.setPriority(MIN_PRIORITY);
		thread1.setPriority(MAX_PRIORITY);
		thread3.setPriority(NORM_PRIORITY);
		
		thread1.start();
		thread1.setName("Thread Number 1");
		System.out.println("Norm priority:" +thread1.getPriority());
		
		thread2.start();
		thread2.setName("Thread Number 2");
		System.out.println("Max priority:" +thread2.getPriority());
		
		thread3.start();
		thread3.setName("Thread Number 3");
		System.out.println("Min priority:" +thread3.getPriority());
			
	}

	 public void run() 
	 {
		
		System.out.println(Thread.currentThread().getName());
	 }

}