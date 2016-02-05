package week3.decorator;

public class GreenOlives extends PizzaDecorator {
	private final Pizza pizza;
	
	public GreenOlives (Pizza pizza) {
		this.pizza = pizza;
	}
	@Override
	public String getDesc() {
		return pizza.getDesc() + ", green olives";
	}
	@Override
	public double getPrice() {
		return pizza.getPrice() + 0.85;
	}
}
