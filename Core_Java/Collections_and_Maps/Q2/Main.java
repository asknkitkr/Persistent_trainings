package Collections_and_Maps.Q2;

import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> emails = new HashSet<>();
        String email;

        do {
            System.out.println("Enter Email address");
            email = sc.next();
            emails.add(email);
            System.out.println("Do you want to Continue?(yes/no)");
        } while (sc.next().equalsIgnoreCase("yes"));

        System.out.println("Enter the email addresses to be searched separated by comma");
        String emailsToSearch = sc.next();
        String[] emailsList = emailsToSearch.split(",");
        Set<String> emailList = new HashSet<>(Arrays.asList(emailsList));

        if (emails.containsAll(emailList)) {
            System.out.println("Email addresses are present");
        } else {
            System.out.println("Email addresses are not present");
        }
        sc.close();
    }
}
