package Creational.D01_SimpleFactory;

public class _SimpleFactoryMain {

	//	Real world example
	//	Consider, you are building a house and you need doors. You can either put on your carpenter clothes, bring some wood, glue,
	//	nails and all the tools required to build the door and start building it in your house or you can simply call the factory
	//	and get the built door delivered to you so that you don't need to learn anything about the door making or to deal with the
	//	mess that comes with making it.

	//	In plain words
	//	Simple factory simply generates an instance for client without exposing any instantiation logic to the client

	//	Wikipedia says
	//	In object-oriented programming (OOP), a factory is an object for creating other objects – formally a factory is a function or
	//	method that returns objects of a varying prototype or class from some method call, which is assumed to be "new".

	//	When to Use?
	//	When creating an object is not just a few assignments and involves some logic, it makes sense to put it in a dedicated
	//	factory instead of repeating the same code everywhere.

	public static void main(String[] args) {

		// Make me a door of 100x200
		Door door = DoorFactory.makeDoor(100, 200);
		System.out.println("Width: " + door.getWidth());
		System.out.println("Height: " + door.getHeight());


		// Make me a door of 50x100
		Door door2 = DoorFactory.makeDoor(50, 200);
		System.out.println("Width: " + door2.getWidth());
		System.out.println("Height: " + door2.getHeight());
	}
}
