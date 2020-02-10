package RealTest;

class ThreadC extends Thread {
	public void run() {
		try {
			while(true) {
				System.out.println("�۾���");
				Thread.sleep(1);
			}
		} catch(InterruptedException e) {
			System.out.println("������ ����");
		}
	}
}

public class ThreadInterruptTest {
	public static void main(String[] args) {
		ThreadC c = new ThreadC();
		c.start();
		
		try {
			Thread.sleep(5000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		c.interrupt();
	}
}
