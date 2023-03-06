package Object_Oriented_Programming.Q4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Enter your choice:");
        System.out.println("1.Exhibition event");
        System.out.println("2.Stage event");
        int choice = sc.nextInt();
        sc.nextLine();

        Event event;
        if (choice == 1) {
            System.out.println("Enter the details of exhibition:");
            String[] eventDetails = sc.nextLine().split(",");
            String name = eventDetails[0];
            String detail = eventDetails[1];
            String type = eventDetails[2];
            String ownerName = eventDetails[3];
            Double costPerDay = Double.parseDouble(eventDetails[4]);
            event = new Exhibition(name, detail, type, ownerName, costPerDay, choice);
        } else if (choice == 2) {
            System.out.println("Enter the details of stage event:");
            String[] eventDetails = sc.nextLine().split(",");
            String name = eventDetails[0];
            String detail = eventDetails[1];
            String type = eventDetails[2];
            String ownerName = eventDetails[3];
            Double costPerDay = Double.parseDouble(eventDetails[4]);
            event = new StageEvent(name, detail, type, ownerName, costPerDay, choice);
        }

        System.out.println("Enter the starting date of the event:");
        Date startDate = df.parse(sc.nextLine());
        System.out.println("Enter the ending date of the event:");
        Date endDate = df.parse(sc.nextLine());
        long diff = endDate.getTime() - startDate.getTime();
        Double totalCost = (diff / (1000 * 60 * 60 * 24) + 1) * event.getCostPerDay();
        Double gst;
        if (choice == 1) {
            gst = 0.05 * totalCost;
        } else {
            gst = 0.15 * totalCost;
        }
        System.out.println("The GST to be paid is Rs." + gst);

        sc.close();
    }
}
