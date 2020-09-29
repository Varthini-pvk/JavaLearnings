package DataAndTime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class GetTimeInAZone {
	
	public static void main(String[] args) {
		//Local time zone class doesnot work here.(TimeZone is not saved)
		
		Instant time=Instant.now();
		ZonedDateTime londonTime=time.atZone(ZoneId.of("Europe/London"));
		ZonedDateTime newyorkTime=time.atZone(ZoneId.of("America/New_York"));
		
		//Time Zone IDs:https://garygregory.wordpress.com/2013/06/18/what-are-the-java-timezone-ids/
		
		//To format using DateTimeFormatter class
		
		System.out.println(londonTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL)));
		System.out.println(londonTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		System.out.println(londonTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)));
		DateTimeFormatter outputFormat=DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println(outputFormat.format(londonTime));
		System.out.println(outputFormat.format(newyorkTime));
	}

}
