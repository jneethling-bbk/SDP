package week1.generics_and_reflection;

public class Driver {

	public static void main(String[] args) {
		// Make a storage structure for BankAccount objects
		Storage<BankAccount> aStorage = new Storage<>();
		// Make a storage structure for strings
		Storage<String> sStorage = new Storage<>();
		
		// Get the class object associated with BankAccount objects
		Class<BankAccount> baCls = BankAccount.class;
		try {
			// Make a BankAccount object
			BankAccount myAccount = (BankAccount) baCls.newInstance();
			// Place the BankAccount object in the storage structure
			aStorage.setValue(myAccount);
			// Call a public method in the BankAccount object
			myAccount.deposit(15);
			// Call a public method in the BankAccount object
			System.out.println(aStorage.getValue().showBalance());
			// Illustrate the effect of type erasure at runtime
			if (aStorage.getClass() == sStorage.getClass()) {
				System.out.println("EQUAL");
			} else {
				System.out.println("NOT EQUAL");
			}
		}
		catch (InstantiationException e) {}
		catch (IllegalAccessException e) {}
	}
}
