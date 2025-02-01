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



public class Ingredient { // Code used from SteppingStone2 to build ingredient class
    private String nameOfIngredient;
    private float numberCups;
    private int numberCaloriesPerCup;
    private String measurementType;
    private double totalCalories;
    
    public String getNameofIngredient(){      // toString method
        return nameOfIngredient;
            
    }
    
    public String getMeasurementType(){
        return measurementType;
    }
    
    public void setMeasurementType(String measurementType){
        this.measurementType = measurementType; 
    }
    
    public void setNameofIngredient(String nameOfIngredient){ //method that allows nameOfingredient to be set
        this.nameOfIngredient = nameOfIngredient;
    }
    
    
    public float getNumberCups(){           // returns float value in numberCups
        return numberCups;
}
    
    
    public void setNumberCups(float numberCups){    //method to set numberCups value
        this.numberCups = numberCups;
    }
    
    
    public int getNumberCaloriesPerCup(){ // method to get int value in numberCaloriesPerCup
        return numberCaloriesPerCup;
    }
    
    
    public void setNumberCaloriesPerCup(int numberCaloriesPerCup){ // method to set the int value in setNumberCaloriesPerCup
        this.numberCaloriesPerCup = numberCaloriesPerCup;
    }
    
    
    public double getTotalCalories(){ // method used to get val of totalCalories
        return totalCalories;
    }
    
    
    public void setTotalCalories(double totalCalories) {  //method to set double value for totalCalories
        this.totalCalories = totalCalories;
    }
    
    
    
    
    public Ingredient(){ //default constructor for the ingredient class intializing every val;
        this.nameOfIngredient = "";
        this.numberCups = 0;
        this.numberCaloriesPerCup = 0;
        this.totalCalories = 0.0;
        this.measurementType = "cups";
    }
    
    public Ingredient(String nameOfIngredient, float numberCups, int numberCaloriesPerCup, double totalCalories, String measurementType){
        // constructor method that allows an ingredient's variables to be set upon creation 
        this.nameOfIngredient = nameOfIngredient;
        this.numberCups = numberCups;
        this.numberCaloriesPerCup = numberCaloriesPerCup;
        this.totalCalories = totalCalories;
        this.measurementType = measurementType;
    }
    
    
    public Ingredient addIngredient(String name) { //method that allows user to add input to be saved for an ingredient variables
        //method also uses checks for the values of each iniput
        String tmpNameOfIngredient = name;
        float tmpNumberCups = 0;
        int tmpNumberCaloriesPerCup = 0;
        double tmpTotalCalories = 0;
        String tmpMeasurementType = "";
        String input;
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please enter unit of measurement for ingredient: ");
        tmpMeasurementType = scnr.nextLine();
        
        while (tmpNumberCups <= 0){ // Even in the case the wrong answer is given input will continue to be taken
            System.out.println("Please enter the number of " + tmpMeasurementType + " of " + tmpNameOfIngredient + " that will be needed: ");
            if(scnr.hasNextFloat() == true) { //branch case where input is an integer
                tmpNumberCups = scnr.nextFloat();
                if ( tmpNumberCups > 0) { //Tests whether the input is in correct range
                    System.out.println( tmpNumberCups + " is a valid number of " + tmpMeasurementType + "!"); //Success on condidtions
                }
                else {
                    System.out.println(tmpNumberCups + " is not a valid number of " + tmpMeasurementType + "!"); //Failure on conditions
                }
            }
            else{
                input = scnr.next();
                System.out.println("Please enter a positive float value next time " + input + " was not a valid option");
            }
        }
        while(tmpNumberCaloriesPerCup <= 0) { //Water is possible and does not have calories but after testing Calories per cup cannot equal 0
            System.out.println("Please enter the number of calories per " + tmpMeasurementType + ": ");
            if(scnr.hasNextInt() == true) { //branch case where input is an integer
                tmpNumberCaloriesPerCup = scnr.nextInt();
                if ( tmpNumberCaloriesPerCup > 0) { //Tests whether the input is in correct range
                    System.out.println( tmpNumberCaloriesPerCup + " is a valid number of calories per " + tmpMeasurementType + "!"); //Success on condidtions
                }
                else {
                    System.out.println(tmpNumberCaloriesPerCup + " is not a valid number of calories per " + tmpMeasurementType + "!"); //Failure on conditions
                }   
            }
            else{
                input = scnr.next();
                 System.out.println(input + " is not a number!"); //Failure on conditions
            }
        }
        tmpTotalCalories = (double)tmpNumberCups * (double)tmpNumberCaloriesPerCup;
        
        Ingredient newIngredient = new Ingredient(tmpNameOfIngredient, tmpNumberCups, tmpNumberCaloriesPerCup, tmpTotalCalories, tmpMeasurementType);
        return newIngredient;
    }
}
    
