package RealTest;

import java.util.Map;
import java.util.Set;

public class ThreadGroupMethodsTest {
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("test");
        
        Thread thread1 = new Thread(threadGroup,
                                  new Runnable() {
                                     public void run() {
                                         while(true) {}
                                     } 
                                  });
        thread1.setName("thread1");
        Thread thread2 = new Thread(threadGroup,
                                   new Runnable() {
                                       public void run() {
                                    	   while(true) {}
                                       }
                                   },
                                   "thread2");
        
        thread1.start();
        thread2.start();
        
        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
        Set<Thread> threads = map.keySet();
		
		for(Thread t : threads) {
			System.out.println("������ �̸� : " + t.getName());
			System.out.println("������ ���� : "
                               + (t.isDaemon() ? "���� ������" : "�� ������"));
			System.out.println("������ �׷� : " + t.getThreadGroup().getName());
			System.out.println("----------------------------------");
		}
		
		System.out.println(threadGroup.activeCount());
		System.out.println(threadGroup.activeGroupCount());
    }
}
