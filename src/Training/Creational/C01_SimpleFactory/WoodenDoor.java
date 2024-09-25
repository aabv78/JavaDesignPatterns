package Training.Creational.C01_SimpleFactory;

public class WoodenDoor implements Door {

	protected Integer width;
	protected Integer height;

	@Override
	public Integer getWidth() {
		return height;
	}

	@Override
	public Integer getHeight() {
		return width;
	}

	public WoodenDoor(Integer width, Integer height) {
		this.width = width;
		this.height = height;
	}
}
