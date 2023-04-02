package Streams_and_Files.Q2;

import java.io.BufferedWriter;
import java.util.ArrayList;

public class UserBO {
    public static void writeFile(ArrayList<User> userList, BufferedWriter bw) throws Exception {
        for (User u : userList) {
            bw.write(u.getName() + ",");
            bw.write(u.getMobileNumber() + ",");
            bw.write(u.getUsername() + ",");
            bw.write(u.getPassword());
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
