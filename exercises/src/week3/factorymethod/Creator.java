package week3.factorymethod;

public interface Creator {
	Product getProduct(String productSubType) throws InstantiationException, IllegalAccessException, ClassNotFoundException;
}
