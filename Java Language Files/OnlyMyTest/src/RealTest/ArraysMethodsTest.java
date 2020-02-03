package RealTest;

import java.util.Arrays;
import java.util.Random;

public class ArraysMethodsTest {
	public static void main(String[] args) {
		int[] search = { -2, 5, 7, 9 };
		int value = Arrays.binarySearch(search, -99999);
		System.out.println(value);
		
		int[] copy = Arrays.copyOf(search, 5);
		for(int i : copy)
			System.out.println("copy : " + i);
		
		int[] array = { 1, 2, 3, 4, 5 };
		int[] copy2 = Arrays.copyOfRange(array, 1, 10);
		
		for(int i : copy2)
			System.out.print(i);
		System.out.println();
		int[] array2 = new int[3];
		Arrays.fill(array2, 1, 3, 'c');
		
		for(int i : array2)
			System.out.print(i + " ");
		
		Object[][] data = {
			{ 1, 2, 3 },
			{ 1, 2, 3 }
		};
		System.out.println();
		System.out.println(Arrays.toString(data));
		System.out.println(Arrays.deepToString(data));
		System.out.println();
		
		byte[] bytes = new byte[5];
		Random r = new Random();
		r.nextBytes(bytes);
		
		for(byte b : bytes)
			System.out.print(b + " ");
	}
}
