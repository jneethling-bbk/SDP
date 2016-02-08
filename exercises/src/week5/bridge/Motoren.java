package week5.bridge;

public class Motoren implements Car {

	private Product product;
	private String desc;
	
	public Motoren(Product product, String desc) {
		this.product = product;
		this.desc = desc;
	}
	
	@Override
	public void produceProduct() {
		// TODO Auto-generated method stub	
	}
	@Override
	public void assemble() {
		// TODO Auto-generated method stub
	}
	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
	}
}
