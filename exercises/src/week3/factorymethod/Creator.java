package week3and4.factorymethod;

public interface Creator {
	Product getProduct(String productSubType) throws InstantiationException, IllegalAccessException, ClassNotFoundException;
}
