package java_Question;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Dateprog {

	public static void main(String[] args) {
	
		SimpleDateFormat dateformate= new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		Date date= new Date();
		
		System.out.println(dateformate.format(date));
		
//		LocalDateTime current = LocalDateTime.now();
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
//        String formatted = current.format(formatter);
//
//        System.out.println("Current Date and Time is: " + formatted);

		
		  Date d1 = new Date();
	        System.out.println("Current date is " + d1);
	        
	        Calendar c = Calendar.getInstance();
	        System.out.println(dateformate.format(c.getTime()));
	}

}
