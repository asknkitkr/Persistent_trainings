package Features_of_java8.Q2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of events");
        int n = sc.nextInt();

        sc.nextLine();

        List<Event> eventList = new ArrayList<>();
        System.out.println("Enter event details in CSV(Event Name, Organiser, Event Cost)");
        for (int i = 0; i < n; i++) {
            String[] eventDetails = sc.nextLine().split(",");
            eventList.add(new Event(eventDetails[0], eventDetails[1], Double.parseDouble(eventDetails[2])));
        }

        sc.close();

        Event e = new Event();
        e.display(eventList);
    }
}
