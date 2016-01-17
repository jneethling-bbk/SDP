package week2_springdi;

public class HelloWorldMessageProvider implements MessageProvider {
    
	@Override
    public String getMessage() {

        return "Hello World!";
    }
}
