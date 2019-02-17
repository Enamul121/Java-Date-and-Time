package DateTime.one;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

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

        System.out.println("------------------------------\n BLOCK 2 \n");

        System.out.println("------------------------------");
        ZoneId zone1 = ZoneId.of("Asia/Kolkata");
        ZoneId zone2 = ZoneId.of("Asia/Tokyo");

        LocalTime timeZone = LocalTime.now(zone1);
        System.out.println("India Time Zone: "+timeZone + "\n");

        LocalTime timeZone2 = LocalTime.now(zone2);
        System.out.println("Japan Time Zone: "+ timeZone2);

        long hours = ChronoUnit.HOURS.between(timeZone,timeZone2);
        System.out.println("Hours between two Time Zone: "+hours);

        long minutes = ChronoUnit.MINUTES.between(timeZone, timeZone2);
        System.out.println("Minutes between two time zone: "+minutes);






    }




}
