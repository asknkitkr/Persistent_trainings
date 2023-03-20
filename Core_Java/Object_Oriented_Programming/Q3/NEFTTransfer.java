package Object_Oriented_Programming.Q3;

public class NEFTTransfer extends FundTransfer {
    public NEFTTransfer(String accountNumber, Double balance) {
        super(accountNumber, balance);
    }

    public Boolean transfer(Double transferAmount) {
        if (this.validate(transferAmount)) {
            this.setBalance(this.getBalance() - transferAmount - (transferAmount * 0.05));
            return true;
        }
        return false;
    }

}
