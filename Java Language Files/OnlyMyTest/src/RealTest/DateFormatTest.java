package RealTest;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatTest {
	public static void main(String[] args) {
		Date time = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.YEAR_FIELD);
		System.out.println(df.format(time));
	}
}

// FULL				2020년 1월 31일 금요일
// ERA_FIELD		2020년 1월 31일 금요일

// LONG				2020년 1월 31일 (금)
// YEAR_FIELD		2020년 1월 31일 (금)

// MEDIUM			2020. 1. 31
// DEFAULT			2020. 1. 31
// MONTH_FIELD		2020. 1. 31

// SHORT			20. 1. 31
// DATE_FIELD		20. 1. 31