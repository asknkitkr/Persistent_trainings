package Streams_and_Files.Q1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.csv"));
            UserBO userBO = new UserBO();

            List<User> userList = userBO.readFromFile(br);
            userBO.display(userList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
