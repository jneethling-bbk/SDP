package week5.abstractfactory;

public class NYCOrderParser extends XMLParser {

		public NYCOrderParser() {
			setClient("NYC");
			setParserType("Order");
		}
}
