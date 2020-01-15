package RealTest;

interface Interface {
	void print1();
	void print2();
}

class AAAAA {
	
	static Interface inter = new Interface() {
		public void print1() {}
		public void print2() {}
	};
	
	public Interface print() {
		Interface inter = new Interface() {
			private int field;
			
			public void print() {
				System.out.println("print");
				print1();
				print2();
			}
			
			public void print1() {
				System.out.println("print1");
			}
			
			public void print2() {
				System.out.println("print2");
			}
		};
		
		inter.print1();
		inter.print2();
		
		return inter;
	}
}

public class Anonymous {
	public static void main(String[] args) {
		AAAAA a = new AAAAA();
		Interface inter = a.print();
		inter.print1();
		inter.print2();
		
		
		AAAAA.inter.print1();
	}
}

interface Interface2 {
	interface Interface3 {
		interface Interface4 {
			public void print1();
		}
		public void print2();
	}
	public void print3();
}

class Z implements Interface2 {
	@Override
	public void print3() {
		System.out.println("print3");
	}
}