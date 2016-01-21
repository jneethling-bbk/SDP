package week2.decoupledinterface;

public interface MessageRenderer {
    void render();
    
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
