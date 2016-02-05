package week2.spring_di_xml;

public class HelloWorldMessageProvider implements MessageProvider {
    
	@Override
    public String getMessage() {
        return "Hello World!";
    }
}
