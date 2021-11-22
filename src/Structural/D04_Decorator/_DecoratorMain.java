package Structural.D04_Decorator;

public class _DecoratorMain {

	public static void main(String[] args) {

		Coffee someCoffee = new SimpleCoffee();
		System.out.println(someCoffee.getDescription());
		System.out.println(someCoffee.getCost());

		Coffee milkCoffee = new MilkCoffee(someCoffee);
		System.out.println(milkCoffee.getDescription());
		System.out.println(milkCoffee.getCost());

		Coffee whipCoffee = new WhipCoffee(someCoffee);
		System.out.println(whipCoffee.getDescription());
		System.out.println(whipCoffee.getCost());

		Coffee vanillaCoffee = new VanillaCoffee(someCoffee);
		System.out.println(vanillaCoffee.getDescription());
		System.out.println(vanillaCoffee.getCost());

	}
}
