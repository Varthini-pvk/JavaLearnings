package DataAndTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatConversion 
{


public static void main(String[] args) 
{
	String s="07:05:45PM";
	 DateTimeFormatter formatt=DateTimeFormatter.ofPattern("HH:mm:ss");
     DateTimeFormatter formatt2=DateTimeFormatter.ofPattern("hh:mm:ssa");
   System.out.println(formatt.format(LocalTime.parse(s,formatt2)));
}
}
