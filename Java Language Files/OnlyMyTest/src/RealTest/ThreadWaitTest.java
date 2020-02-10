package RealTest;

class ThreadAA extends Thread {
	private Test2 test;
	
	public ThreadAA(Test2 test) {
		this.test = test;
	}
	
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			test.printA();
		}
	}
}

class ThreadBB extends Thread {
	private Test2 test;
	
	public ThreadBB(Test2 test) {
		this.test = test;
	}
	
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			test.printB();
		}
	}
}

class Test2 {
	public synchronized void printA() {
		try {
			notify();
			System.out.println("printA");
			wait();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public synchronized void printB() {
		try {
			notify();
			System.out.println("printB");
			wait();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class ThreadWaitTest {
	public static void main(String[] args) {
		Test2 test = new Test2();
		
		ThreadAA a = new ThreadAA(test);
		ThreadBB b = new ThreadBB(test);
		
		a.start();
		b.start();
	}
}
