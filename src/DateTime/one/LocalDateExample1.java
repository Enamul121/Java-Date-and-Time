package DateTime.one;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateExample1 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        System.out.println("Today date : "+date);

        LocalDate yesterDay = date.minusDays(1);

        System.out.println("\nYseterday date : " +  yesterDay);

        LocalDate tomorrow = date.plusDays(1);

        System.out.println(" Tomorrow date : " + tomorrow);

        /***
         *
         *   Blocak 2
         *
         */


        LocalDate date1 = LocalDate.of(17,1,11);
        System.out.println("isLeap Year : " + date1.isLeapYear());

        LocalDate date2 = LocalDate.of(16,5,5);
        System.out.println("IS LeapYear : " + date2.isLeapYear());


        //LocalDate Example: atTime()

        LocalDateTime date3 = date2.atTime(1,44,9);

        System.out.println(" Date and Time:: " + date3);

























    }

}
