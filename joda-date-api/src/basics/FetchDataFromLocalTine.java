package basics;

import java.time.LocalTime;

public class FetchDataFromLocalTine {
public static void main(String[] args) {
	LocalTime currentTime = LocalTime.now();
	System.out.println("currentTime "+currentTime);
	
	//get methods
	System.out.println("get hour "+ currentTime.getHour());
	System.out.println("get minutes "+currentTime.getMinute());
	System.out.println("get second "+currentTime.getSecond());
	System.out.println("get nano seconds "+currentTime.getNano());
	LocalTime customTime = LocalTime.of(10, 10);
	System.out.println("custom time "+customTime);
	
	System.out.println("custom get second "+customTime.getSecond());
	System.out.println("custom get nano seconds "+customTime.getNano());
	
}
}
