package tenA;


class Consumer extends Thread {
    private SharedBuffer buffer;

    // Constructor to associate the consumer with a shared buffer
    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    // Run method to consume messages
    public void run() {
        while (true) {
            try {
                String message = buffer.takeMessage(); // Take message from the buffer
                if (message.equals("END")) {
                    System.out.println("No more messages to consume. Consumer is stopping.");
                    break;
                }
                Thread.sleep(2000); // Simulate time delay in message processing
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
