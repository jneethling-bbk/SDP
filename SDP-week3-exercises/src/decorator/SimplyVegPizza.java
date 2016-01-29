package decorator;

public class SimplyVegPizza implements Pizza {
	@Override
	public String getDesc() {
	return "Simply Veg Pizza";
	}
	@Override
	public double getPrice() {
	return 2.5;
	}
}
