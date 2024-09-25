package Training.Creational.D03_AbstractFactory;

public class Carpenter implements DoorFittingExpert {
	@Override
	public void getDescription() {
		System.out.println("I can only fit wooden doors");
	}

}
