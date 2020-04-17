package RealTest2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		
		for(int i = 0 ; i < 10 ; i++)
			arrayList.add(i);
		
		while(true) {
			if(arrayList.isEmpty())
				break;
			System.out.println(arrayList.remove(0));
		}
	}
}