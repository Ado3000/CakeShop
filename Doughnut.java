/**
 * 
 * Class: Doughnut
 * Author: Adnan Alihodzic
 * Description: A class that makes a doughtnut and sets it's price
 *
 */

import java.util.ArrayList;

public class Doughnut extends Pastry {
	
	private final static int SELLING_PRICE = 26;
	
	public Doughnut(){
		setPrice(SELLING_PRICE);
	}
	
	public Doughnut(int amount){
		setPrice(SELLING_PRICE);
		setAmount(amount);
	}
	
	public ArrayList<Ingredients> getIngredientsList() {
		return ingredientsList;
	}
	

	@Override
	public void bake(){
		addIngredients(Ingredients.FLOUR,3);
		addIngredients(Ingredients.MILK,2);
		addIngredients(Ingredients.SUGAR,3);
	}
	

}
