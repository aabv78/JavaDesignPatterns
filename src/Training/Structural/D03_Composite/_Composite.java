package Training.Structural.D03_Composite;

public class _Composite {

	//	Real world example
	//	Every organization is composed of employees. Each of the employees has the same features i.e. has a salary, has some responsibilities,
	//	may or may not report to someone, may or may not have some subordinates etc.

	//	In plain words
	//	Composite pattern lets clients treat the individual objects in a uniform manner.

	//	Wikipedia says
	//	In software engineering, the composite pattern is a partitioning design pattern. The composite pattern describes that
	//	a group of objects is to be treated in the same way as a single instance of an object.
	//	The intent of a composite is to "compose" objects into tree structures to represent part-whole hierarchies.
	//	Implementing the composite pattern lets clients treat individual objects and compositions uniformly.

	public static void main(String[] args) {

		Employee john = new Developer("John", 12000F);
		Employee jane = new Designer("Jane", 15000F);

		Organization organization = new Organization();
		organization.addEmployee(jane);
		organization.addEmployee(john);

		System.out.println("Net salaries: " + organization.getNetSalaries());

	}

}
