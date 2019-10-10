package com.javalec.ex;

public class MyCalculator {
	private Calculator calculator;
	private int firstNum;
	private int secondNum;
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	public void setFristNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public void add() {
		calculator.addition(firstNum, secondNum);
	}
	
	public void sub() {
		calculator.subtraction(firstNum, secondNum);
	}
	
	public void mul() {
		calculator.multiplication(firstNum, secondNum);
	}
	
	public void div() {
		calculator.division(firstNum, secondNum);
	}
}
