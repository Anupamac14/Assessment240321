
public class ThreadSleep extends Thread {

		public static void main(String[] args) {
			ThreadSleep Thread1 = new  ThreadSleep();
			ThreadSleep Thread2 = new  ThreadSleep();
			ThreadSleep Thread3 = new  ThreadSleep();
			 
			Thread1.start();
			
				
			try {
				Thread1.join();
			 }catch(Exception e) {
				 System.out.println(e);
			 }
			
			Thread2.start();
			Thread3.start();
	
			
		}
		public void run() {
			for(int i=1; i<5; i++) {
				try {
					Thread.sleep(500);
					}
				catch(InterruptedException e) {
					System.out.println(e);}
				System.out.println(i);
			}
}
}