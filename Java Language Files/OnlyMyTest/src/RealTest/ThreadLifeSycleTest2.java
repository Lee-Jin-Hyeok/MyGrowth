package RealTest;

import java.lang.Thread.State;

class Thread1 extends Thread {
	private boolean isStart;
	public Thread1() {
		this.isStart = true;
	}
	
	public void terminated() {
		this.isStart = false;
	}
	
	public void run() {
		while(isStart) {}
	}
}

class Thread2 extends Thread {
	private boolean isStart;
	public Thread2() {
		this.isStart = true;
	}
	
	public void terminated() {
		this.isStart = false;
	}
	
	public void run() {
		while(isStart) {}
	}
}

public class ThreadLifeSycleTest2 {
	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		
		thread1.start();
		thread2.start();
		
		while(true) {
			System.out.println("thread1 : " + thread1.getState());
			System.out.println("thread2 : " + thread2.getState());
			
			if(thread1.getState() == State.WAITING)
				break;
			if(thread2.getState() == State.WAITING)
				break;
			
			try {
				Thread.sleep(1);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
