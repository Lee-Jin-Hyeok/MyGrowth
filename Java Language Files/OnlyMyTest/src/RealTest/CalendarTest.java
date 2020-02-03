package RealTest;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class CalendarTest {
	public static void main(String[] args) {
		/*
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DATE, 20);
		System.out.println(calendar.get(Calendar.YEAR) + "년 "
				+ calendar.get(Calendar.MONTH) + "월 "
				+ calendar.get(Calendar.DATE) + "일 "
				+ calendar.get(Calendar.HOUR) + "시 "
				+ calendar.get(Calendar.MINUTE) + "분 "
				+ calendar.get(Calendar.SECOND) + "초 ");
				*/
		
		Calendar cal1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
		
		//cal1.set(Calendar.DATE, 1);
		cal1.set(Calendar.MONTH, 1);
		cal1.set(Calendar.DATE, 10);
		
		System.out.println(cal1.get(Calendar.YEAR) + "년 "
				+ (cal1.get(Calendar.MONTH) + 1) + "월 "
				+ cal1.get(Calendar.DATE) + "일 "
				+ cal1.get(Calendar.HOUR) + "시 "
				+ cal1.get(Calendar.MINUTE) + "분 "
				+ cal1.get(Calendar.SECOND) + "초 ");
		
		System.out.println(cal1.getFirstDayOfWeek());
		cal1.setFirstDayOfWeek(Calendar.MONDAY);
		System.out.println(cal1.getFirstDayOfWeek());
		System.out.println();
		System.out.println("오늘은 무슨 요일인가 : " + cal1.get(Calendar.DAY_OF_WEEK));
		System.out.println("오늘이 몇 일인가 : " + cal1.get(Calendar.DAY_OF_MONTH));
		System.out.println("오늘의 요일이 이번달의 몇 번째 요일인가 : " + cal1.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("1년 중 오늘이 몇 번째 날인가 : " + cal1.get(Calendar.DAY_OF_YEAR));
		System.out.println("오전은? : " + Calendar.AM);
		System.out.println("오후는? : " + Calendar.PM);
		System.out.println("지금 시간이 오전이면 0, 오후이면 1 : " + cal1.get(Calendar.AM_PM));
		System.out.println("이번달 중 오늘이 몇 번째 주인가 : " + cal1.get(Calendar.WEEK_OF_MONTH));
		System.out.println("1년 중 오늘이 몇 번째 주인가 : " + cal1.get(Calendar.WEEK_OF_YEAR));

		System.out.println(cal1.getDisplayNames(Calendar.DATE, Calendar.LONG_STANDALONE, new Locale("ko-KR")));
		System.out.println();
		
		System.out.println(cal1.getWeeksInWeekYear());
		
		//System.out.println(TimeZone.getTimeZone("ko").getDisplayName() + " | " + Locale.KOREAN.getDisplayName());
		//System.out.println(TimeZone.getTimeZone("EST").getDisplayName() + " | " + Locale.GERMANY.getDisplayName());
		
		// America/Los_Angeles 태평양 표준시
		
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
