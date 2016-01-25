package week3and4.factorymethod;

public class ProductFactoryDriver {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Product p = ConcreteCreator.getInstance().getProduct("week3and4.factorymethod.ConcreteProduct");
		System.out.println(p.getString());
		Product a = ConcreteCreator.getInstance().getProduct("week3and4.factorymethod.AnotherConcreteProduct");
		System.out.println(a.getString());
	}

}
