package basics;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeMethods {
public static void main(String[] args) {
	//fetch data
	LocalDateTime ldtNow = LocalDateTime.now();
	System.out.println("ldtNow "+ldtNow);
	System.out.println("internal values "+ldtNow.getMonthValue()+ " "+ldtNow.getHour()+ " "+ldtNow.getNano());
	
	LocalDateTime ldtCustom1 = LocalDateTime.of(1991, Month.MARCH, 23, 10, 10,50,100);
	System.out.println("ldtCustom: "+ldtCustom1);
	System.out.println("generic proeprty month "+ldtCustom1.get(ChronoField.DAY_OF_MONTH));
	
	//manipulation methods
	//roll up of higher order happens auto
	//like 44 hours added day on its own
	System.out.println("added 10 hours "+ldtCustom1.plus(44, ChronoUnit.HOURS));
	
	//speciif property addition
	System.out.println("setting aspecific propety "+ldtCustom1.withDayOfMonth(4));
	
	//is before, isAfter and isEquals same as before
	
	LocalDateTime orderSubmissionTime = LocalDateTime.of(2020, 4, 12, 12, 02, 33);
	LocalDateTime thrsheoldDay = ldtNow.minusDays(7);
	if(thrsheoldDay.isEqual(orderSubmissionTime) || thrsheoldDay.isBefore(orderSubmissionTime)) {
		System.out.println("order elgibile for return");
	}else {
		System.out.println("order not elgibile for return");
	}
}
}
