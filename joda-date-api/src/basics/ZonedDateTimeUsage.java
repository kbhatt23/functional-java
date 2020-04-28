package basics;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeUsage {

	public static void main(String[] args) {
		ZonedDateTime currentZoneDateTime = ZonedDateTime.now();
		System.out.println("currentZoneDateTime "+currentZoneDateTime);
		
		LocalDateTime currentLocalDateTime  = LocalDateTime.now();
		System.out.println("currentLocalDateTime "+currentLocalDateTime);
		
		Duration duration = Duration.between(currentZoneDateTime, ZonedDateTime.now().plusHours(1));
		System.out.println(duration.getNano());
	
		ZoneId.getAvailableZoneIds()
		.stream()
		//.filter(e -> e.toLowerCase().contains("calcutta"))
		.forEach(System.out::println);
		
		System.out.println("zonedatetime using default system zone "+ZonedDateTime.now(ZoneId.systemDefault()));
		
		System.out.println("zonedatetime using custom system zone "+ZonedDateTime.now(ZoneId.of("Europe/Rome")));
		
		//converting locadateTime to zonedDatetime
		//bad way
		ZonedDateTime convertedZoneDateTime =ZonedDateTime.of(currentLocalDateTime, ZoneId.of("Asia/Anadyr"));
		System.out.println("convertedZoneDateTime "+convertedZoneDateTime);
	
		//good way is to use OOB api
		System.out.println("OOB dateimte to zonedatetime conversion "+LocalDateTime.now().atZone(ZoneId.of("Asia/Anadyr")));
		
		System.out.println("OOB instatn to zonedatetime conversion "+Instant.now().atZone(ZoneId.of("Asia/Anadyr")));
	
		;
	}

}
