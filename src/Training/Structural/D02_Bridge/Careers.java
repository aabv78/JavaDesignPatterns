package Training.Structural.D02_Bridge;

public class Careers implements WebPage {

	Theme theme;

	public Careers(Theme theme) {
		this.theme = theme;
	}

	@Override
	public String getContent() {
		return "Careers page in " + theme.getColor();
	}

}
