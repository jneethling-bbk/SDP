package week2.springdixml;

public class HelloWorldMessageProvider implements MessageProvider {
    
	@Override
    public String getMessage() {
        return "Hello World!";
    }
}
