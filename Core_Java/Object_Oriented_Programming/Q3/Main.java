import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your account number:");
        String accountNumber = reader.readLine();

        System.out.println("Enter the balance of the account:");
        Double balance = Double.parseDouble(reader.readLine());

        System.out.println("Enter the type of transfer to be made:");
        System.out.println("1. NEFT");
        System.out.println("2. IMPS");
        System.out.println("3. RTGS");
        int transferType = Integer.parseInt(reader.readLine());

        System.out.println("Enter the amount to be transferred:");
        Double transferAmount = Double.parseDouble(reader.readLine());

        FundTransfer transfer = null;
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
            default:
                System.out.println("Invalid transfer type.");
                System.exit(0);
        }

        if (!transfer.validate(transferAmount)) {
            System.out.println("Account number or transfer amount seems to be wrong");
        } else {
            if (transfer.transfer(transferAmount)) {
                System.out.println("Transfer occurred successfully");
                System.out.println("Remaining balance is " + transfer.getBalance());
            } else {
                System.out.println("Transfer could not be made");
            }
        }
    }
}
