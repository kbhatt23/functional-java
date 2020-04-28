package basics;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateParser {

	public static void main(String[] args) {

		//convert string to localdate
		parseDate();
		//convert localdate object to string
		formatDate();
	}

	private static void formatDate() {
		System.out.println("===================formating starts============");
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		String formatString1 =localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("formatString1: "+formatString1);
		
		//custom format
		//# do not work
		DateTimeFormatter customFormat1 = DateTimeFormatter.ofPattern("MM,dd,yyyy");
		String customformatString1 = localDate.format(customFormat1);
		
		System.out.println("customformatString1: "+customformatString1);
		
		DateTimeFormatter customFormat2 = DateTimeFormatter.ofPattern("MM*yyyy");
		String customformatString2 = localDate.format(customFormat2);
		
		System.out.println("customformatString2: "+customformatString2);
		System.out.println("===================formating ends============");
	}

	private static void parseDate() {
		
		System.out.println("===================parsing starts============");
		String date = "2020-04-28";
		LocalDate basicDate =LocalDate.parse(date);
		System.out.println("basicDate: "+basicDate);
		
		LocalDate basicDate1 = LocalDate.parse(date,DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println("basicDate1: "+basicDate1);
		
		//custom parsing
		DateTimeFormatter customFormat1 = DateTimeFormatter.ofPattern("MM,dd,yyyy");
		//LocalDate customDate1 = LocalDate.parse(date, customFormat1);
		LocalDate customDate1 = LocalDate.parse("03,23,1991", customFormat1);
		System.out.println("customDate1: "+customDate1);
		
		DateTimeFormatter customFormat2 = DateTimeFormatter.ofPattern("MM*yyyy*dd");
		
		LocalDate customDate2 = LocalDate.parse("03*1991*23", customFormat2);
		System.out.println("customDate2: "+customDate2);
		
		System.out.println("===================parsing ends============");
	}

}
