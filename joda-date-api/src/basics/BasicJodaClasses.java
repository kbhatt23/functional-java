package basics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class BasicJodaClasses {

	public static void main(String[] args) {
		//date only
		LocalDate localdate = LocalDate.now();
		System.out.println("localdate: "+localdate);
		
		//time only
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime: "+localTime);
		
		//both date and time
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime: "+localDateTime);
	}

}
