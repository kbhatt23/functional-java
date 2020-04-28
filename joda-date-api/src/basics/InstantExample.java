package basics;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class InstantExample {
public static void main(String[] args) {
	//machine readable object for time
	//time in milliseconds fomr 1 jan 1970 till now
	Instant instant = Instant.now();
	System.out.println("now "+instant);
	System.out.println("now localdatetime "+LocalDateTime.now());
	
	if(instant.isSupported(ChronoField.DAY_OF_MONTH)) {
		System.out.println("day of moth from instant "+instant.get(ChronoField.DAY_OF_MONTH));
	}
	System.out.println("machine readable time eopch "+instant.getEpochSecond());
	
	System.out.println("converting second to instant "+Instant.ofEpochSecond(instant.getEpochSecond()));
	System.out.println(1588066846/86400);
	
	//difference between two instant
	
	Instant epochDay = Instant.ofEpochSecond(1588066846/86400);
	System.out.println("eopch day is "+epochDay )
	;
	
	Instant realEpochDay = Instant.ofEpochSecond(0);
	System.out.println(realEpochDay);
	
	Duration difference  = Duration.between(realEpochDay, epochDay);
	System.out.println(difference.getSeconds());
}
}
