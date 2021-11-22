package Structural.D03_Composite;

import java.util.ArrayList;
import java.util.List;

public class Organization {

	List<Employee> employeeList = new ArrayList<>();

	public void addEmployee(Employee employee){
		employeeList.add(employee);
	}

	public Float getNetSalaries(){

		Float netSalary = 0F;

		for (Employee employee : employeeList){
			netSalary += employee.getSalary();
		}

		return netSalary;
	}

}
