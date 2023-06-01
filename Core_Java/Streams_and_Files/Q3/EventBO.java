package Core_Java.Streams_and_Files.Q3;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EventBO {

    public List<Event> readFromFile(BufferedReader br) {
        List<Event> eventList = new ArrayList<>();

        try {
            String line;
            while ((line = br.readLine()) != null) {
                String[] eventData = line.split(",");
                if (eventData.length == 3) {
                    Event event = new Event(eventData[0], Integer.parseInt(eventData[1]), eventData[2]);
                    System.out.println(eventData[0] + Integer.parseInt(eventData[1]) + eventData[2]);
                    eventList.add(event);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return eventList;
    }

    public void writeFile(List<Event> eventList, FileWriter fr) {
        Set<String> ownerSet = new HashSet<>();
        try {
            for (Event event : eventList) {
                if (!ownerSet.contains(event.getOwnerName())) {
                    ownerSet.add(event.getOwnerName());
                    fr.write(event.getEventName() + "," + event.getAttendeesCount() + "\n");
                }
                fr.flush();
                fr.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
