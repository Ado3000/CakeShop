/**
 * 
 * Class: SeniorEmployees
 * Author: Adnan Alihodzic
 * Description: The class which creates an employees that is a senior and hence costs less
 *
 */
public class SeniorEmployee extends Employee {

	public SeniorEmployee(){
	}

	public double calculateSalary(){
		double employeeCost = 0;
		double employeeCostBrutto = 0.0;
		double totalEmployeeCost = 0.0;
		employeeCostBrutto = getWorkedHours() * getHourlyRate();
		employeeCost = employeeCostBrutto * 0.1636 + employeeCostBrutto * 0.0511 + employeeCostBrutto;
		totalEmployeeCost = super.getTotalEmployeeCost();
		totalEmployeeCost = totalEmployeeCost + employeeCost;

		return totalEmployeeCost;
	}
}
