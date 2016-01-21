package week2.springdi;

public interface MessageRenderer {
    
	void render();
    
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
