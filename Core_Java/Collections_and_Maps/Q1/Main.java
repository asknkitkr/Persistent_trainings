package Collections_and_Maps.Q1;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> halls = new ArrayList<String>();

        System.out.println("Enter the number of halls:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Hall Name " + (i + 1));
            String hall = sc.next();
            halls.add(hall);
        }

        System.out.println("Enter the hall name to be searched:");
        String search = sc.next();

        if (halls.contains(search)) {
            int position = halls.indexOf(search);
            System.out.println(search + " hall is found in the list at position " + position);
        } else {
            System.out.println(search + " hall is not found");
        }

        sc.close();
    }
}
