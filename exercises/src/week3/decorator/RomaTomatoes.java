package week3.decorator;

public class RomaTomatoes extends PizzaDecorator {
	private final Pizza pizza;
	
	public RomaTomatoes (Pizza pizza) {
		this.pizza = pizza;
	}
	@Override
	public String getDesc() {
		return pizza.getDesc() + ", Roma Tomatoes";
	}
	@Override
	public double getPrice() {
		return pizza.getPrice() + 0.75;
	}
}
