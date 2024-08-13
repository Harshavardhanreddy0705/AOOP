package undo_red0_project1;

public interface Command {
    void execute();
    void undo();
    void redo();
}
