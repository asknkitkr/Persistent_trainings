package Exception_handling.Q4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the stage event start date and end date");

        String startDateString = "";
        String endDateString = "";

        if (scanner.hasNextLine()) {
            startDateString = scanner.nextLine();
        } else {
            System.out.println("Input dates should be in the format 'dd-MM-yyyy-HH:mm:ss'");
            System.exit(0);
        }

        if (scanner.hasNextLine()) {
            endDateString = scanner.nextLine();
        } else {
            System.out.println("Input dates should be in the format 'dd-MM-yyyy-HH:mm:ss'");
            System.exit(0);
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");

        try {
            Date startDate = dateFormat.parse(startDateString);
            Date endDate = dateFormat.parse(endDateString);

            System.out.println("Start date:" + dateFormat.format(startDate));
            System.out.println("End date:" + dateFormat.format(endDate));
        } catch (java.text.ParseException e) {
            System.out.println("Input dates should be in the format 'dd-MM-yyyy-HH:mm:ss'");
        }
    }
}
