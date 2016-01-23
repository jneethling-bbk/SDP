package week3and4.singleton;

public class SingletonDriver {

	public static void main(String[] args) {
		EagerSingleton a = EagerSingleton.getInstance();
		EagerSingleton b = EagerSingleton.getInstance();
		System.out.println("The references to EagerSingleton point to the same object in memory: " + a.equals(b));
		
		EagerStaticBlockSingleton c = EagerStaticBlockSingleton.getInstance();
		EagerStaticBlockSingleton d = EagerStaticBlockSingleton.getInstance();
		System.out.println("The references to EagerStaticBlockSingleton point to the same object in memory: " + c.equals(d));

	}

}
