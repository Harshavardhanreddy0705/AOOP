package info_debu_error_4b;

class ErrorHandler extends LogHandler {
    @Override
    public void handleMessage(String message, LogLevel level) {
        if (level == LogLevel.ERROR) {
            System.out.println("ERROR: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleMessage(message, level);
        }}}
