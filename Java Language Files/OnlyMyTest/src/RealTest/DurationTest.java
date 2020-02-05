package RealTest;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest {
	public static void main(String[] args) {
		Duration d = Duration.ofDays(1);
		Duration d2 = Duration.ofHours(1);
		Duration d3 = Duration.ofMinutes(1000000);
		Duration d4 = Duration.ofSeconds(1);
		Duration d5 = Duration.of(1, ChronoUnit.DAYS);
		
		System.out.println(d);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		
		Duration d6 = Duration.ofNanos(1);
		System.out.println(d6);
		
		Duration d7 = Duration.ofSeconds(1, 1);
		System.out.println(d7);
		
		Duration d8 = Duration.ofMillis(1);
		System.out.println(d8);

		Duration d9 = Duration.ofHours(64);
		System.out.println(d9);
		System.out.println(d9.dividedBy(4));
		System.out.println(d9.dividedBy(16));
		System.out.println(d9.dividedBy(64));
		
		System.out.println(Duration.from(d9));
		
		System.out.println(d.getUnits());
		System.out.println(d2.getUnits());
		System.out.println(d3.getUnits());
		System.out.println(d4.getUnits());
		System.out.println(d5.getUnits());
		System.out.println(d6.getUnits());
		
		System.out.println(d.isNegative());
		System.out.println(d2.isNegative());
		System.out.println(d3.isNegative());
		
		Duration d10 = Duration.ofDays(-1);
		System.out.println(d10);
		System.out.println(d10.isNegative());
		System.out.println(d10.isZero());
		
		System.out.println(d10.multipliedBy(2));
		System.out.println(d10.negated());

		System.out.println(d10.withNanos(1));
		
		Duration d11 = Duration.ofNanos(1);
		System.out.println(d11);
		System.out.println(d11.withNanos(100));
		
		Duration d12 = Duration.ofHours(10);
		Duration d13 = Duration.ofHours(1);
		Duration d14 = Duration.between(LocalTime.of(1, 1, 1), LocalTime.of(10, 10, 10));
		System.out.println(d14);
		
		System.out.println(d14.toMinutes());
		System.out.println(d14.toNanos());
		
		Duration d15 = Duration.ofHours(5);
		LocalTime lt = LocalTime.of(10, 10, 10);
		LocalTime lt2 = (LocalTime) d15.addTo(lt);
		System.out.println(lt);
		System.out.println(lt2);
		
		Duration duration = Duration.parse("PT10H10M10.000000001S");
        System.out.println("getSeconds() : " + duration.getSeconds());
        System.out.println("getNanos() : " + duration.getNano());
        System.out.println("get(ChronoUnit.SECONDS) : "
                           + duration.get(ChronoUnit.SECONDS));
        System.out.println("get(ChronoUnit.NANOS) : "
                           + duration.get(ChronoUnit.NANOS));
        
        System.out.println(Duration.ofHours(0));
        System.out.println(Duration.ofMinutes(0));
        
        System.out.println(Duration.parse("PT10H10M10S").minusDays(1));
        
        Duration duration1 = Duration.parse("PT10H10M10.000000001S");
        System.out.println(duration1.toDays());
        System.out.println(duration1.toHours());
        System.out.println(duration1.toMinutes());
        System.out.println(duration1.toMillis());
        System.out.println(duration1.toNanos());
	}
}