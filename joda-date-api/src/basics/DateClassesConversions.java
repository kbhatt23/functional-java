package basics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateClassesConversions {

	public static void main(String[] args) {
		//convert localdate to localdatetime
		LocalDate localDate = LocalDate.now();
		LocalDateTime fullDay = localDate.atTime(LocalTime.now());
		System.out.println("LocalDateTime "+fullDay);
		LocalDateTime customLocalDateTime = localDate.atTime(14, 10, 23);
		System.out.println("customLocalDateTime "+customLocalDateTime);
		
		//convert localdtime to localdatetime
		LocalTime localTime = LocalTime.now();
		LocalDateTime timetodatetime = localTime.atDate(localDate);
		System.out.println("timetodatetime "+timetodatetime);
		
		//convert localdatetime to indicdual atrributes
		System.out.println("date  part of complete localdatetiem "+timetodatetime.toLocalDate());
		System.out.println("time  part of complete localdatetiem "+timetodatetime.toLocalTime());
	}

}
