package decoupled_interface;

public class HelloWorldMessageProvider implements MessageProvider {
	public String getMessage() {
		return "Hello World!";
	}
}
