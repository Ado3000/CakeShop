/**
 * 
 * Class: Pastry class
 * Author: Adnan Alihodzic
 * Description: A pastry class that is a general pastry and can be used as a template for other pastrys
 * 
 */

import java.util.ArrayList;

public abstract class Pastry {

	private int price;
	public enum Ingredients {FLOUR, EGG, SUGAR, MILK, CINNAMON, SPICE};
	public ArrayList<Ingredients> ingredientsList = new ArrayList<>();
	private int ingredientsPrice;
	private int amount = 0;

	public Pastry() {
		bake();
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPrice(){
		return this.price;
	}

	public void setPrice(int price){
		this.price = price;
	}

	public void addIngredients(Ingredients ingredient, int amount){
		for(int i = 0; i <= amount-1; i++){
			ingredientsList.add(ingredient);
		}		
	}

	public abstract void bake();

	@SuppressWarnings("incomplete-switch")
	public int getIngredientPrice(Ingredients ingredient){
		ingredientsPrice = 0;

		switch(ingredient) {
		case FLOUR: ingredientsPrice = ingredientsPrice + 1;
		break;

		case EGG: ingredientsPrice = ingredientsPrice + 3;
		break;

		case SUGAR: ingredientsPrice = ingredientsPrice + 4;
		break;

		case CINNAMON: ingredientsPrice = ingredientsPrice + 6;
		break;

		case MILK: ingredientsPrice = ingredientsPrice + 2;
		break;

		case SPICE: ingredientsPrice = ingredientsPrice + 9;
		break;
		}
		return ingredientsPrice;
	}


}
