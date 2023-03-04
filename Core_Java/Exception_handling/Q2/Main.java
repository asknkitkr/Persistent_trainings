import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] seatArray = new int[100]; // creating an array of size 100
        System.out.println("Enter the number of seats to be booked:");
        int n = sc.nextInt(); // getting the number of seats to be booked
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the seat number " + (i + 1));
            try {
                int seat = sc.nextInt();
                if (seat >= 1 && seat <= 100) { // checking if the seat number is within the range of available seats
                    seatArray[seat - 1] = seat; // booking the seat
                } else {
                    System.out.println("Invalid seat number!");
                    i--; // decreasing the loop counter to take input for the same seat number again
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e); // handling ArrayIndexOutOfBoundsException
                i--; // decreasing the loop counter to take input for the same seat number again
            }
        }
        System.out.println("The seats booked are:");
        for (int seat : seatArray) {
            if (seat != 0) { // displaying the booked seats
                System.out.println(seat);
            }
        }
        sc.close();
    }
}
