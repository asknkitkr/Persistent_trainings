package Object_Oriented_Programming.Q3;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your account number:");
        String accountNumber = sc.next();

        System.out.println("Enter the balance of the account:");
        Double balance = sc.nextDouble();

        FundTransfer transfer = null;

        System.out.println("Enter the type of transfer to be made:");
        System.out.println("1.NEFT\n2.IMPS\n3.RTGS");

        int transferType = sc.nextInt();

        System.out.println("Enter the amount to be transferred:");
        Double transferAmount = sc.nextDouble();

        switch (transferType) {
            case 1:
                transfer = new NEFTTransfer(accountNumber, balance);
                break;
            case 2:
                transfer = new IMPSTransfer(accountNumber, balance);
                break;
            case 3:
                transfer = new RTGSTransfer(accountNumber, balance);
                break;
        }

        if (transfer.validate(transferAmount)) {
            if (transfer.transfer(transferAmount)) {
                System.out.println("Transfer occurred successfully");
                System.out.println("Remaining balance is " + transfer.getBalance());
            } else {
                System.out.println("Transfer could not be made");
            }
        } else {
            System.out.println("Account number or transfer amount seems to be wrong");
        }
        sc.close();
    }
}
