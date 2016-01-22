package week3and4.factorymethod;

public class ProductFactoryDriver {

	public static void main(String[] args) {
		Product p = ConcreteCreator.getInstance().getProduct();
		System.out.println(p.getString());

	}

}
