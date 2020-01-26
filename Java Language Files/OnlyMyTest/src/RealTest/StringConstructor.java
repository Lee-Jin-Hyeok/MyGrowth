package RealTest;

public class StringConstructor {
	public static void main(String[] args) {
		String str1 = new String("Stringn  ");
		byte[] data = str1.getBytes();
		for(byte b : data)
			System.out.print(b + " ");
		
		System.out.println();
		
		String str2 = new String("문자열");
		for(byte b : str2.getBytes())
			System.out.print(b + " ");
		
		System.out.println();
		
		try {
			String str3 = new String("문자열");
			byte[] bytes = str3.getBytes("UTF-8");
			
			for(byte b : bytes)
				System.out.print(b + " ");
			System.out.println();
			System.out.println(new String(bytes, "utf-8"));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
