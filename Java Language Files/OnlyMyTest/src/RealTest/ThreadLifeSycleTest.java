package RealTest;

class ThreadStateCheck extends Thread {
	private Thread thread;
	
	public ThreadStateCheck(Thread thread) {
		this.thread = thread;
	}
	
	public void run() {
		while(true) {
			State state = thread.getState();
			System.out.println("쓰레드의 상태 : " + state);
			
			if(state == State.NEW)
				thread.start();
			else if(state == State.TERMINATED)
				break;
			
			try {
				thread.sleep(100);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadLifeSycleTest {
	public static void main(String[] args) {
		ThreadStateCheck tsc = new ThreadStateCheck(new Thread() {
			public void run() {
				for(long i = 0 ; i < 1000000000 ; i++) {}
				
				try {
					Thread.sleep(2000);
				} catch(Exception e) {
					e.printStackTrace();
				}
				
				for(long i = 0 ; i < 1000000000 ; i++) {}
			}
		});
		tsc.start();
	}
}
