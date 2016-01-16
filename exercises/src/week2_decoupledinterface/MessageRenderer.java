package week2_decoupledinterface;

public interface MessageRenderer {
    void render();
    
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
