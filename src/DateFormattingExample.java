import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateFormattingExample {
    public static void main(String[] args) {
        double number = 123456.89;

        LocalDate date = LocalDate.now();

        //Format date for US locale
        DateTimeFormatter usFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.US);
        String usDate = date.format(usFormatter);
        System.out.println("Date in US Format: " +usDate);

        //Format number for US locale
        NumberFormat usNumberFormatter = NumberFormat.getNumberInstance(Locale.US);
        String usNumber = usNumberFormatter.format(number);
        System.out.println("Number in US Format: " +usNumber);

        //Format currency for US locale
        NumberFormat usCurrencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String usCurrency = usCurrencyFormat.format(number);
        System.out.println("Currency in US Format: " + usCurrency);
    }
}

