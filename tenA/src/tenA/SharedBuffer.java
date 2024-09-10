package tenA;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class SharedBuffer {
    private BlockingQueue<String> buffer;

    // Constructor to initialize the buffer
    public SharedBuffer() {
        buffer = new LinkedBlockingQueue<>();
    }

    // Method to put a message into the buffer
    public void putMessage(String message) throws InterruptedException {
        buffer.put(message); // This will wait if the buffer is full
        System.out.println("Produced: " + message);
    }

    // Method to take a message from the buffer
    public String takeMessage() throws InterruptedException {
        String message = buffer.take(); // This will wait if the buffer is empty
        System.out.println("Consumed: " + message);
        return message;
    }
}
