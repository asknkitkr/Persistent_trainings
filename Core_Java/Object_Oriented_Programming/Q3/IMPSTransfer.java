package Object_Oriented_Programming.Q3;

public class IMPSTransfer extends FundTransfer {

    public IMPSTransfer(String accountNumber, Double balance) {
        super(accountNumber, balance);
    }

    @Override
    public Boolean validate(Double transferAmount) {
        if (this.getAccountNumber().length() == 10 && transferAmount > 0 && transferAmount < this.getBalance()) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean transfer(Double transferAmount) {
        if (this.validate(transferAmount)) {
            this.setBalance(this.getBalance() - transferAmount - transferAmount * 0.02);
            return true;
        }
        return false;
    }

}
