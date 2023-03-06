package Object_Oriented_Programming.Q3;

public abstract class FundTransfer {
    public String accountNumber;
    public Double balance;

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

    public abstract Boolean transfer(Double transferAmount);

    public abstract Boolean validate(Double transferAmount);
}
