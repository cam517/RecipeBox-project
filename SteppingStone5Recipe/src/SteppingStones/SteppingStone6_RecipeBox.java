package SteppingStones;

import java.util.ArrayList;
import java.util.Scanner;

public class SteppingStone6_RecipeBox {
	
	/**
	 * Declare instance variables:
	 * a private ArrayList of the type SteppingStone5_Recipe named listOfRecipes
	 * 
	 */
         private ArrayList<SteppingStone5_Recipe> listOfRecipes = new ArrayList<SteppingStone5_Recipe>();
	
         
             /**
     * @param listOfRecipes the listOfRecipes to set
     */
    public void setListOfRecipes(ArrayList<SteppingStone5_Recipe> listOfRecipes) {
        this.listOfRecipes = listOfRecipes;
    }
         /**
	 * Add accessor and mutator for listOfRecipes
	 * 
	 */
    /**
     * @return the listOfRecipes
     */
    public ArrayList<SteppingStone5_Recipe> getListOfRecipes() {
        return listOfRecipes;
    }
    
    public void removeRecipeItem(SteppingStone5_Recipe tRecipe){
        ArrayList<SteppingStone5_Recipe> currBox = new ArrayList();
        currBox = getListOfRecipes();
        for(int i = 0; i < currBox.size(); i++){
            SteppingStone5_Recipe tmp = currBox.get(i);
            //System.out.println(tmp);
             if (tmp.equals(tRecipe)){
                 this.listOfRecipes.remove(i);
                 System.out.println("This recipe has been removed");
                 break;
            }
        }
        System.out.println("The recipe could not be found and the list remained the same");
    }
	/**
	 * Add constructors for the SteppingStone6_RecipeBox()
	 * 
	 */
	 public SteppingStone6_RecipeBox(){
             this.listOfRecipes = new ArrayList<SteppingStone5_Recipe>();
         }
         public SteppingStone6_RecipeBox(ArrayList<SteppingStone5_Recipe> recipeBox){
             this.listOfRecipes = recipeBox;
         }
	/**
	 * Add the following custom methods:
	 *   
	 * //printAllRecipeDetails(SteppingStone5_Recipe selectedRecipe)
	 * 		This method should accept a recipe from the listOfRecipes ArrayList
	 * 		recipeName and use the SteppingStone5_Recipe.printRecipe() method 
	 * 		to print the recipe
	 * 		
	 * //printAllRecipeNames() <-- This method should print just the recipe
	 * 		names of each of the recipes in the listOfRecipes ArrayList
	 * 
	 * //addRecipe(SteppingStone5_Recipe tmpRecipe) <-- This method should use
	 * 		the SteppingStone5_Recipe.addRecipe() method to add a new 
	 * 		SteppingStone5_Recipe to the listOfRecipes
	 * 
	 */
	public void printAllRecipeDetails(String selectedRecipe){ // search through a copy of box for item and if there is a hit then it is printed to the user.
            ArrayList<SteppingStone5_Recipe> currBox = new ArrayList();
            boolean hit = false;
            currBox = this.listOfRecipes;
             String currRecipeName = new String();
            for(int i = 0; i < currBox.size(); i++){
                currRecipeName = currBox.get(i).getRecipeName();
                currRecipeName = currRecipeName.toLowerCase();
                System.out.println(currRecipeName);
                if (currRecipeName.equals(selectedRecipe.toLowerCase())){ // added extra level of catching exceptions as it does not matter the case of recipe strings
                    currBox.get(i).printRecipe();
                    hit = true;
                    break;
                }
            }
            if(hit == false){
                System.out.println("This recipe could not be found in the box.");
            }
        }
            
    /**
     *
     * @param selectedRecipe
     * @return
     */
    public SteppingStone5_Recipe findRecipe(String selectedRecipe){  // Added this method for the removal of a recipe menuu option
            ArrayList<SteppingStone5_Recipe> currBox = new ArrayList();// Code to print details was useful and item this time is returned.
            currBox = this.listOfRecipes;
            SteppingStone5_Recipe targetRecipe = new SteppingStone5_Recipe();
             String currRecipeName = new String();
            for(int i = 0; i < currBox.size(); i++){
                currRecipeName = currBox.get(i).getRecipeName();
                currRecipeName = currRecipeName.toLowerCase();
                System.out.println(currRecipeName);
                if (currRecipeName.equals(selectedRecipe.toLowerCase())){ 
                    targetRecipe = currBox.get(i);
                }
            }
            return targetRecipe;
        }
    
