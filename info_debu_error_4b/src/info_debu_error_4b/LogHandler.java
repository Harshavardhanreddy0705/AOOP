package info_debu_error_4b;

abstract class LogHandler {
    protected LogHandler nextHandler;

    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleMessage(String message, LogLevel level);
}