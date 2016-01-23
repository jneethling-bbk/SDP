package week3and4.singleton;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();
    
    private EagerSingleton(){}
 
    public static EagerSingleton getInstance(){
        return instance;
    }
}
