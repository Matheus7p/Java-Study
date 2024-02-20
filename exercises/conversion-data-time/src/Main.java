import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2024-02-19");
        LocalDateTime d02 = LocalDateTime.parse("2024-02-19T23:15:30");
        Instant d03 = Instant.parse("2024-02-19T23:15:20Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());


        //Duas formas de instanciar e converter date time
        System.out.println("D01 = " + d01.format(fmt1));
        System.out.println("D01 = " + fmt1.format(d01));

        System.out.println(" ");

        System.out.println("D02 = " + d02.format(fmt1));
        System.out.println("D02 = " + d02.format(fmt2));

        System.out.println(" ");

        System.out.println("D03 = " + fmt3.format(d03));



    }
}