package RealTest;

import RealTest.OutterClass.InnerClass2;

class OutterClass {
	public static InnerClass2 InnerClass2;
	private int field;
	
	public OutterClass(int field) {
		this.field = field;
	}
	
	private class InnerClass {
		private void print() {
			System.out.println("OutterClass.InnerClass.print()");
		}
		public void printprint() {
			System.out.println("아무것도 아니야");
		}
	}
	
	class InnerClass2 {
		public void print() {
			InnerClass ic = new InnerClass();
			ic.print();
		}
	}
	
	static class StaticInnerClass {
		public void print() {
			System.out.println("StaticInnerClass");
		}
	}
	
	public void print() {
//		class InnerInnerClass {
//			public void print() {
//				System.out.println("OutterClass.print().InnerInnerClass()");
//			}
//		}
		int i;
		//private int a;
		System.out.println("OutterClass.print()");
		InnerClass ic = new InnerClass();
		ic.print();
		
		
		//InnerInnerClass iic = new InnerInnerClass();
		//iic.print();
	}
	
	class test {
		void print() {
			class test2 {
				void print() {
					class test3 {
						
					}
				}
			}
		}
	}
}

public class NestedClass {
	public static void main(String[] args) {
		int field = 10;
		OutterClass oc = new OutterClass(field);
		oc.print();
		
		OutterClass.StaticInnerClass os = new OutterClass.StaticInnerClass();
		os.print();
		
		//OutterClass.InnerClass oi = oc.new InnerClass();
		//oi.printprint();
		
		//OutterClass.InnerClass oiiii = new OutterClass.InnerClass();
		
		OutterClass.InnerClass2 oii = oc.new InnerClass2();
		oii.print();
	}
}