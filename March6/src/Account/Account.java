package Account;

public class Account {

    private int accountNum;
    private String accountHolderName;
    private double balance;

    public Account(int accountNum, String accountHolderName, double balance) {
        this.accountNum = accountNum;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getaccountNum() {
        return accountNum;
    }

    public void setaccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {

        if (amount > balance) {
            throw new InvalidAmountExcept("Cannot withdraw more than balance");
        }

        balance -= amount;
    }
}
