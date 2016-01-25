package week3and4.singleton;

public class SingletonDriver {

	public static void main(String[] args) {
		EagerSingleton a = EagerSingleton.getInstance();
		EagerSingleton b = EagerSingleton.getInstance();
		System.out.println("The references to EagerSingleton point to the same object in memory: " + a.equals(b));
		
		EagerStaticBlockSingleton c = EagerStaticBlockSingleton.getInstance();
		EagerStaticBlockSingleton d = EagerStaticBlockSingleton.getInstance();
		System.out.println("The references to EagerStaticBlockSingleton point to the same object in memory: " + c.equals(d));

		LazySingleton e = LazySingleton.getInstance();
		LazySingleton f = LazySingleton.getInstance();
		System.out.println("The references to LazySingleton point to the same object in memory: " + e.equals(f));

		ThreadSafeSingleton g = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton h = ThreadSafeSingleton.getInstance();
		System.out.println("The references to ThreadSafeSingleton point to the same object in memory: " + g.equals(h));

		DoubleCheckedSingleton i = DoubleCheckedSingleton.getInstance();
		DoubleCheckedSingleton j = DoubleCheckedSingleton.getInstance();
		System.out.println("The references to DoubleCheckedSingleton point to the same object in memory: " + i.equals(j));

	}

}
