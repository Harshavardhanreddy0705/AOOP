package tenB;

class Consumer extends Thread {
    private BoundedBuffer buffer;

    // Constructor to associate the consumer with the buffer
    public Consumer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    // Run method to consume items from the buffer
    public void run() {
        for (int i = 1; i <= 20; i++) { // Consuming 20 items
            try {
                buffer.takeItem(); // Take item from the buffer
                Thread.sleep(1000); // Simulate time taken to consume
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
