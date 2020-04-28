package basics;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExamples {

	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now();
		System.out.println("current time "+currentTime);
		
		System.out.println("supported "+currentTime.isSupported(ChronoUnit.DAYS));
		if(currentTime.isSupported(ChronoUnit.DAYS)) {
			currentTime.plus(1, ChronoUnit.DAYS);
			System.out.println(currentTime.get(ChronoField.DAY_OF_YEAR));		}
		
		
	}

}
