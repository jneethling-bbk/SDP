package week2.springdixmlanno;

public class HelloWorldMessageProvider implements MessageProvider {
   
	@Override
    public String getMessage() {
        return "Hello World!";
    }
}
