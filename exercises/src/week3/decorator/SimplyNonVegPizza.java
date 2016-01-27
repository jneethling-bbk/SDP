package week3.decorator;

public class SimplyNonVegPizza implements Pizza {
	@Override
	public String getDesc() {
	return "Simply Non-Veg Pizza";
	}
	@Override
	public double getPrice() {
	return 3.5;
	}

}
