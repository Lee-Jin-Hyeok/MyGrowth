package RealTest;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class CalendarTest {
	public static void main(String[] args) {
		/*
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DATE, 20);
		System.out.println(calendar.get(Calendar.YEAR) + "�� "
				+ calendar.get(Calendar.MONTH) + "�� "
				+ calendar.get(Calendar.DATE) + "�� "
				+ calendar.get(Calendar.HOUR) + "�� "
				+ calendar.get(Calendar.MINUTE) + "�� "
				+ calendar.get(Calendar.SECOND) + "�� ");
				*/
		
		Calendar cal1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
		
		//cal1.set(Calendar.DATE, 1);
		cal1.set(Calendar.MONTH, 1);
		cal1.set(Calendar.DATE, 10);
		
		System.out.println(cal1.get(Calendar.YEAR) + "�� "
				+ (cal1.get(Calendar.MONTH) + 1) + "�� "
				+ cal1.get(Calendar.DATE) + "�� "
				+ cal1.get(Calendar.HOUR) + "�� "
				+ cal1.get(Calendar.MINUTE) + "�� "
				+ cal1.get(Calendar.SECOND) + "�� ");
		
		System.out.println(cal1.getFirstDayOfWeek());
		cal1.setFirstDayOfWeek(Calendar.MONDAY);
		System.out.println(cal1.getFirstDayOfWeek());
		System.out.println();
		System.out.println("������ ���� �����ΰ� : " + cal1.get(Calendar.DAY_OF_WEEK));
		System.out.println("������ �� ���ΰ� : " + cal1.get(Calendar.DAY_OF_MONTH));
		System.out.println("������ ������ �̹����� �� ��° �����ΰ� : " + cal1.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("1�� �� ������ �� ��° ���ΰ� : " + cal1.get(Calendar.DAY_OF_YEAR));
		System.out.println("������? : " + Calendar.AM);
		System.out.println("���Ĵ�? : " + Calendar.PM);
		System.out.println("���� �ð��� �����̸� 0, �����̸� 1 : " + cal1.get(Calendar.AM_PM));
		System.out.println("�̹��� �� ������ �� ��° ���ΰ� : " + cal1.get(Calendar.WEEK_OF_MONTH));
		System.out.println("1�� �� ������ �� ��° ���ΰ� : " + cal1.get(Calendar.WEEK_OF_YEAR));

		System.out.println(cal1.getDisplayNames(Calendar.DATE, Calendar.LONG_STANDALONE, new Locale("ko-KR")));
		System.out.println();
		
		System.out.println(cal1.getWeeksInWeekYear());
		
		//System.out.println(TimeZone.getTimeZone("ko").getDisplayName() + " | " + Locale.KOREAN.getDisplayName());
		//System.out.println(TimeZone.getTimeZone("EST").getDisplayName() + " | " + Locale.GERMANY.getDisplayName());
		
		// America/Los_Angeles ����� ǥ�ؽ�
		
		Calendar calendar1 = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		calendar1.set(2020, 1-1, 10, 0, 0, 0);
		calendar2.set(2020, 1-1, 20, 0, 0, 0);
		System.out.println(calendar1.after(calendar2));
		System.out.println(calendar1.before(calendar2));
		
		calendar1.add(Calendar.DATE, -11);
		System.out.println(calendar1.get(Calendar.MONTH) + " " + calendar1.get(Calendar.DATE));
		
		calendar1.clear(Calendar.DATE);
	}
}
