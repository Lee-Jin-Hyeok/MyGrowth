package RealTest;

public class ThreadGroupCheckAccessTest {
	public static void main(String[] args) {
		ThreadGroup parentGroup = new ThreadGroup("parentGroup");
		ThreadGroup childGroup = new ThreadGroup(parentGroup, "childGroup");
		
		Thread thread1 = new Thread(parentGroup, new Runnable() {
			public void run() {
				while(true) {}
			}
		}, "thread1");

		Thread thread2 = new Thread(childGroup, new Runnable() {
			public void run() {
				while(true) {}
			}
		}, "thread2");

		Thread thread3 = new Thread(childGroup, new Runnable() {
			public void run() {
				while(true) {}
			}
		}, "thread3");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.println(parentGroup.activeCount());
		System.out.println(childGroup.activeCount());
		System.out.println(parentGroup.activeGroupCount());
		System.out.println(childGroup.activeGroupCount());
	}
}