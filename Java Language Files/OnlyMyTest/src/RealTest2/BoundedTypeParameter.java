package RealTest2;

class Box2 {
	public <U extends Interface1 & Interface2 & Interface3> void print(U u) {
		System.out.println(u);
	}
}

interface Interface1 {}
interface Interface2 {}
interface Interface3 {}

class Class1 implements Interface1 {}
class Class2 implements Interface1, Interface2 {}
class Class3 implements Interface1, Interface2, Interface3 {}

public class BoundedTypeParameter {
	public static void main(String[] args) {
		Box2 box2 = new Box2();
		// box2.print(new Class1());
		// box2.print(new Class2());
		box2.print(new Class3());
	}
}