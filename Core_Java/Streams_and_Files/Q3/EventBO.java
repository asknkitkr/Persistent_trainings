import java.io.*;
import java.util.*;

public class EventBO {
    // fill your code here
    public List<Event> readFromFile(BufferedReader br) throws Exception {
        List<Event> a = new ArrayList<Event>();

        String input = br.readLine();
        while (input != null) {
            String[] data = input.split(",");
            if (data.length != 3)
                break;
            a.add(new Event(data[0], Integer.parseInt(data[1]), data[2]));
            input = br.readLine();
        }
        return a;
    }

    void writeFile(List<Event> eventList, FileWriter fr) throws Exception {
        BufferedWriter bw = new BufferedWriter(fr);
        HashSet<String> hs = new HashSet<>();
        for (Event x : eventList) {
            if (hs.contains(x.getOwnerName()))
                continue;
            hs.add(x.getOwnerName());
            String data = x.getEventName() + "," + x.getAttendeesCount() + "," + x.getOwnerName();
            bw.write(data, 0, data.length());
            bw.newLine();
        }
        bw.flush();
    }
}