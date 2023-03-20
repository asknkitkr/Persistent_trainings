package Object_Oriented_Programming.Q3;

public class IMPSTransfer extends FundTransfer {

    public IMPSTransfer(String accountNumber, Double balance) {
        super(accountNumber, balance);
    }

    public Boolean transfer(Double transferAmount) {
        if (this.validate(transferAmount)) {
            this.setBalance(this.getBalance() - transferAmount - (transferAmount * 0.02));
            return true;
        }
        return false;
    }

}
