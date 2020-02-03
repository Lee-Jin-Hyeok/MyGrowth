package RealTest;

import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date date1 = new Date(2020, 1, 10);
		Date date2 = new Date(2020, 1, 5);
		System.out.println(date1.after(date2));
	}
}
