package Creational.D01_SimpleFactory;

public class DoorFactory {

	public static Door makeDoor(Integer width, Integer height)
	{
		return new WoodenDoor(width, height);
	}
}
