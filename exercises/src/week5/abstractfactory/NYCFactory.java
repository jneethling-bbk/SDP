package week5.abstractfactory;

public class NYCFactory implements AbstractParserFactory {

	@Override
	public XMLParser getParserInstance(String parserType) {
		if (parserType.equals("NYCORDER")) {
			return new NYCOrderParser();
		} else {return null;}
	}

}
