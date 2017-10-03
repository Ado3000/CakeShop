/**
 * 
 * Class: CakeShopController
 * Author: Adnan Alihodzic
 * Description: Class that does the expense and income calculations for the finanace program
 * 
 */

public class CakeShopController extends ControllerChooser {

	CakeShopData cD = new CakeShopData();
	private static final String name = "CakeShopController";
	private static double totalEmployeeCost;
	private static int totalIncome;
	private static int cost = 0;

	//Expenses calculator
	public int expenses(){
		cD.inputPastries();
		int cakeCost = 0;
		int bakingPrice = 0;
		for(Pastry pastry : cD.getPastryList()){
			bakingPrice = 0;
			for(Pastry.Ingredients i : pastry.ingredientsList){
				bakingPrice += pastry.getIngredientPrice(i);
			}
			cakeCost += pastry.getAmount() * bakingPrice;
		}
		cost = cakeCost;
		return cost;
	}

	//Income calculator
	public int income(){
		for(Pastry pastry : cD.getPastryList()){
			totalIncome += pastry.getAmount() * pastry.getPrice();
		}
		return totalIncome;
	}

	//Total employee salary calculator
	public double calculateEmployeeSalary(){
		cD.setEmployees();
		for(Employee e : cD.getEmployeeList()){
			totalEmployeeCost += e.calculateSalary();
		}
		return totalEmployeeCost;
	}

	//Total shop cost calculator
	public double getTotalCost(){
		return  cost + totalEmployeeCost;
	}

	//Method that returns the name of Controller
	@Override
	public String getName() {
		return name;
	}


}
