package week5.abstractfactory;

public class LondonFeedbackParser extends XMLParser {
	
	public LondonFeedbackParser() {
		setClient("London");
		setParserType("Feedback");
	}
}
