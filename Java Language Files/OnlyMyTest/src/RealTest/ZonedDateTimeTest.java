package RealTest;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest {
	public static void main(String[] args) {
		ZonedDateTime adt = ZonedDateTime.now();
		System.out.println(adt);
		
		Clock clock = Clock.systemUTC();
		ZonedDateTime z = ZonedDateTime.now(clock);
		System.out.println(z);
		
		ZonedDateTime z2 = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(z2);
		
		System.out.println();
		
		ZonedDateTime z3 = ZonedDateTime.of(LocalDate.now(), LocalTime.now(), ZoneId.of("Asia/Seoul"));
		ZonedDateTime z4 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Seoul"));
		ZonedDateTime z5 = ZonedDateTime.of(2020, 02, 04, 11, 44, 22, 123, ZoneId.of("Asia/Seoul"));
		ZonedDateTime z6 = ZonedDateTime.ofInstant(Instant.now(), ZoneId.of("Asia/Seoul"));
		ZonedDateTime z7 = ZonedDateTime.ofInstant(LocalDateTime.now(), ZoneOffset.of("+09:00"), ZoneId.of("Asia/Seoul"));
		ZonedDateTime z8 = ZonedDateTime.ofLocal(LocalDateTime.now(), ZoneId.of("Asia/Seoul"), ZoneOffset.of("+09:00"));
		System.out.println(z3);
		System.out.println(z4);
		System.out.println(z5);
		System.out.println(z6);
		System.out.println(z7);
		System.out.println(z8);
	}
}
