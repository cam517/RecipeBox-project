/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SteppingStones;

/**
 *
 * @author Cameron Lee
 */
import java.util.Scanner;
import java.util.ArrayList;

public class SteppingStone5_Recipe {
    
    private String recipeName;
    private int servings;
    private ArrayList<Ingredient> recipeIngredients;
    private double totalRecipeCalories;
    private ArrayList<String> recipeInstructions;
    
    




    /**
     * Add three variables:
     * 
     * 1. a variable 'servings' to store how many people the recipe will feed;
     *
     * 2. an ArrayList variable 'recipeIngredients' to store the text for the
     *      names (recipeName) each recipe ingredient added
     *
     * 3. a variable totalRecipeCalories 
     * 
     */ 
    
    
    /**
     * Add mutators and accessors for the class variable.
     * 
     */
     
    
    public SteppingStone5_Recipe() {
        this.recipeName = "";
        this.servings = 0;  //<--- assignment value with appropriate data type
        this.recipeIngredients = new ArrayList<Ingredient>() ; //<-- assignment value for empty ArrayList
        this.totalRecipeCalories = 0.0;
        this.recipeInstructions = new ArrayList<String>();
    }
    
    public ArrayList<String> getRecipeInstructions() {
        return recipeInstructions;   
        
    }
    
    public void setRecipeInstructions(ArrayList recipeInstructions) {
        this.recipeInstructions = recipeInstructions;
    }
    
    public void addRecipeInstructions(SteppingStone5_Recipe tRecipe)  {
         ArrayList <String> tmpRecipeInstructions = new ArrayList();
        boolean addMoreInstructions = true;
        SteppingStone5_Recipe targetRecipe = new SteppingStone5_Recipe();
           
        Scanner scnr = new Scanner(System.in);
        int count = 0; 
        
        /**System.out.println("Please enter the recipe name that your want to create instructions for: ");
        String recipeName = scnr.nextLine();
        recipeName = recipeName.toLowerCase();
        ArrayList<SteppingStone5_Recipe> currBox = new ArrayList();
        currBox = myRecipeBox.getListOfRecipes();
        for(int i = 0; i < currBox.size(); i++){
            String currRecipeName = currBox.get(i).getRecipeName();
            currRecipeName = currRecipeName.toLowerCase();
            //System.out.println(recipeName);
             if (recipeName.equals(currRecipeName)){ // added extra level of catching exceptions as it does not matter the case of recipe strings
                    currBox.get(i).printRecipe();
                    targetRecipe = currBox.get(i);
                    } */
        String input = new String();
        System.out.println("Please enter the first instruction for this recipe");
        input = scnr.nextLine();
        tmpRecipeInstructions.add(input);
        while(addMoreInstructions == true){
            System.out.println("Do you want to add another Instruction? y or n: ");
            input = scnr.nextLine();
            if(input.equals("n") || input.equals("N"))
                addMoreInstructions = false;
            else if(input.equals("y") || input.equals("Y")){
                System.out.println("Please enter the next instruction for this recipe");
                input = scnr.nextLine();
                System.out.println(input);
                tmpRecipeInstructions.add(input);
            }
            else
                System.out.println("This was not a valid option, please try again");
    }
        tRecipe.setRecipeInstructions(tmpRecipeInstructions);
        System.out.println("List of instructions is as follows: ");
        for (int i = 0; i < tRecipe.getRecipeInstructions().size(); i++)
            System.out.println("Step " + (i + 1) + ": " + tRecipe.getRecipeInstructions().get(i));
        
    }
    
    
    public SteppingStone5_Recipe(String recipeName, int servings, 
    	ArrayList<Ingredient> recipeIngredients, double totalRecipeCalories, ArrayList<String> recipeInstructions) 
    //<-- use appropriate data type for the ArrayList and the servings arguments
    {
        this.setRecipeName(recipeName);
        this.setServings(servings);
        this.setRecipeIngredients(recipeIngredients);
        this.setTotalRecipeCalories(totalRecipeCalories);
        this.setRecipeInstructions(recipeInstructions);
    }
    
