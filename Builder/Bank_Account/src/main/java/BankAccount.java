public class BankAccount {

    private long accountNumber;
    private String owner;
    private double balance;
    private String branch;
    private double interestRate;

    public BankAccount(long accountNumber, String owner, double balance, String branch, double interestRate) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
        this.branch = branch;
        this.interestRate = interestRate;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
