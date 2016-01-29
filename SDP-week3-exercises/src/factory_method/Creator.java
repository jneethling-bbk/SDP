package factory_method;

public interface Creator {
	Product getProduct(String productSubType) throws InstantiationException, IllegalAccessException, ClassNotFoundException;
}
