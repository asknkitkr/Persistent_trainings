import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // fill your code here
        FileWriter fr = new FileWriter("output.txt");
        FileReader f = new FileReader("input.txt");
        EventBO ubo = new EventBO();
        BufferedReader br = new BufferedReader(f);
        List<Event> list = ubo.readFromFile(br);
        ubo.writeFile(list, fr);
    }
}