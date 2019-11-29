package user;

public class AuthenticationNumber {
	public static String createNum() {
		char[] result = new char[6];
		char[] num = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
		
		for(int i = 0 ; i < 6 ; i++)
			result[i] = num[(int)Math.random()*36];
		
		return result.toString();
	}
}