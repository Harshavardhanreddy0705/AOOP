package package1;

public class DivisiblePrinter {

    // Synchronized method to print numbers based on divisibility
    public synchronized void printTwo(int number) {
        if (number % 2 == 0 && number % 3 != 0 && number % 4 != 0 && number % 5 != 0) {
            System.out.println(number + " is divisible by 2");
        }
    }

    public synchronized void printThree(int number) {
        if (number % 3 == 0 && number % 2 != 0 && number % 4 != 0 && number % 5 != 0) {
            System.out.println(number + " is divisible by 3");
        }
    }

    public synchronized void printFour(int number) {
        if (number % 4 == 0 && number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
            System.out.println(number + " is divisible by 4");
        }
    }

    public synchronized void printFive(int number) {
        if (number % 5 == 0 && number % 2 != 0 && number % 3 != 0 && number % 4 != 0) {
            System.out.println(number + " is divisible by 5");
        }
    }

    public synchronized void printNumber(int number) {
        if (number % 2 != 0 && number % 3 != 0 && number % 4 != 0 && number % 5 != 0) {
            System.out.println(number + " is not divisible by 2, 3, 4, or 5");
        }
    }
}
