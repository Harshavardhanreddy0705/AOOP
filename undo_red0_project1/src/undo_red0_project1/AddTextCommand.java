package undo_red0_project1;

public class AddTextCommand implements Command {
    private TextEditor textEditor;
    private String textToAdd;

    public AddTextCommand(TextEditor textEditor, String textToAdd) {
        this.textEditor = textEditor;
        this.textToAdd = textToAdd;
    }

    @Override
    public void execute() {
        textEditor.addText(textToAdd);
    }

    @Override
    public void undo() {
        textEditor.removeText(textToAdd.length());
    }

    @Override
    public void redo() {
        execute();
    }
}
