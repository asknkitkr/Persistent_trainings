package Core_Java.Streams_and_Files.Q3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

// import Core_Java.Streams_and_Files.Q3.EventBO;

public class Main {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            FileWriter fw = new FileWriter(outputFile);

            EventBO eventBO = new EventBO();
            List<Event> eventList = eventBO.readFromFile(br);
            eventBO.writeFile(eventList, fw);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}