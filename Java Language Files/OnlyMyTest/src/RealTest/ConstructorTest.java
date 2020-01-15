package RealTest;

class A {
	int a;
	int b;
	int c;
	public A() {}
	public A(int a) {
		this(a, 10, 10);
	}
	public A(int a, int b) {
		this(a, b, 10);
	}
	public A(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
}

public class ConstructorTest {
	public static void main(String[] args) {
		new A();
		new A(1);
		new A(1, 2);
		new A(1, 2, 3);
	}
}
