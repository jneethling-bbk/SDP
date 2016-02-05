package week3.observer;

public interface Observer {
    void update(String desc);

    void subscribe();

    void unSubscribe();
}
