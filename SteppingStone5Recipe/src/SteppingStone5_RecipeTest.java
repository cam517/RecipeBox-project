package SteppingStones;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class SteppingStone5_RecipeTest {

	/**
 	* @param args the command line arguments
 	
	public static void main(String[] args) {
		// Create two recipe objects first
		SteppingStone5_Recipe myFirstRecipe = new SteppingStone5_Recipe();
		ArrayList<String> recipeIngredients = new ArrayList(); 
                recipeIngredients.add("Cheese");
                recipeIngredients.add("Dough");
		ArrayList<String> recipeIngredientsTwo = new ArrayList(); 
                recipeIngredientsTwo.add("Noodles");
                recipeIngredientsTwo.add("Water");
      
    	SteppingStone5_Recipe mySecondRecipe = new SteppingStone5_Recipe("Pizza", 2, recipeIngredients, 300.00);
   	 
    	// Initialize first recipe
    	myFirstRecipe.setRecipeName("Ramen");
    	myFirstRecipe.setServings(2);
    	myFirstRecipe.setRecipeIngredients(recipeIngredientsTwo);
        mySecondRecipe.setRecipeIngredients(recipeIngredientsTwo);
    	myFirstRecipe.setTotalRecipeCalories(150);
   	 
    	// Print details of both recipes
    	myFirstRecipe.printRecipe();
    	mySecondRecipe.printRecipe();
        
        myFirstRecipe.createNewRecipe();
	}
    */
}
