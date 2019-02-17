package DateTime.one;

import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeExmple {

    public static void main(String[] args) {


        LocalTime time = LocalTime.now();

        System.out.println(time);

        int hour,min,sec;
        hour=10;
        min=30;
        sec=55;

        LocalTime time1 = LocalTime.of(hour,min,sec);
        System.out.println(time1);

        // OR
        LocalTime time2 = LocalTime.of(10,30,55);
        System.out.println("Local Time : " + time2);

        LocalTime time3 = time2.plusHours(1);
        LocalTime time4 = time3.plusMinutes(15);
        LocalTime time5 = time3.minusSeconds(15);

        System.out.println("Custom Local Time : " + time5);


        /*****
         *
         *
         *
         *    BLOCK 2
         *
         *
         *
         */

        ZoneId zoneId = ZoneId.of("Asia/Kolkata");





    }




}
