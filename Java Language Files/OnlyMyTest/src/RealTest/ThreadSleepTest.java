package RealTest;

class MyCalculator {
	private int memory;
	
	public MyCalculator() {}
	
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getMemory());
	}
	
	public int getMemory() {
		return memory;
	}
	
	public synchronized void print() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("아무것도 아닌 출력");
		}
	}
}

class Test {
	public synchronized void print() {
		System.out.println("test");
	}
}

class ThreadOne extends Thread {
	private MyCalculator mc;
	
	public ThreadOne(MyCalculator mc) {
		this.mc = mc;
	}
	
	public void run() {
		mc.setMemory(10);
	}
}

class ThreadTwo extends Thread {
	private MyCalculator mc;
	
	public ThreadTwo(MyCalculator mc) {
		this.mc = mc;
	}
	
	public void run() {
		Test t = new Test();
		t.print();
		mc.print();
		mc.setMemory(5);
	}
}

public class ThreadSleepTest {
	public static void main(String[] args) {
		MyCalculator mc = new MyCalculator();
		
		Thread threadOne = new ThreadOne(mc);
		Thread threadTwo = new ThreadTwo(mc);
		
		threadOne.start();
		threadTwo.start();
	}
}
