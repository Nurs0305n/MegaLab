import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(1733317001000l);
        Date date = new Date();
        System.out.println(date1);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yy a hh:mm:ss");
        System.out.println(simpleDateFormat.format(date));
        System.out.println(simpleDateFormat.format(date1));

        Calendar calendar = new GregorianCalendar(20, Calendar.AUGUST,20,50,10, 50);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.YEAR, 2000);
        System.out.println(calendar.getTime());
    }
}
