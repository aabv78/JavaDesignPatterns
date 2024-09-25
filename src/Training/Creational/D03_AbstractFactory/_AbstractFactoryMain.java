package Training.Creational.D03_AbstractFactory;

public class _AbstractFactoryMain {
	//	Real world example
	//	Extending our door example from Simple Factory. Based on your needs you might get a wooden door from a wooden door shop,
	//	iron door from an iron shop or a PVC door from the relevant shop. Plus you might need a guy with different kind of specialities
	//	to fit the door, for example a carpenter for wooden door, welder for iron door etc. As you can see there is a dependency
	//	between the doors now, wooden door needs carpenter, iron door needs a welder etc.

	//	In plain words
	//	A factory of factories; a factory that groups the individual but related/dependent factories together without specifying
	//	their concrete classes.

	//	Wikipedia says
	//	The abstract factory pattern provides a way to encapsulate a group of individual factories that have a common theme without
	//	specifying their concrete classes

	//	When to use?
	//	When there are interrelated dependencies with not-that-simple creation logic involved

	public static void main(String[] args) {
		// Door Factory
		WoodenDoorFactory woodenFactory = new WoodenDoorFactory();

		Door door = woodenFactory.makeDoor();
		DoorFittingExpert expert = woodenFactory.makeFittingExpert();


		door.getDescription();  // Output: I am a wooden door
		expert.getDescription(); // Output: I can only fit wooden doors

		// Iron Factory
		IronDoorFactory ironFactory = new IronDoorFactory();

		door = ironFactory.makeDoor();
		expert = ironFactory.makeFittingExpert();

		door.getDescription();  // Output: I am an iron door
		expert.getDescription(); // Output: I can only fit iron doors
	}
}
