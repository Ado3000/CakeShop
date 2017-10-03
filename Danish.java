/**
 * 
 * Class: Danish
 * Author: Adnan Alihodzic
 * Description: A class that makes a danish and sets it's price
 *
 */

import java.util.ArrayList;

public class Danish extends Pastry {

	private static final int SELLING_PRICE = 30;

	public Danish(){
		setPrice(SELLING_PRICE);
	}

	public Danish(int amount){
		setPrice(SELLING_PRICE);
		setAmount(amount);
	}

	public  ArrayList<Ingredients> getIngredientsList() {
		return ingredientsList;
	}

	@Override
	public void bake(){
		addIngredients(Ingredients.FLOUR,2);
		addIngredients(Ingredients.MILK,1);
		addIngredients(Ingredients.SUGAR,1);
		addIngredients(Ingredients.SPICE,1);
		addIngredients(Ingredients.EGG,2);
	}
}
