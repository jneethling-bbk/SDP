package week5.abstractfactory;

public class NYCFactory implements AbstractParserFactory {

	@Override
	public XMLParser getParserInstance(String parserType) {
		return new XMLParser();
	}

}
