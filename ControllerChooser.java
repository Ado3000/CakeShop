/**
 * 
 * Class: ControllerChooser
 * Author: Adnan Alihodzic
 * Description: Abstrect controller class for our controllers
 *
 */
public abstract class ControllerChooser {
	
	private String name;
	
	public abstract int expenses();
	
	public abstract int income();
	
	public abstract double getTotalCost();
	
	public abstract double calculateEmployeeSalary();
	
	public String getName(){
		return name;
	}

}
