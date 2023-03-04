package Streams_and_Files.Q2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of users:");
        int n = sc.nextInt();

        ArrayList<User> userList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the details of user " + i + ":");
            sc.nextLine();
            String line = sc.nextLine();

            String[] fields = line.split(",");
            User user = new User(fields[0], fields[1], fields[2], fields[3]);
            userList.add(user);
        }

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.csv"));
            UserBO.writeFile(userList, bw);
            System.out.println("Data has been written to output.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
