package user;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class OAuthProvider {
	public static String generateToken() {
	    String token = null;
	    SecureRandom secureRandom;
	    try {
	        secureRandom = SecureRandom.getInstance("SHA1PRNG");
	        MessageDigest digest = MessageDigest.getInstance("SHA-256");
	        secureRandom.setSeed(secureRandom.generateSeed(128));
	        token= new String(digest.digest((secureRandom.nextLong() + "").getBytes()));
	    } catch (NoSuchAlgorithmException e) {
	        e.printStackTrace();
	    }
	    return token;
	}
}
