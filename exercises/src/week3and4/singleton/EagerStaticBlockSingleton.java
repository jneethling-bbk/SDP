package week3and4.singleton;

public class EagerStaticBlockSingleton {
    private static EagerStaticBlockSingleton instance;
    
    private EagerStaticBlockSingleton(){}
     
    static{
        try{
            instance = new EagerStaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
     
    public static EagerStaticBlockSingleton getInstance(){
        return instance;
    }
}
