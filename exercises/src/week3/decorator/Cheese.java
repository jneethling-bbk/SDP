package week3.decorator;

public class Cheese extends PizzaDecorator {
	private final Pizza pizza;
	
	public Cheese (Pizza pizza) {
		this.pizza = pizza;
	}
	@Override
	public String getDesc() {
		return pizza.getDesc() + ", cheese";
	}
	@Override
	public double getPrice() {
		return pizza.getPrice() + 1.15;
	}
}
