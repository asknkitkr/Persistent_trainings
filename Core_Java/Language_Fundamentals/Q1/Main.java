package Q1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // fill your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name :");
        String name = sc.next();
        System.out.println("Enter the Creator Name :");
        String cname = sc.next();
        System.out.println("Enter the Purpose :");
        String purpose = sc.next();
        System.out.println("Memory Space :");
        int memory = sc.nextInt();
        System.out.println("Speed :");
        double speed = sc.nextDouble();

        System.out.println("My Details :");
        System.out.println("I am the Robot named " + name + ".");
        System.out.println("I was created by " + cname + ".");
        System.out.println("I am created for the purpose of " + purpose + ".");
        System.out.println("My memory space is around " + memory + "Gb and my speed is " + speed + "Tb.");

        sc.close();
    }

}
