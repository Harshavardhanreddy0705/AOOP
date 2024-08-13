package info_debu_error_4b;

class DebugHandler extends LogHandler {
    @Override
    public void handleMessage(String message, LogLevel level) {
        if (level == LogLevel.DEBUG) {
            System.out.println("DEBUG: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleMessage(message, level);
        }
    }
}