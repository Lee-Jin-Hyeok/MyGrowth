package RealTest;

public class MultiThreadTest {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				for(int i = 0 ; i < 10 ; i++) {
					System.out.println(1);
				}
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				for(int i = 0 ; i < 10 ; i++) {
					System.out.println(22);
				}
			}
		});
		
		thread1.start();
		thread2.start();
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(333);
		}
		
		System.out.println(thread1.getId());
		System.out.println(thread1.getName());
		System.out.println(thread2.getId());
		System.out.println(thread2.getName());
		
		Thread threadMain = Thread.currentThread();
		System.out.println(threadMain.getName());
		
		
	}
}
