package tenB;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

class BoundedBuffer {
    private BlockingQueue<Integer> buffer;

    // Constructor to initialize the buffer with a capacity of 10
    public BoundedBuffer(int capacity) {
        buffer = new ArrayBlockingQueue<>(capacity);
    }

    // Method for the producer to add items into the buffer
    public void putItem(int item) throws InterruptedException {
        buffer.put(item); // Waits if the buffer is full
        System.out.println("Produced: " + item);
    }

    // Method for the consumer to take items from the buffer
    public int takeItem() throws InterruptedException {
        int item = buffer.take(); // Waits if the buffer is empty
        System.out.println("Consumed: " + item);
        return item;
    }
}
