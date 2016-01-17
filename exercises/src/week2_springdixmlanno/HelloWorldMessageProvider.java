package week2_springdixmlanno;

public class HelloWorldMessageProvider implements MessageProvider {
   
	@Override
    public String getMessage() {
        return "Hello World!";
    }
}
