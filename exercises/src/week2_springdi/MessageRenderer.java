package week2_springdi;

public interface MessageRenderer {
    
	void render();
    
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
