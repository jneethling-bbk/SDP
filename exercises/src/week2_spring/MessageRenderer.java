package week2_spring;

public interface MessageRenderer {
    void render();
    
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
