package week2_springdixml;

public class HelloWorldMessageProvider implements MessageProvider {
    
	@Override
    public String getMessage() {
        return "Hello World!";
    }
}
