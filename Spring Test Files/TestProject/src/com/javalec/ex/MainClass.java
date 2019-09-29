package com.javalec.ex;

public class MainClass {
	public static void main(String[] args) {
		Calculation ccl = new Calculation();
		ccl.setFirstNum(10);
		ccl.setSecondNum(2);
		
		ccl.add();
		ccl.sub();
		ccl.mult();
		ccl.div();
	}
}