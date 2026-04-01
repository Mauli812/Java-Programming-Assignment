class BankAccount {

    int balance = 1000;

    void deposit(int amount) {

        balance += amount;

        System.out.println("Deposited: " + amount);
    }

    void withdraw(int amount) {

        if (amount <= balance) {

            balance -= amount;
            System.out.println("Withdrawn: " + amount);

        } else {

            System.out.println("Insufficient Balance");
        }
    }

    void checkBalance() {

        System.out.println("Balance = " + balance);
    }
}

public class Program_4
{
    public static void main(String args[]) {

        BankAccount obj = new BankAccount();

        obj.deposit(500);
        obj.withdraw(300);
        obj.checkBalance();
    }
}