package user;

public class AuthenticationNumber {
	public static String createNum() {
		StringBuffer sb = new StringBuffer();
		char[] num = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".toCharArray();
		
		for(int i = 0 ; i < 6 ; i++)
			sb.append(num[((int)(Math.random()*100))%36]);
		
		return sb.toString();
	}
}