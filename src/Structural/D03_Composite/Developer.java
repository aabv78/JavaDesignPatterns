package Structural.D03_Composite;

public class Developer implements Employee {

	protected Float salary;
	protected String name;

	public Developer( String name, Float salary) {
		this.salary = salary;
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public Float getSalary() {
		return this.salary;
	}

	@Override
	public void setSalary(Float salary) {
		this.salary = salary;
	}

}
