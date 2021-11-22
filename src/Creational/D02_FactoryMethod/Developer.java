package Creational.D02_FactoryMethod;

public class Developer implements Interviewer {

	@Override
	public void askQuestions() {
		System.out.println("Asking about design patterns!");
	}
}
