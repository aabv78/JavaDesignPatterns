package Training.Creational.C02_FactoryMethod;

public class MarketingManager extends HiringManager {

	@Override
	protected Interviewer makeInterviewer() {
		return new CommunityExecutive();
	}

}
