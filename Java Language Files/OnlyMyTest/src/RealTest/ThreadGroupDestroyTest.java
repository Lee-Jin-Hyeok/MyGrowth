package RealTest;

public class ThreadGroupDestroyTest {
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("group");
		
		Thread thread1 = new Thread(tg, new Runnable() {
			public void run() {
				while(true) {
					System.out.println("dd");
				}
			}
		});
		
		thread1.start();
		
		tg.destroy();
	}
}
