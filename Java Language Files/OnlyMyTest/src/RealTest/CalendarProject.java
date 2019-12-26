package RealTest;

class Calendar {
	private Day[][] cal = null;
	private int year;
	private int month;
	
	public Calendar(int year, int month) {
		cal = new Day[6][7];
		createCalendar(year, month);
	}
	private void createCalendar(int year, int month) {
		this.year = year;
		this.month = month;
		
		
	}
	private int FindFirstDay() {
		int yoil = year - 1;
		for(int i = 1 ; i <= year ; i++)
			if((i%4==0 && i%100!=0) || (i%400==0))
				yoil++;
		
	}
}

class Day {
	private String day;
	private Day() {
		day = "  ";
	}
}

public class CalendarProject {
	Calendar calendar = new Calendar(2019, 12);
}
