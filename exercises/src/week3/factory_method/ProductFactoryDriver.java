package week3.factory_method;

public class ProductFactoryDriver {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Product p = ConcreteCreator.getInstance().getProduct("week3.factory_method.ConcreteProduct");
		System.out.println(p.getString());
		Product a = ConcreteCreator.getInstance().getProduct("week3.factory_method.AnotherConcreteProduct");
		System.out.println(a.getString());
	}

}
