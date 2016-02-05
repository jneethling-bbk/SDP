package week5.strategy;

public class LowerTextFormatter implements TextFormatter {

	@Override
	public void format(String text) {
		System.out.println("[" + this.getClass().getName() + "]: " + text.toLowerCase());
	}

}
