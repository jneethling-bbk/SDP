package week2.decoupled_interface;

public interface MessageRenderer {
    void render();
    
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
