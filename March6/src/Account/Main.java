package Account;

public class Main {

    public static void main(String[] args) {

        Account acc = new Account(101, "Ali", 500);

        acc.deposit(200);

        try {

            acc.withdraw(1000);

        } catch (InvalidAmountExcept e) {

            System.out.println("Error: " + e.getMessage());

        }

        System.out.println("Balance: " + acc.getBalance());
    }
}
