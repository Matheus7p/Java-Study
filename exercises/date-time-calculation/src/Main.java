import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2024-02-19");
        LocalDateTime d02 = LocalDateTime.parse("2024-02-19T02:45:20");
        Instant d03 = Instant.parse("2024-02-19T02:45:20Z");


        LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);

        System.out.println("Past Week = " + pastWeekLocalDateTime);
        System.out.println("Next Week = " + nextWeekLocalDateTime);

        System.out.println(" ");

        Duration t1 = Duration.between(pastWeekLocalDateTime, d02);

        System.out.println("t1 Dias = " + t1.toDays());


    }
}