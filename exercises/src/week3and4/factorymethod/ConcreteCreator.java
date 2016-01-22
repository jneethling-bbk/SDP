package week3and4.factorymethod;

public class ConcreteCreator implements Creator {
	private static ConcreteCreator instance = null;
	private Product product = null;
	
	private ConcreteCreator() {
		try {
			product = (Product) Class.forName("week3and4.factorymethod.ConcreteProduct").newInstance();
		} catch (Exception ex) {
			System.err.println("Failed to create factory method");
			ex.printStackTrace();
		}	
	}
	static {
		instance = new ConcreteCreator();
	}
	public static Creator getInstance() {
		return instance;
	}
	@Override
	public Product getProduct() {
		return product;
	}

}
