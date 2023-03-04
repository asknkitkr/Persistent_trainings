package Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Account Type\n1.Savings Account\n2.Current Account");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Account details in comma separated(Account Name,Account Number,Bank Name," +
                (choice == 1 ? "Organisation Name)" : "TIN Number)"));
        String[] details = sc.nextLine().split(",");
        if (choice == 1) {
            SavingsAccount savingsAccount = new SavingsAccount(details[0], details[1], details[2], details[3]);
            ((Account) savingsAccount).display();
        } else {
            CurrentAccount currentAccount = new CurrentAccount(details[0], details[1], details[2], details[3]);
            ((Account) currentAccount).display();
        }
        sc.close();
    }
}
