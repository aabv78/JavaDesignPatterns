package Training.Creational.D03_AbstractFactory;

public class WoodenDoorFactory implements DoorFactory {

	@Override
	public Door makeDoor() {
		return new WoodenDoor();
	}

	@Override
	public DoorFittingExpert makeFittingExpert() {
		return new Carpenter();
	}

}
