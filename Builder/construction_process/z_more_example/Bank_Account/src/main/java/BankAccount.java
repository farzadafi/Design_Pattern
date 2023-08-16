package Builder.construction_process.z_more_example.Bank_Account.src.main.java;

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


    public static class Builder {

        private long accountNumber;
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;

        public Builder(long accountNumber) {
            this.accountNumber = accountNumber;
        }

        public Builder withOwner(String owner){
            this.owner = owner;

            return this;
        }

        public Builder atBranch(String branch){
            this.branch = branch;

            return this;
        }

        public Builder openingBalance(double balance){
            this.balance = balance;

            return this;
        }

        public Builder atRate(double interestRate){
            this.interestRate = interestRate;

            return this;
        }

        public BankAccount build(){
            BankAccount account = new BankAccount();
            account.accountNumber = this.accountNumber;
            account.owner = this.owner;
            account.branch = this.branch;
            account.balance = this.balance;
            account.interestRate = this.interestRate;

            return account;
        }
    }

    private BankAccount() {
    }
}
