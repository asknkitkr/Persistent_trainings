public class RTGSTransfer extends FundTransfer {
	public RTGSTransfer(String accountNumber, Double balance) {
		super(accountNumber, balance);
	}

	public Boolean transfer(Double transfer) {
		if (transfer > 10000 && transfer < getBalance()) {
			setBalance(getBalance() - transfer);
			return true;
		}
		return false;
	}
}
