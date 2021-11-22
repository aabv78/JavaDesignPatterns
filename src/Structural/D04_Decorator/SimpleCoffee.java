package Structural.D04_Decorator;

public class SimpleCoffee implements Coffee {

	@Override
	public Integer getCost() {
		return 5;
	}

	@Override
	public String getDescription() {
		return "Simple coffee";
	}
}