    public void printRecipe() {
        /**
         * Declare an int variable singleServingCalories.
         * Assign singleServingCalories to
         * the totalRecipeCalories divided by the servings
         * 
         */
         int singleServingCalories;
         int itotal = (int)totalRecipeCalories; 
         singleServingCalories = itotal / servings;

        /**
         * Print the following recipe information:
         *      Recipe: <<recipeName>>
         *      Serves: <<servings>>
         *      Ingredients:
         *      <<Ingredient1>>
         *      <<Ingredient2>>
         *      ...
         *      <<Last Ingredient>>
         *      
         *      Each serving has <<singleServingCalories>> Calories.
         *
         *      HINT --> Use a for loop to iterate through the ingredients   
         */
        
        System.out.println("Recipe: " + getRecipeName());
        System.out.println("Serves: " + getServings());
        System.out.println("Ingredients: ");
        int arrayLength = recipeIngredients.size();
        for (int i = 0; i < arrayLength; i++) {
        System.out.println(recipeIngredients.get(i).getNameofIngredient() + " is needed with the amount " + recipeIngredients.get(i).getNumberCups() + " " + recipeIngredients.get(i).getMeasurementType());   
        }
        System.out.println();
        System.out.println("Each serving has " + singleServingCalories + " Calories.");
         System.out.println("The total calories that the recipe contains is " + getTotalRecipeCalories() + " calories.");
        System.out.println("List of instructions is as follows: ");
        for (int i = 0; i < getRecipeInstructions().size(); i++)
            System.out.println("Step " + (i + 1) + ": " + getRecipeInstructions().get(i));

    }
    
    public void editRecipe(SteppingStone5_Recipe tRecipe) {
        Scanner scnr = new Scanner(System.in);
        int input = 0;
        boolean addMoreIngredients = true;
        tRecipe.printRecipe();
        System.out.println("What part of the recipe would you like to edit: \n "
                + "1. Recipe Name \n"
                + "2. Servings \n"
                + "3. Ingredients (will have to remake entirely)\n"
                + "4. Instructions (will have to remake entirely) \n"
                + "5. END \n");
        if(scnr.hasNextInt() == true){
            input = scnr.nextInt();
        }
        while(input != 5){
            if(input == 0){
                System.out.println("The adjustment has been made and will reflect when done.");
                System.out.println("Please refer back to edit menu for options");
                input = scnr.nextInt();
            }
            else if(input == 1){
                System.out.println("What do you want the new recipe name to be? ");
                String nName = scnr.nextLine();
                nName = scnr.nextLine();
                tRecipe.setRecipeName(nName);
                input  =  0;     
            }
            else if(input == 2){
                System.out.println("How many servings should the recipe have? ");
                int nServings = scnr.nextInt();
                tRecipe.setServings(nServings);
                input  =  0;
            }
            else if(input == 3){
                tRecipe.setTotalRecipeCalories(0);
                input  =  0;
                tRecipe.getRecipeIngredients().clear();
                while(addMoreIngredients == true){
                    System.out.println("Add another ingredient name or enter 'END' to finish recipe.");
                    String ingredientName = scnr.next();
                    if (ingredientName.toLowerCase().equals("end")) {
                        addMoreIngredients = false;
                    } else {
                        Ingredient tmpIngredient = new Ingredient();
                        tmpIngredient = tmpIngredient.addIngredient(ingredientName);
                        recipeIngredients.add(tmpIngredient);
                        totalRecipeCalories = totalRecipeCalories + tmpIngredient.getTotalCalories();
            }
                    
            }
        }
            else if(input == 4) {
                tRecipe.addRecipeInstructions(tRecipe);
                input  =  0;
            }
            else{
                System.out.println("This is not a valid item on the list.");
                System.out.println("Please refer back to edit menu for options.");
            }
        }
        tRecipe.printRecipe();
    }
    
    /**
     * @return the recipeName
     */
    public String getRecipeName() {
        return recipeName;
    }

    /**
     * @param recipeName the recipeName to set
     */
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    /**
     * @return the servings
     */
    public int getServings() {
        return servings;
    }

    /**
     * @param servings the servings to set
     */
    public void setServings(int servings) {
        this.servings = servings;
    }

    /**
     * @return the recipeIngredients
     */
    public ArrayList getRecipeIngredients() {
        return recipeIngredients;
    }

