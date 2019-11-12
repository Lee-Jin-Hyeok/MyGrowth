package project.chess.main;

public class TestMainClass {
	public static void main(String[] args) {
		String a = "abcdefghiiiiiiii                                iiiiiiiihgfedcba";
		char[] c = new char[64];
		c = a.toCharArray();
		for(int i = 0 ; i < 64 ; i++) {
			System.out.print("_" + c[i]);
		}
	}
}
