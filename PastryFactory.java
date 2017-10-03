/**
 * 
 *Class: PastryFactory 
 *Author: Adnan Alihodzic
 *Description: A class for creating the different pastries 
 *
 */

public class PastryFactory {

	//Resturns the pastry and the amount that's specified in the parameters
	public static Pastry getPastry(String pastry, int amount){
		if(pastry.equals("Danish")){
			return new Danish(amount);
		}
		else if(pastry.equals("Cinnamonroll")){
			return new CinnamonRoll(amount);
		}
		else {
			return new Doughnut(amount);
		}
	}

}
