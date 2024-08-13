package info_debu_error_4b;

class LogCommand implements Command {
    private LogHandler handler;

    public LogCommand(LogHandler handler) {
        this.handler = handler;
    }

    @Override
    public void execute(String message, LogLevel level) {
        handler.handleMessage(message, level);
    }

	@Override
	public void execute1(String message, LogLevel level) {
		// TODO Auto-generated method stub
		
	}
}