package week5.bridge;

abstract class Car {
	
	protected Product product;
	protected String carDesc;
	
	public void produceProduct() {
		System.out.println("Producing " + product.getDesc());
		System.out.println(product.modify() + " " + product.getDesc() + " according to " + carDesc);
	}
	public void assemble() {
		System.out.println("Assembling " + product.getDesc() + " for " + carDesc);
	}
	public void printDetails() {
		System.out.println("Car: " + carDesc + ", Product: " + product.getDesc());
		System.out.println();
	}
	
}
