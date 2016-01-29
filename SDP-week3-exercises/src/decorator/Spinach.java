package decorator;

public class Spinach extends PizzaDecorator {
	private final Pizza pizza;
	
	public Spinach (Pizza pizza) {
		this.pizza = pizza;
	}
	@Override
	public String getDesc() {
		return pizza.getDesc() + ", spinach";
	}
	@Override
	public double getPrice() {
		return pizza.getPrice() + 0.45;
	}
}
