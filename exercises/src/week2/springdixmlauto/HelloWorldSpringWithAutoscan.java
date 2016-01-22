package week2.springdixmlauto;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringWithAutoscan {
    
	public static void main(String[] args) throws Exception {

        // get the bean factory
        BeanFactory factory = getBeanFactory();
        MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
        mr.render();
    }

    private static BeanFactory getBeanFactory() throws Exception {
        // create a bean factory from autoscan.xml
        BeanFactory factory = new ClassPathXmlApplicationContext("file:src/week2/springdixmlauto/autoscan.xml");
        return factory;
    }
}