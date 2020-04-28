package basics;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeFormatter {

	public static void main(String[] args) {
		parseDateTime();
		formateDateTime();
	}

	private static void formateDateTime() {
		System.out.println("formateDateTime starts");
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter format1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		String output1 = currentDateTime.format(format1);
		System.out.println("output1: "+output1);
		System.out.println("formateDateTime ends");
	}

	private static void parseDateTime() {
			System.out.println("parseDateTime starts");
			String input = "2020-04-28T20:43";
			//works for both above and below
			//String input = "2020-04-28T20:43:22";
			LocalDateTime basicDateTime = LocalDateTime.parse(input);
			System.out.println("basicDateTime: "+basicDateTime);
			
			LocalDateTime customDateTime1 = LocalDateTime.parse(input,
					DateTimeFormatter.ISO_LOCAL_DATE_TIME);
			System.out.println("customDateTime1: "+customDateTime1);
			
			System.out.println("parseDateTime ends");
	}

}
