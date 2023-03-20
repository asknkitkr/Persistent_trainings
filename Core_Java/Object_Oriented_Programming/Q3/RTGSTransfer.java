package Object_Oriented_Programming.Q3;

public class RTGSTransfer extends FundTransfer {

    public RTGSTransfer(String accountNumber, Double balance) {
        super(accountNumber, balance);
    }

    public Boolean transfer(Double transferAmount) {
        if (this.validate(transferAmount) && transferAmount > 10000) {
            this.setBalance(this.getBalance() - transferAmount);
            return true;
        }
        return false;
    }

}
