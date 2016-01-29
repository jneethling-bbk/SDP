package spring_di_xml_anno;

public class HelloWorldMessageProvider implements MessageProvider {
   
	@Override
    public String getMessage() {
        return "Hello World!";
    }
}
