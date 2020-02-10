package RealTest;

class Test3 {
	public synchronized void print() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName());
		Thread.yield();
	}
}

class ThreadAAA extends Thread {
	private Test3 test;
	
	public ThreadAAA(Test3 test) {
		this.test = test;
	}
	
	public void run() {
		test.print();
		test.print();
		test.print();
	}
}

class ThreadBBB extends Thread {
	private Test3 test;
	
	public ThreadBBB(Test3 test) {
		this.test = test;
	}
	
	public void run() {
		test.print();
		test.print();
		test.print();
	}
}

public class ThreadYield {
	public static void main(String[] args) {
		Test3 test = new Test3();
		ThreadAAA a = new ThreadAAA(test);
		ThreadBBB b = new ThreadBBB(test);
		
		a.start();
		b.start();
	}
}
