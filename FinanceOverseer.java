/**
 * 
 * Class: FinanaceOverseer
 * Author: Adnan Alihodzic
 * Description: Main class for running the program which calculates your business finanaces
 * 
 */
import java.util.Scanner;

public class FinanceOverseer {


	// Method for choosing your business
	private static String buisnessChooser(){
		String buiness;
		Scanner sc =  new Scanner(System.in);
		buiness = sc.nextLine();
		return buiness;
	}

	//A simple helper method for deciding if your business has any employees by answering yes or no
	private static String yesNo(){
		String answer;
		Scanner sc =  new Scanner(System.in);
		answer = sc.nextLine();
		if(answer.equals("yes"))
			return answer;
		else
			return answer;
	}

	public static void main(String[] args) {
		ControllerChooser controllerChooser = ControllerChooserFactory.getController(new CakeShopControllerFactory());
		String choice;
		System.out.println("Hello and welcome to Finanace Overseer");
		System.out.println("Which of the followin businesses do you own:" + "\n"
				+ "Coffe Shop" + "\n" + "Barber Shop" + "\n" + "Cake Shop");
		choice = buisnessChooser();
		if(choice.equals("Coffe Shop")){
			System.out.println("Coffe Shop not registered for this program version");
		}
		else if(choice.equals("Barber Shop")){
			System.out.println("Barber Shop not registered for this program version");
		}
		else if(choice.equals("Cake Shop")){
			controllerChooser.expenses();
			System.out.println("Do you have any employees ?");
			if(yesNo().equals("yes")){
				controllerChooser.calculateEmployeeSalary();
				System.out.println("Your total income for this month is:" + "\n" + controllerChooser.income());
				System.out.println("Your total expenditure for this month is" + "\n" + controllerChooser.getTotalCost());
			}
			else {
				System.out.println("Your total income for this month is:" + "\n" + controllerChooser.income());
				System.out.println("Your total expenditure for this month is" + "\n" + controllerChooser.getTotalCost());
			}
		}
		else {
			System.out.println("Not valid input or business");
		}

	}

}
