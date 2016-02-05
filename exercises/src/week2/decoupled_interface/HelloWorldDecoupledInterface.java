package week2.decoupled_interface;

public class HelloWorldDecoupledInterface {
	public static void main(String[] args) {
		MessageRenderer mr = new StandardOutMessageRenderer();
		MessageProvider mp = new HelloWorldMessageProvider();
		mr.setMessageProvider(mp);
		mr.render();
	}
}
