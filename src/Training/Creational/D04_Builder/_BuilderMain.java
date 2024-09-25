package Training.Creational.D04_Builder;

public class _BuilderMain {
//	Real world example
//	Imagine you are at Hardee's and you order a specific deal, lets say, "Big Hardee" and they hand it over to you without any questions;
//	this is the example of simple factory. But there are cases when the creation logic might involve more steps.
//	For example you want a customized Subway deal, you have several options in how your burger is made e.g what bread do you want?
//	what types of sauces would you like? What cheese would you want? etc. In such cases builder pattern comes to the rescue.

//	In plain words
//	Allows you to create different flavors of an object while avoiding constructor pollution. Useful when there could be several
//	flavors of an object. Or when there are a lot of steps involved in creation of an object.

//	Wikipedia says
//	The builder pattern is an object creation software design pattern with the intentions of finding a solution to the telescoping
//	constructor anti-pattern.

//	When to use?
//	When there could be several flavors of an object and to avoid the constructor telescoping.
//	The key difference from the factory pattern is that; factory pattern is to be used when the creation is a one step process
//	while builder pattern is to be used when the creation is a multi step process.

	public static void main(String[] args) {
		Burger burger = new Burger.Builder(14)
				.addCheese()
				.addLettuce()
				.addPepperoni()
				.addTomato()
				.build();
		System.out.println(burger.toString());

		Burger noLettuceBurger = new Burger.Builder(14)
				.addCheese()
				.addPepperoni()
				.addTomato()
				.build();
		System.out.println(noLettuceBurger.toString());
	}
}
