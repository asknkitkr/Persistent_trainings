package Streams_and_Files.Q2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> userList = new ArrayList<>();

        System.out.println("Enter the number of users:");
        int n = sc.nextInt();

        sc.nextLine();

        User user = null;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of user " + (i + 1) + ":");
            String line = sc.nextLine();

            String[] fields = line.split(",");
            user = new User();
            user.setName(fields[0]);
            user.setMobileNumber(fields[1]);
            user.setUsername(fields[2]);
            user.setPassword(fields[3]);

            userList.add(user);
            user = null;
        }

        FileWriter fw = new FileWriter("output.csv");
        BufferedWriter bw = new BufferedWriter(fw);
        UserBO.writeFile(userList, bw);

        sc.close();
    }
}
