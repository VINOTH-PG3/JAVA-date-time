package dateTimeMethods;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class time12HourFormat {


   public static void main(String[] argv) throws Exception {
      Date dt12 = new Date();
      
      SimpleDateFormat dateFormat;
    
      dateFormat = new SimpleDateFormat("hh:mm:ss a ");
      LocalDate Ldate = LocalDate.now();
		System.out.print(Ldate);System.out.println("  "+dateFormat.format(dt12));
   }
}