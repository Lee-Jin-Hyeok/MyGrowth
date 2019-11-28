package MyTestRoom;

class A {
	int a = 10;
}

class B {
	int b = 20;
}

class C extends A, B{
	public void show() {
		System.out.println(a + " " + b);
	}
}

public class ExtendsTest {
	public static void main(String[] args) {
		C c = new C();
		c.show();
	}
}
