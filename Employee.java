/**
 * 
 * Class: Employee
 * Author: Adnan Alihodzic
 * Description: A class for setting employees for the cakeshop
 * @author Ado
 *
 */

import java.util.ArrayList;

public class Employee {
	
	private String name;
	private int age;
	private double workedHours;
	private static final double HOURLY_RATE = 100;
	private static double totalEmployeeCost;
	private static ArrayList <Employee> employeeList = new ArrayList<Employee>();

	public Employee(){

	}

	public Employee(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String getName(){
		return this.name;
	}

	public double getHourlyRate(){
		return HOURLY_RATE;
	}

	public void setName(String name){
		this.name = name;
	}

	public int getAge(){
		return this.age;
	}

	public void setAge(int age){
		this.age = age;
	}

	public void setWorkedHours(double workedHours) {
		this.workedHours = workedHours;
	}

	public double getWorkedHours(){
		return this.workedHours;
	}

	public static ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public static double getTotalEmployeeCost() {
		return totalEmployeeCost;
	}

	public double calculateSalary(){
		double employeeCost = 0;
		double employeeCostBrutto = 0.0;
		employeeCostBrutto = this.getWorkedHours() * getHourlyRate();
		employeeCost = employeeCostBrutto * 0.3142 + employeeCostBrutto * 0.0511 + employeeCostBrutto;
		totalEmployeeCost = totalEmployeeCost + employeeCost;
		return totalEmployeeCost;

	}

}
