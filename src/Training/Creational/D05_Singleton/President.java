package Training.Creational.D05_Singleton;

public class President {

	private static President instance;


	public static President getInstance() {
		if (instance == null) {
			instance = new President();
		}
		return instance;
	}


	private President() {
	}
}
