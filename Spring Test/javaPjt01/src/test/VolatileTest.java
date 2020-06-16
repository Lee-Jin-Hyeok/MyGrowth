package test;

class Counter {
	public long count;
	
	public Counter() {
		this.count = 0;
	}
}

class Test1 implements Runnable {
	private Counter counter;
	
	public Test1(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++) {
			System.out.println(Thread.currentThread().getName() + " ");
			counter.count++;
			try {
				Thread.sleep(5000);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class Test2 implements Runnable {
	private Counter counter;
	
	public Test2(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++) {
			System.out.print(Thread.currentThread().getName() + " ");
			System.out.println(counter.count);
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class VolatileTest {
	public static void main(String[] args) {
		Counter counter = new Counter();
		
		Thread thread1 = new Thread(new Test1(counter));
		Thread thread2 = new Thread(new Test2(counter));
		Thread thread3 = new Thread(new Test2(counter));
		Thread thread4 = new Thread(new Test2(counter));
		Thread thread5 = new Thread(new Test2(counter));
		Thread thread6 = new Thread(new Test2(counter));
		
		
		thread1.setName("READ/WRITE");
		thread2.setName("READ ONLY0");
		thread3.setName("READ ONLY1");
		thread4.setName("READ ONLY2");
		thread5.setName("READ ONLY3");
		thread6.setName("READ ONLY4");
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
	}
}