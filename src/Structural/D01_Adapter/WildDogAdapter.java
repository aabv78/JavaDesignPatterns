package Structural.D01_Adapter;

public class WildDogAdapter implements Lion {

	protected WildDog wildDog;

	public WildDogAdapter(WildDog wildDog) {
		this.wildDog = wildDog;
	}

	@Override
	public void roar() {
		this.wildDog.bark();
	}

}
