package RealTest;

class LeeException extends Exception {
	public LeeException() {}
	public LeeException(String message) {
		super(message);
	}
}

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			throw new LeeException();
		} catch(LeeException le) {
			System.out.println(le.getMessage());
			le.printStackTrace();
		}
	}
}
