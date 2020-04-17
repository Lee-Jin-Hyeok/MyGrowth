package RealTest2;

import java.util.List;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		List<Integer> vector = new Vector<>();
		
		new Thread(() -> {
			for(int i = 0 ; i < 10 ; i++) {
				vector.add(i);
				System.out.println("»ðÀÔ : " + i);
			}
		}).start();
		
		new Thread(() -> {
			for(int i = 0 ; i < 10 ; i++) {
				System.out.println("»èÁ¦ : " + vector.remove((Object)i));
			}
		}).start();;
	}
}
