package RealTest;

class B {
	public void method1() {}
	public void method2() {
		method1();
	}
}

public class InNOutSideMethodTest {
	public static void main(String[] args) {
		aaa();
	}
	public static void aaa() {
		
	}
	public void bbb() {
		aaa();
	}
}
