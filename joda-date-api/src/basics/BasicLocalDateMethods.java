package basics;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;

public class BasicLocalDateMethods {

	public static void main(String[] args) {
		//how to create local date differently
		LocalDate l1 = LocalDate.of(1991, Month.MARCH, 23);
		System.out.println("l1: "+l1);
		
		LocalDate l2 = LocalDate.of(1991, 3, 23);
		System.out.println("l2: "+l2);
		
		//not a leap year excpetion will occue
		//LocalDate l3 = LocalDate.of(1991, 2, 29);
		LocalDate l3 = LocalDate.of(1991, 2, 28);
		System.out.println("fake l3 "+l3);
		
		//fetching methods
		System.out.println("day of month "+l3.getDayOfMonth());
		System.out.println("day of week "+l3.getDayOfWeek());
		System.out.println("property using temporal "+l3.get(ChronoField.DAY_OF_WEEK));
	}

}
