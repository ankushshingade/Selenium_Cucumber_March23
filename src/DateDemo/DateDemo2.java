package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args) throws ParseException {

        String dateStr = "04/22/2000"; // MM/dd/yyyy
        System.out.println("Given date in String: "+dateStr);
        // Convert string into date.
        SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy");
        Date date = sd.parse(dateStr);
        System.out.println("System formatted date: "+date);

    }
}
