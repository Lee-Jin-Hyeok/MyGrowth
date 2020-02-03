package RealTest;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

public class ClockTest {
	public static void main(String[] args) {
		Clock c = Clock.fixed(Instant.now(), ZoneId.systemDefault());
		System.out.println(c);
		
		Clock c5 = c.systemDefaultZone();
		System.out.println(c5.instant());
		
		Clock c4 = c.systemUTC();
		System.out.println(c4.instant());
		
		c.system(ZoneId.of("Asia/Seoul"));
		System.out.println(c.instant()); 
		
		Clock c2 = Clock.offset(c, Duration.ZERO);
		System.out.println(c2.instant());
		
		Clock c3 = Clock.tick(c, Duration.ofSeconds(50));
		System.out.println(c3.instant());
		
		Clock c6 = Clock.systemUTC();
		System.out.println(c6.toString());
		
		Clock c7 = Clock.systemDefaultZone();
		System.out.println(c7.getZone());
		
		Clock c8 = c7.withZone(ZoneId.of("Asia/Seoul"));
		System.out.println(c8.instant());
		
		System.out.println(c8.millis());
	}
}
