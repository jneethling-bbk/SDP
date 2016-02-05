package week2.spring_di_xml_auto;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World! --- with Autoscan! How does that work?";
    }	
}
