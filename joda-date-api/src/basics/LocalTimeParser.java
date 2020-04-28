package basics;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeParser {

	public static void main(String[] args) {
		 runLocalTimeParser();
		 runLocalTimeFormatter();
	}

	private static void runLocalTimeFormatter() {
		System.out.println("localtime formatter starts");
		LocalTime localTime = LocalTime.now();
		String formattedString1 = localTime.format(DateTimeFormatter.ISO_LOCAL_TIME);
		System.out.println("formattedString1: "+formattedString1);
		
		//custom formatter
		DateTimeFormatter customForamt1 = DateTimeFormatter.ofPattern("hh:mm:ss");
		String customString1 = localTime.format(customForamt1);
		System.out.println("customString1: "+customString1);
		
		
		DateTimeFormatter customForamt2 = DateTimeFormatter.ofPattern("hh,mm,ss");
		String customString2 = localTime.format(customForamt2);
		System.out.println("customString2: "+customString2);
		
		System.out.println("localtime formatter ends");
	}

	private static void runLocalTimeParser() {
		System.out.println("localtime parser starts");
		
		String inputTime = "14:11:11.111";
		LocalTime parsedTimeDefault  = LocalTime.parse(inputTime);
		System.out.println("parsedTimeDefault: "+parsedTimeDefault);
		
		String customInputTime = "11-11-11";
		DateTimeFormatter df1 = DateTimeFormatter.ofPattern("HH-mm-ss");
		LocalTime customLocalTime1 = LocalTime.parse(customInputTime,df1);
		System.out.println("customLocalTime1: "+customLocalTime1);
		
		System.out.println("localtime parser ends");
		
	}

}
