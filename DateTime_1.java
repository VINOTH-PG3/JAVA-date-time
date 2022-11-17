package dateTimeMethods;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

// 4 Different way to get time and date in java
//1.simple date format
//2.date
//3.local date
//4.local date and time
public class DateTime_1 {
	public static void main(String[] args) {
		
		//1.simple date format
		String dateTimeYear =new SimpleDateFormat("yyyy-MM-dd  // hh:mm:ss ").format(Calendar.getInstance().getTime());
		
		System.out.println(dateTimeYear);
		
		//1A.simple date format addind am/pm by adding single letter a
		String dateTimeYear2 =new SimpleDateFormat("yyyy-MM-dd  // hh:mm:ss a ").format(Calendar.getInstance().getTime());
		System.out.println(dateTimeYear2);
		
		
		//1B.simple date format addind am/pm by adding single letter a
		Date date12 =new Date();
		
		SimpleDateFormat date123;
		
		date123 = new SimpleDateFormat(" hh:mm:ss a ");
		LocalDate Ldater = LocalDate.now();
		System.out.print(Ldater);System.out.println(" "+date123.format(date12));
		
		
		//2.date
	    Date date1 =new Date(System.currentTimeMillis());
		System.out.println(date1);
		
		
		//3.local date
		LocalDate Ldate = LocalDate.now();
		System.out.println(Ldate);
		
		
		//4.local date and time
		LocalDateTime LdateTime = LocalDateTime.now();
		System.out.println(LdateTime);
		
	}

}
