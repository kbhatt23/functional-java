package basics;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LocalDateUtilityMethods {

	public static void main(String[] args) throws InterruptedException {
		LocalDate now = LocalDate.now();
		//will return true
		//as localdate do not have time
		//even with sleep same reult, however for localdate tiem it will be false
		//Thread.sleep(3000);
		System.out.println("equals "+now.isEqual(LocalDate.now()));
		System.out.println("isLeap Year "+now.isLeapYear());
		LocalDate ofYearDay = LocalDate.ofYearDay(2019, 1);
		System.out.println("isLEap Year 2019 "+ofYearDay.isLeapYear());
		System.out.println("isbefore1 "+now.isBefore(ofYearDay));
		System.out.println("isbefore2 "+ofYearDay.isBefore(now));
		System.out.println("isAfter1 "+now.isAfter(ofYearDay));
		
		//To check if Order submission date is within 7 days of return eligilbliyt
		LocalDate orderSubmissionDate = LocalDate.of(2020, 4, 14);
		LocalDate validThresholdDate = now.minusDays(7);
		if(validThresholdDate.isBefore(orderSubmissionDate) || validThresholdDate.isEqual(orderSubmissionDate)) {
			System.out.println("order is valid");
		}else {
			System.out.println("order is not valid");
		}
		
		//unsupported operations
		//always need to check if suppeorted conidtion
		//or alwyas use non genrirc methods like plusDays,plusMonth
		if(now.isSupported(ChronoUnit.MINUTES)) {
			System.out.println("localdate plus minutes "+now.plus(10, ChronoUnit.MINUTES));
		}
		
		if(now.isSupported(ChronoUnit.DAYS)) {
			System.out.println("localdate plus minutes "+now.plus(10, ChronoUnit.DAYS));
		}
	}

}
