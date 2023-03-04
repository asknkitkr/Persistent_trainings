package Object_Oriented_Programming.Q3;

public class RTGSTransfer extends FundTransfer {

    public RTGSTransfer(String accountNumber, Double balance) {
        super(accountNumber, balance);
    }

    @Override
    public boolean transfer(Double transferAmount) {
        if (validate(transferAmount) && transferAmount > 10000) {
            if (transferAmount <= getBalance()) {
                setBalance(getBalance() - transferAmount);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
