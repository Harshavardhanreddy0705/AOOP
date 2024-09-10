package tenB;

class Producer extends Thread {
    private BoundedBuffer buffer;

    // Constructor to associate the producer with the buffer
    public Producer(BoundedBuffer buffer) {
        this.buffer = buffer;
    }

    // Run method to generate items and put them into the buffer
    public void run() {
        for (int i = 1; i <= 20; i++) { // Producing 20 items
            try {
                buffer.putItem(i); // Put item into the buffer
                Thread.sleep(500); // Simulate time taken to produce
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