	public void printAllRecipeNames(){
            SteppingStone5_Recipe currRecipe = new SteppingStone5_Recipe();
            for(int i = 0; i < listOfRecipes.size(); i++){
                currRecipe.setRecipeName(listOfRecipes.get(i).getRecipeName());
                System.out.println(currRecipe.getRecipeName());
            }
        }
        
        public void addNewRecipe(){
            SteppingStone5_Recipe tmpRecipe = new SteppingStone5_Recipe();
            tmpRecipe = tmpRecipe.createNewRecipe();
            String input;
            Scanner scnr = new Scanner(System.in);
            boolean decision = true;
            while(decision == true){
                 System.out.println("Do you want to add Instructions for this recipe now? Y or N: ");
                 input = scnr.next();
                if(input.toLowerCase().equals("y")){
                    tmpRecipe.addRecipeInstructions(tmpRecipe); 
                    decision = false;
                }
                else if(input.toLowerCase().equals("n")){
                    System.out.println("That is ok, the recipe has been added to the box.");
                    decision = false;
                }
                else{
                    System.out.println("This was not a valid op1tion, please choose again.");
                }
                        
            }
            this.listOfRecipes.add(tmpRecipe);
        }
	/**
	* A variation of following menu method should be used as the actual main 
	*		once you are ready to submit your final application.  For this 
	*		submission and for using it to do stand-alone tests, replace the 
	*		public void menu() with the standard 
	*			public static main(String[] args)
	*		method
	*
	*/
	
	/**public static void main(String[] args){
    	// Create a Recipe Box
    		
	SteppingStone6_RecipeBox myRecipeBox = new SteppingStone6_RecipeBox(); //Uncomment for main method
        Scanner menuScnr = new Scanner(System.in);
        

		
		System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
        while (menuScnr.hasNextInt() || menuScnr.hasNextLine()) {
            System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
            int input = menuScnr.nextInt();
            
			/**
			* The code below has two variations:
			* 	1. Code used with the SteppingStone6_RecipeBox_tester.
			*	2. Code used with the public static main() method
			*
			* One of the sections should be commented out depending on the use. 
			*/
			
			/**
			* This could should remain uncommented when using the
			* SteppingStone6_RecipeBox_tester.
			* 
			* Comment out this section when using the
			*		public static main() method
			
			
			if (input == 1) {
                newRecipe();
            } else if (input == 2) {
                System.out.println("Which recipe?\n");
                String selectedRecipeName = menuScnr.next();
                printAllRecipeDetails(selectedRecipeName);
            } else if (input == 3) {
                
				
				for (int j = 0; j < getListOfRecipes().size(); j++) { 
                    System.out.println((j + 1) + ": " + getListOfRecipes().get(j).getRecipeName()); 
                }
            } else {
                System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2. Print Recipe\n" + "3. Adjust Recipe Servings\n" + "\nPlease select a menu item:");
            }
            */
			/**
			* This could should be uncommented when using the
			* 		public static main() method
			* 
			* Comment out this section when using the
			* 		SteppingStone6_RecipeBox_tester.
			*		
			
			
			if (input == 1) {
                myRecipeBox.addNewRecipe();
            } else if (input == 2) {
                System.out.println("Which recipe?\n");
                String selectedRecipeName = menuScnr.next();
                myRecipeBox.printAllRecipeDetails(selectedRecipeName);
            } else if (input == 3) {		
				for (int j = 0; j < myRecipeBox.listOfRecipes.size(); j++) { 
                    System.out.println((j + 1) + ": " + myRecipeBox.listOfRecipes.get(j).getRecipeName());
				}
            } else {
                System.out.println("\nMenu\n" + "1. Add Recipe\n" + "2. Print Recipe\n" + "3. Adjust Recipe Servings\n" + "\nPlease select a menu item:");
            }
			
			
			
			
			System.out.println("Menu\n" + "1. Add Recipe\n" + "2. Print All Recipe Details\n" + "3. Print All Recipe Names\n" + "\nPlease select a menu item:");
		}
		
        
	} */ 

}


/**
 * 
 * Final Project Details:
 * 
 * For your final project submission, you should add a menu item and a method 
 *		to access the custom method you developed for the Recipe class 
 * 		based on the Stepping Stone 5 Lab.
 *
 */