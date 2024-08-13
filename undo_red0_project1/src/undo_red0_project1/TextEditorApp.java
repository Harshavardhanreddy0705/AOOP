package undo_red0_project1;

public class TextEditorApp {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        CommandInvoker commandInvoker = new CommandInvoker();

        Command addHello = new AddTextCommand(textEditor, "Hello ");
        Command addWorld = new AddTextCommand(textEditor, "World!");

        commandInvoker.executeCommand(addHello);
        System.out.println(textEditor.getText()); // Should print "Hello "

        commandInvoker.executeCommand(addWorld);
        System.out.println(textEditor.getText()); // Should print "Hello World!"

        commandInvoker.undo();
        System.out.println(textEditor.getText()); // Should print "Hello "

        commandInvoker.redo();
        System.out.println(textEditor.getText()); // Should print "Hello World!"
    }
}
