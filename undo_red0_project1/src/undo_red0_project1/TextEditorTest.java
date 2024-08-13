package undo_red0_project1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TextEditorTest {
    private TextEditor textEditor;
    private CommandInvoker commandInvoker;

    @BeforeEach
    void setUp() {
        textEditor = new TextEditor();
        commandInvoker = new CommandInvoker();
    }

    @Test
    void testAddTextCommand() {
        Command addHello = new AddTextCommand(textEditor, "Hello ");
        Command addWorld = new AddTextCommand(textEditor, "World!");

        commandInvoker.executeCommand(addHello);
        assertEquals("Hello ", textEditor.getText());

        commandInvoker.executeCommand(addWorld);
        assertEquals("Hello World!", textEditor.getText());

        commandInvoker.undo();
        assertEquals("Hello ", textEditor.getText());

        commandInvoker.redo();
        assertEquals("Hello World!", textEditor.getText());
    }
}
