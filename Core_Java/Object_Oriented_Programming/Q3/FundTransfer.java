public abstract class FundTransfer {
    private String accountNumber;
    private Double balance;

    public FundTransfer(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Boolean validate(Double transfer) {
        if (accountNumber.length() != 10 || transfer < 0 || transfer >= balance) {
            return false;
        }
        return true;
    }

    public abstract Boolean transfer(Double transfer);

    // Getters and Setters
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
}
