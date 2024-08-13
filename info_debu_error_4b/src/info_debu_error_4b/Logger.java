package info_debu_error_4b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Logger {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void processCommands() {
        Iterator<Command> iterator = commands.iterator();
        while (iterator.hasNext()) {
            Command command = iterator.next();
            command.execute("Processing message", LogLevel.INFO);  // Using INFO level for demonstration
        }
    }
}
