package week5.bridge;

abstract class Product {
	
	protected String productDesc;
	
	public String modify() {
		return "Modifying product";
		
	}
	public String getDesc() {
		return productDesc;
	}	
}
