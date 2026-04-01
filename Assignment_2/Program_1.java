import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Class to check prime numbers
class PrimeTask implements Runnable {
    int number;

    // Constructor
    PrimeTask(int number) {
        this.number = number;
    }

    // Method to check prime
    boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Run method
    public void run() {
        if (isPrime(number)) {
            System.out.println(number + " is Prime");
        }
    }
}

public class Program_1 {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Check numbers from 1 to 20
        for (int i = 1; i <= 20; i++) {
            executor.execute(new PrimeTask(i));
        }

        executor.shutdown();
    }
}
