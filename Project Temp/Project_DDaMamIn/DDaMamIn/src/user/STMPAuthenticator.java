package user;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class STMPAuthenticator extends Authenticator {
	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		String username = "jinjin0816@naver.com";
		String password = "dhwlddjgmanf";
		return new PasswordAuthentication(username, password);
	}
}