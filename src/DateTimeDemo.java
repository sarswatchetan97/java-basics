import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date and time: " +currentDateTime);

        //Format to specific pattern
        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String formatedDate = currentDate.format(formatter);

        System.out.println("Formatted Date: " +formatedDate);

    }
}


