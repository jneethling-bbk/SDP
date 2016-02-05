package week5.strategy;

public class TextEditor {
	public TextFormatter formatter;
	
	public TextEditor(TextFormatter formatter) {
		this.formatter = formatter;
	}
	
	public void publishText(String text) {
		formatter.format(text);
	}
}
