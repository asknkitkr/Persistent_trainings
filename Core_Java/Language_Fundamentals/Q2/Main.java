package Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avg = (a + b + c) / 3;

        char grade = 'F';
        if (avg >= 90) {
            grade = 'A';
        } else if (avg >= 80 && avg < 90) {
            grade = 'B';
        } else if (avg >= 70 && avg < 80) {
            grade = 'C';
        } else if (avg >= 60 && avg < 70) {
            grade = 'D';
        } else if (avg >= 50 && avg < 60) {
            grade = 'E';
        } else if (avg < 50) {
            grade = 'F';
        }

        System.out.println("The grade is " + grade);

        sc.close();
    }
}
