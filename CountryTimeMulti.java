package dateTimeMethods;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class CountryTimeMulti {
public static void main(String[] args) {
	TimeZone.setDefault(TimeZone.getTimeZone("Asia/kolkata"));
	Date date2 =new Date(System.currentTimeMillis());
	System.out.println("The bangkok time         :    "+date2);
	System.out.println();

	TimeZone.setDefault(TimeZone.getTimeZone("Europe/Paris"));
	Date date33 =new Date(System.currentTimeMillis());
	System.out.println("The Europe/Paris time    :    "+date33);
	System.out.println();
	
	
	TimeZone.setDefault(TimeZone.getTimeZone("Asia/Singapore"));
	Date date35 =new Date(System.currentTimeMillis());
	System.out.println("The Asia/Singapore time  :    "+date35);
	System.out.println();
	
	TimeZone.setDefault(TimeZone.getTimeZone("Japan"));
	  Date dt12 = new Date();
      SimpleDateFormat dateForma;
      dateForma = new SimpleDateFormat("hh:mm:ss a");
      System.out.println("Time in 12 hr format     :"+dateForma.format(dt12));
; 
	
	System.out.println();
}       
}
