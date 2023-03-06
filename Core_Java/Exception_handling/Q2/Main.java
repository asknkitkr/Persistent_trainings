import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] seats = new int[100];

        System.out.println("Enter the number of seats to be booked:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the seat number " + (i + 1));
            try {
                int s = sc.nextInt();
                seats[s - 1] = s;
            } catch (java.lang.ArrayIndexOutOfBoundsException e) {
                System.out.println("java.lang.ArrayIndexOutOfBoundsException: 100");
                System.exit(0);
            }
        }

        System.out.println("The seats booked are:");
        for (int s : seats) {
            if (s != 0) {
                System.out.println(s);
            }
        }

        sc.close();
    }
}
