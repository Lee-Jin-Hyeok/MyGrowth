package RealTest2;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		System.out.println("add start");
		System.out.println(queue.add("aa"));
		System.out.println(queue.add("bb"));

		System.out.println("offer start");
		System.out.println(queue.offer("dd"));
		System.out.println(queue.offer("ee"));
		
		System.out.println("poll start");
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

		System.out.println("peek start");
		System.out.println(queue.peek());
		System.out.println(queue.peek());
	}
}