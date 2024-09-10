package package1;

public class Main {

    public static void main(String[] args) {
        DivisiblePrinter printer = new DivisiblePrinter();

        // Create and run threads for each number from 1 to 15
        for (int i = 1; i <= 15; i++) {
            final int number = i;

            // Thread for divisibility by 2
            Thread t2 = new Thread(() -> {
                printer.printTwo(number);
            });

            // Thread for divisibility by 3
            Thread t3 = new Thread(() -> {
                printer.printThree(number);
            });

            // Thread for divisibility by 4
            Thread t4 = new Thread(() -> {
                printer.printFour(number);
            });

            // Thread for divisibility by 5
            Thread t5 = new Thread(() -> {
                printer.printFive(number);
            });

            // Thread for numbers not divisible by 2, 3, 4, or 5
            Thread tNumber = new Thread(() -> {
                printer.printNumber(number);
            });

            // Start all threads
            t2.start();
            t3.start();
            t4.start();
            t5.start();
            tNumber.start();

            // Join the threads to ensure one finishes before moving to the next number
            try {
                t2.join();
                t3.join();
                t4.join();
                t5.join();
                tNumber.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
