import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class HelloDateTime {
    public static void main(String... args) {
        System.out.println("Hello Data Time!");

        // 1. Local DateTime

        LocalDateTime timePoint = LocalDateTime.now();
        System.out.println(timePoint); // 2017-08-28T05:15:18.485

        LocalDate theDate = timePoint.toLocalDate();
        System.out.println(theDate); // 2017-08-28

        Month month = timePoint.getMonth();
        System.out.println(month); // AUGUST

        int dayOfMonth = timePoint.getDayOfMonth();
        System.out.println(dayOfMonth); // 28

        int sec = timePoint.getSecond();
        System.out.println(sec); // 18

        LocalDateTime thePast = timePoint.withDayOfMonth(6).withYear(2010);
        System.out.println(thePast); // 2010-08-06T05:15:18.485

        LocalDateTime yetAnother = thePast.plusWeeks(3).plus(3, ChronoUnit.WEEKS);
        System.out.println(yetAnother); // 2010-09-17T05:15:18.485

        // ---

        LocalDate date = LocalDate.of(2012, Month.DECEMBER, 25);
        System.out.println(date); // 2012-12-25

        LocalTime time = LocalTime.of(15, 30);
        System.out.println(time); // 15:30

        LocalTime time2 = LocalTime.parse("04:30:59");
        System.out.println(time2); // 04:30:59

        // 2. Zoned DateTime

        // 3. Periods

        // 4. Durations

        // DayOfWeek and Month Enums

        // Formatting

        // DateTime Arithmetic

        // DateTime Comparison

        // DateTime Sorting

        // TODO: Complete this Kata
    }
}
