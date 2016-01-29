package decorator;

public class Ham extends PizzaDecorator {
	private final Pizza pizza;
	
	public Ham (Pizza pizza) {
		this.pizza = pizza;
	}
	@Override
	public String getDesc() {
		return pizza.getDesc() + ", ham";
	}
	@Override
	public double getPrice() {
		return pizza.getPrice() + 1.15;
	}
}
