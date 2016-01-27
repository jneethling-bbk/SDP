package week3.decorator;

public class PizzaDriver {

	public static void main(String[] args) {
		Pizza veggie = new SimplyVegPizza();
		Pizza meaty = new SimplyNonVegPizza();
		
		System.out.println(veggie.getDesc() + " costs " + veggie.getPrice());
		System.out.println(meaty.getDesc() + " costs " + meaty.getPrice());

	}

}
