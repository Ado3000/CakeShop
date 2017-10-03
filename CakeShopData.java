/**
 * 
 * Class: CakeShopData
 * Author: Adnan Alihodzic
 * Description: Class for keeping all the relevant data for the FinanaceOverseer program
 * 
 */


import java.util.ArrayList;
import java.util.Scanner;

public class CakeShopData {

	private Employee employee = new Employee();
	private static ArrayList <Employee> employeeList = new ArrayList<Employee>();
	private static ArrayList<Pastry> pastryList = new ArrayList<Pastry>();

	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public Employee getEmployee(){
		return this.employee;
	}
	
	public static ArrayList<Pastry> getPastryList() {
		return pastryList;
	}

	public void inputPastries(){
		System.out.println("Please state how many of each cake you have sold");
		String cakeName;
		int amount;
		Scanner cakeScan = new Scanner(System.in);
		Scanner amountScan = new Scanner(System.in);
		while(cakeScan.hasNext()){
			cakeName = cakeScan.nextLine();
			if(cakeName.equals("Danish")){
				amount = amountScan.nextInt();
				pastryList.add(PastryFactory.getPastry(cakeName, amount));
			}
			else if(cakeName.equals("Cinnamonroll")){
				amount = amountScan.nextInt();
				pastryList.add(PastryFactory.getPastry(cakeName, amount));
			}
			else if(cakeName.equals("Doughnut")){
				amount = amountScan.nextInt();
				pastryList.add(PastryFactory.getPastry(cakeName, amount));
			}
			else if(cakeName.equals("Exit")){
				break;
			}
		}
		
	}

	
	public void setEmployees(){
		String name = "";
		String age;
		String hours;
		System.out.println("Please specify their name and age and hours worked");
		Scanner sc = new Scanner(System.in);
		while(!sc.nextLine().equals("Exit")){
			System.out.println("Please type in the name");
			name = sc.nextLine();
			System.out.println("Please type in the age");
			age = sc.nextLine();
			System.out.println("Please type in the hours worked");
			hours = sc.nextLine();
			if(sc.nextLine().equals("Exit"))
				break;
				
			if(Integer.parseInt(age) > 65){
				Employee newEmployee = new SeniorEmployee();
				newEmployee.setName(name);
				newEmployee.setAge(Integer.parseInt(age));
				newEmployee.setWorkedHours(Integer.parseInt(hours));
				employeeList.add(newEmployee);
			}
			else
			employee.setName(name);
			employee.setAge(Integer.parseInt(age));
			employee.setWorkedHours(Integer.parseInt(hours));
			employeeList.add(employee);
		}

	}



}
