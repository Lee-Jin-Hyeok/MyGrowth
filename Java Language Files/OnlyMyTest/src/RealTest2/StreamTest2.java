package RealTest2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
	    list.add(10);
	    list.add(20);
	    list.add(30);
	    list.add(40);
	    list.add(50);
	    
	    Stream<Integer> stream = list.stream();
	    stream.forEach(StreamTest2 :: print);
	    System.out.println();
	    
	    Stream<Integer> stream2 = list.parallelStream();
	    stream2.forEach(StreamTest2 :: print);
	}
	public static void print(Integer integer) {
		System.out.println(integer + " : " + Thread.currentThread().getName());
	}
}
