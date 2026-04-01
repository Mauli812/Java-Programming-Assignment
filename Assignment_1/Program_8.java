class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {

        super(message);
    }
}

class Bank {

    int balance = 1000;

    void withdraw(int amount) throws InsufficientBalanceException {

        if (amount > balance) {

            throw new InsufficientBalanceException("Insufficient Balance!");

        } else {

            balance -= amount;

            System.out.println("Withdrawn: " + amount);
        }
    }
}

public class Program_8
{
    public static void main(String args[]) {

        Bank obj = new Bank();

        try {

            obj.withdraw(1500);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());
        }
    }
}