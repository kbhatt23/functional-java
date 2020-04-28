package basics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeCreation {
public static void main(String[] args) {
	//creation methods
	LocalDateTime ldtNow = LocalDateTime.now();
	System.out.println("ldtNow "+ldtNow);
	LocalDateTime ldtCustom = LocalDateTime.of(1991, Month.MARCH, 23, 10, 10);
	System.out.println("ldtCustom: "+ldtCustom);
	
	LocalDateTime ldtCustom1 = LocalDateTime.of(1991, Month.MARCH, 23, 10, 10,50,100);
	System.out.println("ldtCustom: "+ldtCustom1);
	
	LocalDateTime ldtCustom3 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
	System.out.println("ldtCustom3: "+ldtCustom3);
}
}
