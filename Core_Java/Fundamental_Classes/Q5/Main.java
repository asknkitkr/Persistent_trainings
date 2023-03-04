package Fundamental_Classes.Q5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Events");
        int n = sc.nextInt();
        sc.nextLine();

        List<Event> events = new ArrayList<>();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter event details in CSV(Event Name,Start Date,End Date) Date:dd/MM/yyyy");
        for (int i = 1; i <= n; i++) {
            String input = sc.nextLine();
            String[] tokens = input.split(",");
            String eventName = tokens[0].trim();
            Date startDate = null;
            Date endDate = null;
            try {
                startDate = dateFormat.parse(tokens[1].trim());
                endDate = dateFormat.parse(tokens[2].trim());
            } catch (ParseException e) {
                System.out.println("Invalid date format. Please enter dates in dd/MM/yyyy format.");
                continue;
            }
            Event event = new Event(eventName, startDate, endDate);
            events.add(event);
        }

        List<String> oneDayEvents = new ArrayList<>();
        for (Event event : events) {
            if (isOneDayEvent(event)) {
                oneDayEvents.add(event.getEventName());
            }
        }

        System.out.println("1-day Events:");
        if (oneDayEvents.isEmpty()) {
            System.out.println("No Events");
        } else {
            for (String eventName : oneDayEvents) {
                System.out.println(eventName);
            }
        }

        sc.close();
    }

    private static boolean isOneDayEvent(Event event) {
        Date startDate = event.getStartDate();
        Date endDate = event.getEndDate();
        return startDate.equals(endDate);
    }
}
