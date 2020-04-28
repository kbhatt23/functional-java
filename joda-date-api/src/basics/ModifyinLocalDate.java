package basics;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class ModifyinLocalDate {

	public static void main(String[] args) {
		LocalDate lCurrent = LocalDate.now();
		System.out.println("lcurrent initially "+lCurrent);
		
		//LocalDate is immutable
		//means when we modify it it creates a new object
		//Like string we need to assign new created object 
		System.out.println("plusMonth: "+lCurrent.plusMonths(2));
		System.out.println("lcurrent after modification: "+lCurrent);
		lCurrent = lCurrent.plusDays(2);
		System.out.println("lCurrent plus days after equalizing "+lCurrent);
		
		//generic addition
		System.out.println("plus days using chronounit "+lCurrent.plus(3, ChronoUnit.DAYS));
		System.out.println("lCurrenlt munis weeks "+lCurrent.minusWeeks(2));
		//to set any atrribute to specific value
		//we can use with method
		
		System.out.println("lcurrent with year "+lCurrent.with(ChronoField.YEAR, 1991));
		
	}

}
