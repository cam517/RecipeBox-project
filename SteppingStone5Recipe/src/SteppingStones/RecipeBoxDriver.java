/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SteppingStones;

import java.util.*;
/**
 *
 * @author Cameron Lee
 */
// Here I am making a driver to make use of the methods added to the recipe and recipeBox classes.

public class RecipeBoxDriver {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Initialize the recipe box
        SteppingStone6_RecipeBox recipeBox = new SteppingStone6_RecipeBox();
        
        //Next we will need the interface for the menu
        while(true){
            System.out.print("Main Menu\n"
                    + "1. Add a recipe.\n"
                    + "2. Print recipe details.\n"
                    + "3. List all recipe names.\n"
                    + "4. Delete a recipe.\n"
                    + "5. Exit the program.\n"
                    + "Please select a number from above \n> ");
            int response = 0;
            String ans;
            if(input.hasNextInt() == true){
                response = input.nextInt();
                
                switch(response){
                    
                    case 1: 
                        recipeBox.addNewRecipe();
                        break;
                    
                    case 2: 
                        if(recipeBox.getListOfRecipes().size() >= 1){
                            recipeBox.printAllRecipeNames();
                            System.out.println();
                            System.out.println("What is the name of the recipe? >");
                            String subAns = input.nextLine();
                            subAns = input.nextLine();
                            ans = subAns;
                            SteppingStone5_Recipe target = recipeBox.findRecipe(ans);
                            recipeBox.printAllRecipeDetails(subAns);
                            System.out.println();
                            System.out.println("Do you want to edit this recipe? Y or N:");
                            subAns = input.next();
                            if (subAns.toLowerCase().equals("y")){
                                target.editRecipe(target);
                                break;
                            }
                            else{ // anything other then yes will be no
                                System.out.println("Putting recipe back in box");
                                break;
                            }
                            
                        }
                                
                        else{
                            System.out.println("The recipe box is currently empty.");
                            break;
                        }
                
                    case 3://else if(response == 3){
                        if(recipeBox.getListOfRecipes().size() >= 1) {
                            recipeBox.printAllRecipeNames();
                            break;
                        }
                        else{
                            System.out.println("The recipe box is currently empty.");
                            break;
                        }
                
                    case 4:
                        System.out.println("Which recipe do you want to remove?");
                        recipeBox.printAllRecipeNames();
                        System.out.print(">");
                        ans = input.nextLine();
                        ans = input.nextLine();
                        recipeBox.removeRecipeItem(recipeBox.findRecipe(ans));
                        System.out.println();
                        System.out.println();
                        System.out.println("Resulting new recipe box...");
                        recipeBox.printAllRecipeNames();
                        break;
                  
                    case 5: //else if (response == 5){
                    System.out.println("Goodbye and have a nice day!");
                    System.exit(0);
                    break;
                }
            }
                else
                    System.out.println("That was not a valid response please try again.");
            }
        
        }
    }
    

