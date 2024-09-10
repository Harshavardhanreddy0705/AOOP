package tenA;

class Producer extends Thread {
    private SharedBuffer buffer;

    // Constructor to associate the producer with a shared buffer
    public Producer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    // Run method to generate messages
    public void run() {
        int messageCount = 5;
        for (int i = 1; i <= messageCount; i++) {
            try {
                String message = "Message " + i;
                buffer.putMessage(message); // Put message into the buffer
                Thread.sleep(1000); // Simulate time delay in message generation
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // End of messages
        try {
            buffer.putMessage("END");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
