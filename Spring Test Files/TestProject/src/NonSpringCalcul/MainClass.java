package NonSpringCalcul;

public class MainClass {
	public static void main(String[] args) {
		MyCalculator mc = new MyCalculator();
		
		mc.setCalculator(new Calculator());
		mc.add(20, 10);
		mc.min(20, 10);
		mc.mul(20, 10);
		mc.div(20, 10);
	}
}
