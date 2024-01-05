import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class p_1185 {
    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(31, 8, 2019));
        System.out.println(dayOfTheWeek(18, 7, 1999));
        System.out.println(dayOfTheWeek(15, 8, 1993));
        System.out.println(dayOfTheWeek(16, 8, 1993));
        System.out.println(dayOfTheWeek(17, 8, 1993));
        System.out.println(dayOfTheWeek(4, 1, 2024));
    }

    public static String dayOfTheWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayWeek = date.getDayOfWeek();
        String d = dayWeek.toString();
        return (d.charAt(0) + d.substring(1).toLowerCase());
    }
}