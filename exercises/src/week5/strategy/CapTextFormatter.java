package week5.strategy;

public class CapTextFormatter implements TextFormatter {

	@Override
	public void format(String text) {
		System.out.println("[" + this.getClass().getName() + "]: " + text.toUpperCase());
	}

}