    /**
     * @param recipeIngredients the recipeIngredients to set
     */
    public void setRecipeIngredients(ArrayList recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    /**
     * @return the totalRecipeCalories
     */
    public double getTotalRecipeCalories() {
        return totalRecipeCalories;
    }

    /**
     * @param totalRecipeCalories the totalRecipeCalories to set
     */
    public void setTotalRecipeCalories(double totalRecipeCalories) {
        this.totalRecipeCalories = totalRecipeCalories;
    }
    
    
    public SteppingStone5_Recipe createNewRecipe() {//main altered to return recipe built by user
        double totalRecipeCalories = 0.0;
        ArrayList <Ingredient> recipeIngredients = new ArrayList();
        boolean addMoreIngredients = true;
        ArrayList<String> blankList = new ArrayList();
        
        Scanner scnr = new Scanner(System.in);
        int servings = 0; 
        
        System.out.println("Please enter the recipe name: ");
        String recipeName = scnr.nextLine();
        
        while(servings <= 0){
            System.out.println("Please enter the number of servings: ");
        //correct data type & Scanner assignment method for servings variable
            if(scnr.hasNextInt() == true)
                servings = scnr.nextInt();
            else
                System.out.println(scnr.next() + " was not a valid amount of servings");
            // ADD WHILE LOOP TO MAKE SURE INPUT IS INT
        }
        while(addMoreIngredients == true){
            System.out.println("Add another ingredient name or enter 'END' to finish recipe.");
            String ingredientName = scnr.next();
            if (ingredientName.toLowerCase().equals("end")) {
                addMoreIngredients = false;
            } else {

            /**
            * Create and add the ingredient object to recipeIngredients
            * 
            */
            Ingredient tmpIngredient = new Ingredient();
            tmpIngredient = tmpIngredient.addIngredient(ingredientName);
            recipeIngredients.add(tmpIngredient);
            totalRecipeCalories = totalRecipeCalories + tmpIngredient.getTotalCalories();
            }
        }
        
                /**
                * Add the total Calories from this ingredient
                *  (ingredientCalories * ingredientAmount)
                * to the totalRecipeCalories
                * 
                */
                SteppingStone5_Recipe recipe = new SteppingStone5_Recipe(recipeName, servings, recipeIngredients, totalRecipeCalories, blankList);
                recipe.printRecipe();
                return recipe;
    }            
                //reply = scanner.nextLine();'
}
/**
 * Psuedo Code for method b where instructions array list can be added to recipe class
 * 
 * Ask user input for list of steps for instructions
 * Create the list of instructions containing strings in an ArrayList
 * 
 * While the List is not full collect instruction steps
 * Print instructions
 * Ask which step if any needs to be adjusted if there are any
 * If the user enters an index then allow them to rewrite this index and reprint
 * If the user enters no then the instructions are saved for that recipe in a public class variable.
 * 
 */ 
/**
 * Final Project
 * 
 * For your Final Project:
 * 
 * 1. Modify this code to develop a Recipe class:
 *	a. change the void main method createNewRecipe() that returns a Recipe 
 * 	 
 * 2. FOR FINAL SUBMISSION ONLY:Change the ArrayList type to an 
 *		Ingredient object.  When a user adds an ingredient to the recipe, 
 * 		instead of adding just the ingredient name, you will be adding the 
 *		actual ingredient including name, amount, measurement type, calories.
 *	For the Milestone Two submission, the recipeIngredients ArrayList can
 *	remain as a String type.
 *
 * 3. Adapt the printRecipe() method to print the amount and measurement
 * 	type as well as the ingredient name.
 *
 * 4. Create a custom method in the Recipe class. 
 *      Choose one of the following options:
 *
 * 	a. print out a recipe with amounts adjusted for a different 
 * 		number of servings
 * 
 * 	b. create an additional list or ArrayList that allow users to 
 * 		insert step-by-step recipe instructions
 *
 * 	c. conversion of ingredient amounts from 
 * 		English to metric (or vice versa)
 *
 * 	d. calculate select nutritional information 
 *
 * 	e. calculate recipe cost
 * 
 *      f. propose a suitable alternative to your instructor
 * 
 */ 