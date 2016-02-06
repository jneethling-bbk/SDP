package week5.abstractfactory;

public interface AbstractParserFactory {
	public XMLParser getParserInstance(String parserType);

}
