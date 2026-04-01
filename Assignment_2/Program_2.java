
class SharedBuffer {
    int data;
    boolean valueSet = false;

    // Produce method
    synchronized void produce(int value) {
        while (valueSet) {
            try {
                wait();
            } catch (Exception e) {
            }
        }

        data = value;
        System.out.println("Produced: " + data);

        valueSet = true;
        notify();
    }

    // Consume method
    synchronized void consume() {
        while (!valueSet) {
            try {
                wait();
            } catch (Exception e) {
            }
        }

        System.out.println("Consumed: " + data);

        valueSet = false;
        notify();
    }
}

// Producer class
class Producer extends Thread {
    SharedBuffer buffer;

    Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
        }
    }
}

// Consumer class
class Consumer extends Thread {
    SharedBuffer buffer;

    Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
        }
    }
}

public class Program_2 {
    public static void main(String[] args) {

        SharedBuffer buffer = new SharedBuffer();

        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}