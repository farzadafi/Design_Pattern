package Builder.construction_process.z_more_example.Bank_Account.src.main.java;

public class Client {
    public static void main(String[] args) {
        BankAccount account = new BankAccount.Builder(1234L)
                .withOwner("Farzad")
                .atBranch("Afshar")
                .openingBalance(100)
                .atRate(2.5)
                .build();
        BankAccount account1 = new BankAccount(1, "farzad", 12, "zarand", 12);

        System.out.println(account);
        System.out.println(account1);
    }
}
