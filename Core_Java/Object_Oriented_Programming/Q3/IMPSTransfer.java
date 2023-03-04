package Object_Oriented_Programming.Q3;

public class IMPSTransfer extends FundTransfer {

    public IMPSTransfer(String accountNumber, Double balance) {
        super(accountNumber, balance);
    }

    @Override
    public boolean transfer(Double transferAmount) {
        if (validate(transferAmount)) {
            Double serviceCharge = transferAmount * 0.02;
            if (transferAmount + serviceCharge <= getBalance()) {
                setBalance(getBalance() - transferAmount - serviceCharge);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
