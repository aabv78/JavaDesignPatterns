package Creational.D03_AbstractFactory;

public class Welder implements DoorFittingExpert {

	@Override
	public void getDescription() {
		System.out.println("I can only fit iron doors");
	}
}
