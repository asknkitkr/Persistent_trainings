package Collections_and_Maps.Q4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of users:");
        int n = Integer.parseInt(br.readLine().trim());
        Set<User> users = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details of user" + i);
            System.out.println("Username:");
            String username = br.readLine().trim();
            System.out.println("Bank name:");
            String bankname = br.readLine().trim();
            users.add(new User(username, bankname));
        }

        List<User> userList = new ArrayList<>();
        System.out.println("Enter username(Expire in one month) seperated by comma");
        String[] input = br.readLine().split(",");
        for (String username : input) {
            userList.add(new User(username.trim(), null));
        }

        users.retainAll(new HashSet<>(userList));

        System.out.println("Users going to expire within a month");
        int count = 1;
        for (User user : userList) {
            if (!users.contains(user)) {
                System.out.println("User " + count);
                System.out.println("User Name = " + user.getUsername());
                System.out.println("Bank Name = " + user.getBankname());
                count++;
            }
        }
    }
}