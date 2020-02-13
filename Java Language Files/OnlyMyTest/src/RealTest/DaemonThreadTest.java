package RealTest;

class DaemonThread extends Thread {
	public void run() {
		while(true) {
			System.out.println("작업 실행 중");
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class DaemonThreadTest {
	public static void main(String[] args) {
		DaemonThread subThread = new DaemonThread();
		Thread mainThread = Thread.currentThread();
		
		subThread.setDaemon(true);
		subThread.start();
		
		System.out.println(subThread.isDaemon());
		System.out.println(mainThread.isDaemon());
		
		
		try {
			Thread.sleep(5000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Main Thread 종료");
	}
}
