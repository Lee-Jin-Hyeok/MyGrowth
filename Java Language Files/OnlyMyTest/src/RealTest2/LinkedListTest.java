package RealTest2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	public static void main(String[] args) {
		List<Long> arrayList = new ArrayList<>();
        List<Long> linkedList = new LinkedList<>();
        
        long afterTime = 0;
        long beforeTime = 0;
        
        afterTime = System.nanoTime();
        for(long i = 0 ; i < 10000000 ; i++) {
        	arrayList.add(i);
        }
        beforeTime = System.nanoTime();
        System.out.println("ArrayList Time : " + (beforeTime - afterTime) + "(나노세컨드)");
        
        afterTime = System.nanoTime();
        for(long i = 0 ; i < 10000000 ; i++) {
        	linkedList.add(i);
        }
        beforeTime = System.nanoTime();
        System.out.println("LinkedList Time : " + (beforeTime - afterTime) + "(나노세컨드)");
	}
}