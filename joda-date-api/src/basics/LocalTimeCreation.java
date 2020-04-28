package basics;

import java.time.LocalTime;

public class LocalTimeCreation {

	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now();
		System.out.println("currentTime "+currentTime);
		
		LocalTime customTime = LocalTime.of(10, 10);
		System.out.println("custom time "+customTime);
		
		System.out.println("time with second prescison "+LocalTime.of(10, 10, 10));
		
		System.out.println("time with nano second prescison "+LocalTime.of(10, 10, 10 , 1000000));
	}

}
