package RealTest;

import RealTest.Interface2.Interface3;

interface Interface1 {
	interface Interface2 {
		interface Interface3 {
			void print3();
		}
		void print2();
	}
	void print1();
}

class Implement1 implements Interface1 {
	@Override
	public void print1() {}
}

class Implement2 implements Interface2 {
	@Override
	public void print3() {}
}

class Implement3 implements Interface3 {

	@Override
	public void print2() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceInInterface {
	public static void main(String[] args) {
		
	}
}
