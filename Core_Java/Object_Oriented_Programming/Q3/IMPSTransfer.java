package Q3;

public class IMPSTransfer extends FundTransfer {
	public IMPSTransfer(String accountNumber, Double balance) {
		super(accountNumber, balance);
	}

	public Boolean transfer(Double transfer) {
		Double serviceCharge = transfer * 0.02;
		if (transfer + serviceCharge < getBalance()) {
			setBalance(getBalance() - transfer - serviceCharge);
			return true;
		}
		return false;
	}
}
