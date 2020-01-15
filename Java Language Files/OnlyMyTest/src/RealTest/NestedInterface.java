package RealTest;

import RealTest.AAAA.inter;

class AAAA {
	interface inter {
		void print1();
		void print2();
	}
	
	inter print() {
		inter in = new inter() {
			private int field;
			
			public void print() {
				System.out.println("print");
				print1();
				print2();
			}
			
			@Override
			public void print1() {
				System.out.println("print1");
			}

			@Override
			public void print2() {
				System.out.println("print2");
			}
			
		};
		
		in.print1();
		in.print2();
		return in;
	}
}

public class NestedInterface {
	public static void main(String[] args) {
		AAAA aaaa = new AAAA();
		inter in = aaaa.print();
		in.print1();
		in.print2();
	}
}
