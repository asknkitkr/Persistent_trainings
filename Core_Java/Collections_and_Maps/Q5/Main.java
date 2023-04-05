package Core_Java.Collections_and_Maps.Q5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of User details to be added");
        int n = Integer.parseInt(sc.nextLine().trim());
        UserBO userList = new UserBO();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the user " + (i + 1) + " detail in csv format");
            String[] details = sc.nextLine().split(",");
            userList.addAllUsers(new User(details[0], details[1], details[2], details[3]));
        }

        System.out.printf("%-20s%-20s%-20s%-20s\n", "Name", "Contact Number", "Username", "Email");
        for (User user : userList) {
            user.display();
        }

        System.out.println("Enter the range to be removed from array list");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.nextLine();
        userList.removeUser(n1, n2);

        System.out.printf("%-20s%-20s%-20s%-20s\n", "Name", "Contact Number", "Username", "Email");
        for (User user : userList) {
            user.display();
        }

        sc.close();
    }
}
