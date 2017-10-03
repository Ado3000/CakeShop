/**
 * 
 * Class: A simple Cinnamonbun class
 * Author: Adnan Alihodzic
 * Description: A class that makes a cinnamonbun and sets it's price
 *
 */

import java.util.ArrayList;

public class CinnamonRoll extends Pastry{

	private static final int SELLING_PRICE = 22;

	public CinnamonRoll(){
		setPrice(SELLING_PRICE);
	}

	public CinnamonRoll(int amount){
		setPrice(SELLING_PRICE);
		setAmount(amount);
	}

	public ArrayList<Ingredients> getIngredientsList() {
		return ingredientsList;
	}

	@Override
	public void bake(){
		addIngredients(Ingredients.FLOUR,3);
		addIngredients(Ingredients.CINNAMON,1);
		addIngredients(Ingredients.MILK,1);
		addIngredients(Ingredients.SUGAR,1);
	}

}
