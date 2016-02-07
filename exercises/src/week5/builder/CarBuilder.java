package week5.builder;

public interface CarBuilder {
	void buildBody();
	void buildPower();
	void buildEngine();
	void buildBreaks();
	void buildSeats();
	void buildWindows();
	void buildFuelType();
	Car getCar();
}
