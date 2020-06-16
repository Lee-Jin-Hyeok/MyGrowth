package test;

public class JNITest {
	static {
		System.loadLibrary("JNI");
	}
	
	private native int getNumber();
	private native void getHelloWorld();
	
	public static void main(String[] args) {
		JNITest jni = new JNITest();
		
		jni.getHelloWorld();
		System.out.println(jni.getNumber());
	}
}