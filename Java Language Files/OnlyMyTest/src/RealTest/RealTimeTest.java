package RealTest;

public class RealTimeTest {
	public static void main(String[] args) {
		long beforeTime1 = System.nanoTime();
		long beforeTime2 = System.currentTimeMillis();
		
		long n = 0;
		
		for(int i = 0 ; i < 1000000000 ; i++)
			n += i;
		
		System.out.println(n);
		
		long afterTime1 = System.nanoTime();
		long afterTime2 = System.currentTimeMillis();
		
		System.out.println(afterTime1 - beforeTime1 + " 나노초 걸림");
		System.out.println(afterTime2 - beforeTime2 + " 밀리초 걸림");
	}
}
