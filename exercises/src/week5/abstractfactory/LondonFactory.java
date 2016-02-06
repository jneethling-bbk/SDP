package week5.abstractfactory;

public class LondonFactory implements AbstractParserFactory {
	
	@Override
	public XMLParser getParserInstance(String parserType) {
		if (parserType.equals("LondonFEEDBACK")) {
			return new LondonFeedbackParser();
		} else {return null;}
	}
}
