package spring_di_xml_constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpringWithDIXMLFileConstructorArgument {
    
	public static void main(String[] args) throws Exception {

        // get the bean factory
        BeanFactory factory = getBeanFactory();
        MessageRenderer mr = (MessageRenderer) factory.getBean("renderer");
        mr.render();
    }

    private static BeanFactory getBeanFactory() throws Exception {
        // create a bean factory from anno.xml
        BeanFactory factory = new ClassPathXmlApplicationContext("file:src/spring_di_xml_constructor/dixmlcons.xml");
        return factory;
    }
}
