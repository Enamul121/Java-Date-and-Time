package DateTime.one;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

public class LocalDateTimeExample1 {


    public static void main(String[] args) {


        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("\nBefore Formatting: " + dateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formater = dateTime.format(dateTimeFormatter);
        System.out.println("\n After Formatting : " + formater);

        /****
         *
         *   BLOCK 2
         *
         *
         */

        System.out.println("\n-------------------  BLOCK 2 -------------------\n");
        LocalDateTime localDateTime = LocalDateTime.of(2019,2,18,1,0);
        System.out.println(localDateTime.get(ChronoField.DAY_OF_YEAR));
        System.out.println(localDateTime.get(ChronoField.DAY_OF_WEEK));
        System.out.println(localDateTime.get(ChronoField.DAY_OF_MONTH));
        System.out.println(localDateTime.get(ChronoField.HOUR_OF_DAY));
        System.out.println(localDateTime.get(ChronoField.MINUTE_OF_DAY));















    }


}
