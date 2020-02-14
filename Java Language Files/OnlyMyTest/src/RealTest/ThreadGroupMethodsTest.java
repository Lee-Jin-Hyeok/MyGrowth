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
			System.out.println("스레드 이름 : " + t.getName());
			System.out.println("스레드 종류 : "
                               + (t.isDaemon() ? "데몬 스레드" : "주 스레드"));
			System.out.println("스레드 그룹 : " + t.getThreadGroup().getName());
			System.out.println("----------------------------------");
		}
		
		System.out.println(threadGroup.activeCount());
		System.out.println(threadGroup.activeGroupCount());
    }
}
