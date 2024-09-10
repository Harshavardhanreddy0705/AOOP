package tenB;

public class BoundedBufferExample {
    public static void main(String[] args) {
        // Create a bounded buffer with a maximum capacity of 10 items
        BoundedBuffer buffer = new BoundedBuffer(10);

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

        System.out.println("Bounded buffer example finished.");
    }
}
