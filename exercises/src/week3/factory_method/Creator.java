package week3.factory_method;

public interface Creator {
	Product getProduct(String productSubType) throws InstantiationException, IllegalAccessException, ClassNotFoundException;
}
