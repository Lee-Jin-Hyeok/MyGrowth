package RealTest;

import java.util.ArrayList;
import java.util.List;

public class PrintTest {
	public static void main(String[] args) {
		int[] array = new int[8];
		
		for(int i = 0 ; i < array.length ; i++)
			array[i] = i;
		
		for(int i : array) {
			System.out.println("before i : " + i);
			i = 0;
			System.out.println("i : " + i);
		}
		
		for(int a : array) {
			System.out.println(a);
		}
		
		
		
		for(int i = 0 ; i < array.length ; i++) {
			int a = array[i];
			a = 0;
		}
		
		for(int a : array) {
			System.out.println("after array : " + a);
		}

		List<Integer> ls = new ArrayList<>();
		
		for(int i = 0 ; i < 8 ; i++) {
			if(i == 5) ls.add(null);
			else ls.add(i);
		}
		
		System.out.println("Ãâ·Â½ÃÀÛ");
		for(Integer i : ls) {
			System.out.println( i != null ? i : "");
		}
		
		String[] argument = {};
		String[] arguments = {"ÀÌÁøÇõ", "¼ÕÁ¤¿ì", "À¯½Ã¿Â", "±è´ë¿õ"};
		int[] args2 = {};
		int[] array2 = new int[8];
		String string2 = new String();
		System.out.println("argument.length : " + argument.length);
		System.out.println("arguments.length : " + arguments.length);
		
		System.out.println("args[0] : " + args[0]);
	}
}