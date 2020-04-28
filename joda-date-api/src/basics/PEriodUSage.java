package basics;

import java.time.LocalDate;
import java.time.Period;

public class PEriodUSage {
public static void main(String[] args) {
	LocalDate now = LocalDate.now();
	LocalDate later = LocalDate.of(2020, 4, 22);
	Period period1 = Period.between(now, later);
	//period do difference between individaul elements only
	//it do not do like isBefore and isAfter and isEqual method of consoidering all elments combined
	System.out.println("period elements "+period1.getDays()+" " + period1.getMonths()+  " "+period1.getYears());
	
	Period p1 = now.until(LocalDate.of(2021, 2, 10));
	System.out.println("period elements "+p1.getDays()+" " + p1.getMonths()+  " "+p1.getYears());
	System.out.println("logical month "+p1.toTotalMonths());
}

}
