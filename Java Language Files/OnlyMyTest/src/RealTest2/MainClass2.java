package RealTest2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MainClass2 {
	private static Scanner sc = new Scanner(System.in);
	
	public static Map<Integer, Integer> input(int count) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int key = 0;
		int value = 0;
		
		for(int i = 0 ; i < count ; i++) {
			key = sc.nextInt();
			value = sc.nextInt();
			map.put(key, value);
		}
		
		return map;
	}
	
	public static void main(String[] args) {
		int count1 = sc.nextInt();		
		Iterator<Entry<Integer, Integer>> polynomial1 = input(count1).entrySet().iterator();

		int count2 = sc.nextInt();
		Iterator<Entry<Integer, Integer>> polynomial2 = input(count2).entrySet().iterator();
		
		while(polynomial1.hasNext()) {
			Map.Entry<Integer, Integer> entry1 = polynomial1.next();
			System.out.println(entry1.getKey() + "^" + entry1.getValue() + " ");
		}
		
		while(polynomial2.hasNext()) {
			Map.Entry<Integer, Integer> entry2 = polynomial2.next();
			System.out.println(entry2.getKey() + "^" + entry2.getValue() + " ");
		}
	}
}