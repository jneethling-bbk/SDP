package week3.decorator;

public abstract class PizzaDecorator implements Pizza {
	protected Pizza decoratedPizza;
	
	public PizzaDecorator(Pizza decoratedPizza) {
		this.decoratedPizza = decoratedPizza;
	}
	@Override
	public String getDesc() {
		return decoratedPizza.getDesc();
	}
	@Override
	public double getPrice() {
		return decoratedPizza.getPrice();
	}
}
