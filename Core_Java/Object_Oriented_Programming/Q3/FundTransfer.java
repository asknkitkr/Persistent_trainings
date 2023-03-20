package Object_Oriented_Programming.Q3;

public abstract class FundTransfer {
    private String accountNumber;
    private Double balance;

    public FundTransfer(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Boolean validate(Double transferAmount) {
        if (this.getAccountNumber().length() == 10 && transferAmount > 0 && transferAmount < this.getBalance()) {
            return true;
        }
        return false;
    }

    public abstract Boolean transfer(Double transferAmount);
}
