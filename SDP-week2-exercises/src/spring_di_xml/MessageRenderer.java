package spring_di_xml;

public interface MessageRenderer {

    void render();

    MessageProvider getMessageProvider();

    void setMessageProvider(MessageProvider provider);
}
