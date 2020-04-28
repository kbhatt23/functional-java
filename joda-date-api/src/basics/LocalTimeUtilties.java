package basics;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeUtilties {
public static void main(String[] args) {
	//modifciation
	//it is immuabtle
	LocalTime currentTime = LocalTime.now();
	System.out.println("currentTime "+currentTime);
	
	currentTime = currentTime.minusHours(4);
	System.out.println("modified current time "+currentTime);
	
	System.out.println("plus minutees "+currentTime.plusMinutes(10));
	
	//custom property
	//120 seconds from 12 means 12:02 am
	System.out.println("creating using seconds from 12:00 am method "+LocalTime.ofSecondOfDay(120));
	//minus rolls the precision
	//eg 61 second will reduce 1 second and 1 minute
	System.out.println("minus using generic method "+currentTime.minus(61, ChronoUnit.SECONDS));
	
	//unsupported methods
	if(currentTime.isSupported(ChronoUnit.DAYS)) {
		System.out.println(currentTime.plus(10, ChronoUnit.DAYS));
	}
	
	//with methods
	//apart form modification rest other ubits remain same
	System.out.println("with sepcific hour "+currentTime.withHour(12));
	//isBefore
	//return true beause of nano seonds
	System.out.println("isbefore "+currentTime.isBefore(LocalTime.now()));
	
	//lets say we had precison witll minute only
	
	}
}
