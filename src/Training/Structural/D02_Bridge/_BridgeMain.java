package Training.Structural.D02_Bridge;

public class _BridgeMain {

	public static void main(String[] args) {

		DarkTheme darkTheme = new DarkTheme();
		AquaTheme aquaTheme = new AquaTheme();

		About about = new About(darkTheme);
		Careers careers = new Careers(aquaTheme);

		System.out.println(about.getContent());
		System.out.println(careers.getContent());


	}

}
