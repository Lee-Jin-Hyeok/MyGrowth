package NonSpringCalcul;

public class MyCalculator {
	Calculator calculator;
	public MyCalculator() {
		// �ƹ� �͵� �� ��
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	public void add(int num1, int num2) {
		calculator.deohagi(num1, num2);
	}
	public void min(int num1, int num2) {
		calculator.bbaegi(num1, num2);
	}
	public void mul(int num1, int num2) {
		calculator.gophagi(num1, num2);
	}
	public void div(int num1, int num2) {
		calculator.nanugi(num1, num2);
	}
}
