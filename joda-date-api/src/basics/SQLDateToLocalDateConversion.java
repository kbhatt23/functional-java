package basics;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class SQLDateToLocalDateConversion {
public static void main(String[] args) {
	//util date to localdate
	Date date = new Date();
	LocalDate convertedlocaldate =date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	System.out.println("convertedlocaldate "+convertedlocaldate);
	
	Date date1 = Date.from(Instant.from(ZonedDateTime.of(convertedlocaldate, LocalTime.now(), ZoneId.systemDefault())));
	System.out.println("date1 "+date1);
	
	//sql date to localte
	java.sql.Date sqlDate = java.sql.Date.valueOf(convertedlocaldate);
	System.out.println("sql date to local date "+sqlDate.toLocalDate());
}
}
