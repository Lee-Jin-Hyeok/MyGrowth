package RealTest;

public class ThreadPriority {
	public static void main(String[] args) {
		Thread thread0 = new Thread(new Runnable() {
			public void run() {
				System.out.println("thread0");
			}
		});
		
		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("thread1");
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("thread2");
			}
		});
		
		thread0.setPriority(1);
		thread1.setPriority(10);
		thread2.setPriority(5);
		
		thread0.start();
		thread1.start();
		thread2.start();
	}
}