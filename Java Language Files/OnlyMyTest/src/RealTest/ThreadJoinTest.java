package RealTest;

class ThreadA extends Thread {
	public void run() {
		try {
			Thread.sleep(5000);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

class ThreadB extends Thread {
	public void run() {
		try {
			Thread.sleep(5000);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class ThreadJoinTest {
	public static void main(String[] args) {
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		
		System.out.println("ThreadA, ThreadB 시작");
		a.start();
		b.start();

		try {
			a.join();
			b.join();
		} catch(Exception e) { e.printStackTrace(); }
		
		System.out.println("ThreadA, ThreadB 종료");
	}
}
