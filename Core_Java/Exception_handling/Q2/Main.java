import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] seatArray = new int[100];
        int numSeats = 0;

        System.out.println("Enter the number of seats to be booked:");
        numSeats = sc.nextInt();

        for (int i = 0; i < numSeats; i++) {
            System.out.println("Enter the seat number " + (i + 1));
            int seatNumber = sc.nextInt();
            try {
                seatArray[seatNumber - 1] = seatNumber; // subtract 1 to convert to 0-based index
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("java.lang.ArrayIndexOutOfBoundsException: " + e.getMessage());
                System.exit(0);
            }
        }

        System.out.println("The seats booked are:");
        for (int i = 0; i < seatArray.length; i++) {
            if (seatArray[i] != 0) {
                System.out.println(seatArray[i]);
            }
        }

        sc.close();
    }
}