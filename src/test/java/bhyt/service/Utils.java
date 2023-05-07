package bhyt.service;

import java.util.Date;
import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Utils {
    public static int getYear(Date date){

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }
    public static int getMonth(Date date){

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH)+1;
    }

}
