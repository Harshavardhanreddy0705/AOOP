package info_debu_error_4b;

class InfoHandler extends LogHandler {
    @Override
    public void handleMessage(String message, LogLevel level) {
        if (level == LogLevel.INFO) {
            System.out.println("INFO: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleMessage(message, level);
        }
    }
}