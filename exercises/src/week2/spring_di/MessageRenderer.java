package week2.spring_di;

public interface MessageRenderer {
    
	void render();
    
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
