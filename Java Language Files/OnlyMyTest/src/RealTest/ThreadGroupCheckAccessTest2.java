package RealTest;

public class ThreadGroupCheckAccessTest2 {
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("parentGroup");
		ThreadGroup tg2 = new ThreadGroup("childGroup");

		Thread thread1 = new Thread(tg, new Runnable() {
			public void run() {
				while(true) {}
			}
		}, "thread1");
		
		Thread thread2 = new Thread(tg2, new Runnable() {
			public void run() {
				try {
					tg2.checkAccess();
				} catch(Exception e) {
					e.printStackTrace();
				}
				System.out.println("22");
			}
		}, "thread2");
		
		thread1.start();
		thread2.start();
	}
}