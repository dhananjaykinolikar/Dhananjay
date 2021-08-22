package Practice;

import java.util.Calendar;
import java.util.Date;

public class date_calendar {

	public static void main(String[] args) throws InterruptedException {
		
		Date d =new Date();
		
		System.out.println(d.getTime());
		
		System.out.println(d);
		
	
		System.out.println(d.before(d));
		System.out.println(d.after(d));
		
		
		Calendar cl = Calendar.getInstance();	
		
		System.out.println(cl.getCalendarType());
		System.out.println(cl.getTimeZone());
		System.out.println(cl.getTimeInMillis());
		
		System.out.println(cl.getWeekYear());
		System.out.println(cl.getTime());
		
	}

}
