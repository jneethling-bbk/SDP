package week2.decoupledfactory;

public interface MessageRenderer {
    void render();
    MessageProvider getMessageProvider();
    void setMessageProvider(MessageProvider provider);
}
