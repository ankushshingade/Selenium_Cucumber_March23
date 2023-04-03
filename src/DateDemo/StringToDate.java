package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
    public static void main(String[] args) throws ParseException {

        String dateStr0= "23-June-2016";
        System.out.println("Given String: "+dateStr0);
        // → dd-MMMM-yyyy
        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");
        Date date0 = sd0.parse(dateStr0);
        System.out.println("Converted date: "+date0);

        String dateStr1= "23 | June 16  8:34";
        System.out.println("Given String: "+dateStr1);
        // → dd | MMMM yy hh:mm
        // → dd | MMMM yy h:mm
        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy h:mm");
        Date date1 = sd1.parse(dateStr1);
        System.out.println("Converted date: "+date1);

        String dateStr2= "2016-06-23 | 8:34:23";
        System.out.println("Given String: "+dateStr2);
        // → yyyy-MM-dd | hh:mm:ss
        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd | hh:mm:ss");
        Date date2 = sd2.parse(dateStr2);
        System.out.println("Converted date: "+date2);

        String dateStr3= "Thursday 2016/06/23";
        System.out.println("Given String: "+dateStr3);
        // → EEEE yyyy/MM/dd
        SimpleDateFormat sd3 = new SimpleDateFormat("EEEE yyyy/MM/dd");
        Date date3 = sd3.parse(dateStr3);
        System.out.println("Converted date: "+date3);

        String dateStr4= "23-06-2016 | thu | 8:34";
        System.out.println("Given String: "+dateStr4);
        // → dd-MM-yyyy | E | hh:mm
        SimpleDateFormat sd4 = new SimpleDateFormat("dd-MM-yyyy | E | hh:mm");
        Date date4 = sd4.parse(dateStr4);
        System.out.println("Converted date: "+date4);

        String dateStr5= "8:34:22";
        System.out.println("Given String: "+dateStr5);
        // → hh:mm:ss
        SimpleDateFormat sd5 = new SimpleDateFormat("hh:mm:ss");
        Date date5 = sd5.parse(dateStr5);
        System.out.println("Converted date: "+date5);

    }
}
