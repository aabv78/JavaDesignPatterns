package Training.Creational.C02_FactoryMethod;

public class DevelopmentManager extends HiringManager {

	@Override
	protected Interviewer makeInterviewer() {
		return new Developer();
	}
}
