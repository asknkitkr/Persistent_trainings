package Q3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date to be formatted:(MM-dd-yyyy)");
        String inputDate = sc.nextLine();
        sc.close();

        // Parsing the input date
        LocalDate date = LocalDate.parse(inputDate, DateTimeFormatter.ofPattern("MM-dd-yyyy"));

        // Formatting the date in required formats
        String format1 = date.format(DateTimeFormatter.ofPattern("EEE, MMM d, yy"));
        String format2 = date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        String format3 = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("Date Format with EEE, MMM d, yy : " + format1);
        System.out.println("Date Format with dd.MM.yyyy : " + format2);
        System.out.println("Date Format with dd dd/MM/yyyy : " + format3);
    }
}
