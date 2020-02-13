package RealTest;

import java.util.Set;

class TestThread1 extends Thread {
    public void run() {
        while(true) {}
    }
}

public class ThreadGroupNameTest {
    public static void main(String[] args) {
        TestThread1 testThread1 = new TestThread1();
        testThread1.setName("TestThread1");
        
        Thread testThread2 = new Thread(new Runnable() {
            public void run() {
                while(true) {}
            }
        }, "TestThread2");
        
       	Thread testThread3 = new Thread(new Runnable() {
            public void run() {
                while(true) {}
            }
        }, "TestThread3");
        
        testThread1.start();
        testThread2.start();
        
        Set<Thread> threads = Thread.getAllStackTraces().keySet();
		
		for(Thread thread : threads) {
			System.out.println("������ �̸� : " + thread.getName());
			System.out.println("������ ���� : "
                               + (thread.isDaemon() ? "���� ������" : "�� ������"));
			System.out.println("������ �׷� : " + thread.getThreadGroup().getName());
			System.out.println("----------------------------------");
		}
    }
}