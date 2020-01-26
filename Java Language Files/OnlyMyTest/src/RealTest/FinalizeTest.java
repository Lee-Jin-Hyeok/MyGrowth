package RealTest;

class Count {
	private int number;
	public static int count;
	
	public Count(int number) {
		this.number = number;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(number + "번 객체 소멸");
		count++;
	}
}

public class FinalizeTest {
	public static void main(String[] args) {
		Count[] count = new Count[50];
		
		for(int i = 0 ; i < count.length ; i++) {
			count[i] = new Count(i);
		}
		System.gc();
		
		System.out.println("null 값으로 변경");
		
		for(int i = 0 ; i < count.length ; i++) {
			count[i] = null;
		}
		System.gc();
		
		System.out.println("gc " + Count.count + "번 실행");
	}
}
