import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2024-02-17");
        LocalDateTime d05 = LocalDateTime.parse("2024-02-17T22:55:00");
        Instant d06 = Instant.parse("2024-02-17T22:55:00Z");
        Instant d07 = Instant.parse("2024-02-17T22:55:00-03:00");
        LocalDate d08 = LocalDate.parse("17/02/2024", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("17/02/2024 22:55", fmt2);
        LocalDate d10 = LocalDate.of(2024, 2, 17);
        LocalDateTime d11 = LocalDateTime.of(2024, 2, 17, 22, 55);

        System.out.println("D01 = " + d01);
        System.out.println("D02 = " + d02);
        System.out.println("D03 = " + d03);
        System.out.println("D04 = " + d04);
        System.out.println("D05 = " + d05);
        System.out.println("D06 = " + d06);
        System.out.println("D07 = " + d07);
        System.out.println("D08 = " + d08);
        System.out.println("D09 = " + d09);
        System.out.println("D10 = " + d10);
        System.out.println("D11 = " + d11);
    }
}