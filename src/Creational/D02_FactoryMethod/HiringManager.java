package Creational.D02_FactoryMethod;

abstract class HiringManager {

	// Factory method
	abstract protected Interviewer makeInterviewer();

	public void takeInterview()
	{
		Interviewer interviewer = makeInterviewer();
		interviewer.askQuestions();
	}

}
