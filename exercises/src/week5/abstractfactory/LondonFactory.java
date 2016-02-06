package week5.abstractfactory;

public class LondonFactory implements AbstractParserFactory {
	@Override
	public XMLParser getParserInstance(String parserType) {
		return new XMLParser();
	}
}
