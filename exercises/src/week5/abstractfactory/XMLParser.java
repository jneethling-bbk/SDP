package week5.abstractfactory;

public abstract class XMLParser {

	private String client;
	private String parserType;
	
	public String parse() {
		System.out.println(client + " Parsing " + parserType + " XML...");
		return client + " " + parserType + " XML Message";
	}
	
	public void setClient(String client)  {
		this.client = client;
	}
	public void setParserType(String parserType)  {
		this.parserType = parserType;
	}
}
