package basics;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationUsage {

	public static void main(String[] args) {
		LocalTime t1 = LocalTime.of(10, 30);
		LocalTime t2 = LocalTime.of(11, 52);
		//here duration class is nt created
		//hence it calculates logiccal minute difference
		System.out.println(t1.until(t2, ChronoUnit.MINUTES));
		
		Duration d1 = Duration.between(t1, t2);
		//logical
		System.out.println("duration entities "+d1.toMinutes());
	}

}
