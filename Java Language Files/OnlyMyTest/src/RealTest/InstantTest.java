package RealTest;

import java.time.Clock;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantTest {
	public static void main(String[] args) {
		Instant instant1 = Instant.EPOCH;
		Instant instant2 = Instant.MAX;
		Instant instant3 = Instant.MIN;
		System.out.println(instant1);
		System.out.println(instant2);
		System.out.println(instant3);
		
		Instant instant4 = Instant.from(instant2);
		System.out.println(instant4);
		
		Instant instant5 = Instant.now();
		System.out.println(instant5);
		
		Clock clock = Clock.systemUTC();
		Instant instant6 = Instant.now(clock);
		System.out.println(instant6);
		
		Instant instant7 = Instant.ofEpochMilli(instant6.toEpochMilli());
		System.out.println(instant7);
		
		Instant instant8 = Instant.ofEpochSecond(instant6.getEpochSecond());
		System.out.println(instant8);
		
		Instant instant9 = Instant.ofEpochSecond(instant6.getEpochSecond(), instant6.getNano());
		System.out.println(instant9);

		Instant instant10 = instant6.plus(1, ChronoUnit.DAYS);
		System.out.println(instant10);
		
		Instant instant11 = instant6.plus(1, ChronoUnit.HALF_DAYS);
		System.out.println(instant11);
		
		Instant instant12 = instant6.plus(1, ChronoUnit.HOURS);
		System.out.println(instant12);
		
		Instant instant13 = instant6.plus(1, ChronoUnit.MICROS);
		System.out.println(instant13);
		
		Instant instant14 = instant6.plus(1, ChronoUnit.MILLIS);
		System.out.println(instant14);
		
		Instant instant15 = instant6.plus(1, ChronoUnit.MINUTES);
		System.out.println(instant15);
		
		Instant instant16 = instant7.plus(1, ChronoUnit.NANOS);
		System.out.println(instant16);
		
		Instant instant17 = instant6.plus(1, ChronoUnit.SECONDS);
		System.out.println(instant17);
		
		Instant instant18 = Instant.parse("2020-02-01T00:00:00.000Z");
		System.out.println(instant18);
	}
}
