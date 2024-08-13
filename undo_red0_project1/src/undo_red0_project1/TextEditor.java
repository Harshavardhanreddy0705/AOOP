package undo_red0_project1;

public class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void addText(String newText) {
        text.append(newText);
    }

    public void removeText(int length) {
        text.setLength(text.length() - length);
    }

    public String getText() {
        return text.toString();
    }
}
