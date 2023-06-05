public class NEFTTransfer extends FundTransfer {
    public NEFTTransfer(String accountNumber, Double balance) {
        super(accountNumber, balance);
    }

    public Boolean transfer(Double transfer) {
        Double serviceCharge = transfer * 0.05;
        if (transfer + serviceCharge < getBalance()) {
            setBalance(getBalance() - transfer - serviceCharge);
            return true;
        }
        return false;
    }
}
