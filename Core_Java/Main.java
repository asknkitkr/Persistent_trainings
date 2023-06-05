package Q3;

import java.io.BufferedReader;
import java.io.InputStreamReader; 

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your account number:");
		String accountNumber = br.readLine();
		System.out.println("Enter the balance of the account:");
		Double balance = Double.parseDouble(br.readLine());
		
		FundTransfer ft = null;
		
		System.out.println("Enter the type of transfer to be made:\n1.NEFT\n2.IMPS\n3.RTGS");
		int c = Integer.parseInt(br.readLine());
		
		System.out.println("Enter the amount to be transferred:");
		Double amount = Double.parseDouble(br.readLine());
		
		if(c > 0 && c < 4) {
			switch(c) {
			case 1: 
				ft = new NEFTTransfer(accountNumber, balance);
				break;
			case 2:
				ft = new IMPSTransfer(accountNumber, balance);
				break;
			case 3:
				ft = new RTGSTransfer(accountNumber, balance);
				break;
			}
		} 
		
		if(ft.validate(amount)) {
			if(ft.transfer(amount)) {
				System.out.println("Transfer occurred successfully");
				System.out.println("Remaining balance is " + ft.getBalance());
			} else {
				System.out.println("Transfer could not be made");
			}
		} else {
			System.out.println("Account number or transfer amount seems to be wrong");
		}
	}
}
