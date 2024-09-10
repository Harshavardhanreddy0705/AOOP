package tenA;

public class MessagingApp {
    public static void main(String[] args) {
        // Create a shared buffer
        SharedBuffer buffer = new SharedBuffer();

        // Create producer and consumer threads
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        // Start producer and consumer threads
        producer.start();
        consumer.start();

        // Wait for both threads to finish
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Messaging application finished.");
    }
}
