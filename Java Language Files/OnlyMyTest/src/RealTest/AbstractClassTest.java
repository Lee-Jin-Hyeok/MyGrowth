package RealTest;

abstract class AbstractClass {
	public abstract void print();
}

interface AC {
	public void print();
}

public class AbstractClassTest {
	public static void main(String[] args) {
		AbstractClass ac = null;
		//ac = new AbstractClass();
		AC ac2 = null;
		//ac2 = new AC();
	}
}
