package week3.factorymethod;

public class ConcreteCreator implements Creator {
	private static ConcreteCreator instance = null;
	private Product product = null;
	
	private ConcreteCreator() {}
	
	static {
		instance = new ConcreteCreator();
	}
	public static Creator getInstance() {
		return instance;
	}
	@Override
	public Product getProduct(String productSubType) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		product = (Product) Class.forName(productSubType).newInstance();
		return product;
	}

}
