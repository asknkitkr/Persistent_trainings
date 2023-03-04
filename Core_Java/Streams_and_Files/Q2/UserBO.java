package Streams_and_Files.Q2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UserBO {
    public static void writeFile(ArrayList<User> userList, BufferedWriter bw) {
        try {
            bw.write("Name,Mobile Number,Username,Password\n");
            for (User user : userList) {
                bw.write(user.getName() + "," + user.getMobileNumber() + "," +
                        user.getUsername() + "," + user.getPassword() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
