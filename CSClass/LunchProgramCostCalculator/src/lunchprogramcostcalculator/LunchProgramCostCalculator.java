/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lunchprogramcostcalculator;

import java.util.Scanner; 

/**
 * Program description: program to calculate the costs for a non-profit lunch.
 * @author Chase Wilkinson
 */
public class LunchProgramCostCalculator {

     /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      final int BREAD_PER_SANDWICH = 2;	// slice
      int numAdults; // Number of adults attending
      int numKids = 0; // Number of kids attending
      int numLunches; // Total lunches needed
      int NUM_BREAD = 2; // Slices of bread per sandwhich
      final double OZ_ADULT_MEAT = 3.5; // OZs of meat for adults sandwich
      final double OZ_KID_MEAT = 1.5; // OZs of meat for kids sandwich
      int totalBread; // How much bread was needed
      double totalKidMeat; // How much meat was needed for the kids sandwiches
      double totalAdultMeat; // How much meat was needed for adults sandwiches
      double totalMeat; // How much meat was needed
      final double PER_LOAF = 2.25; // Cost per loaf
      final double PER_PACK_MEAT = 5.75; // Cost per pack of meat
      double costExtras; // Fruit, chips, and beverages
      double sandwichCost; // How much a sandwhich costed
      double totalExtra; // Total for fruit, chips, and beverages
      double loavesBread; // How many loaves of bread
      double packsMeat; // How many packs of meat
      double totalLunch; // How much the lunch costed 
      
      System.out.println("Program to calculate lunch program costs");
      System.out.println("");
      System.out.println("How many children will be served?");
      numKids = scan.nextInt();
      
      System.out.println("How many adults will be served?");
      numAdults = scan.nextInt();
      System.out.println("");
      
      numLunches = numAdults + numKids;
      System.out.println("Lunches will be needed for " + numLunches + " people");
      System.out.println("");
      
      System.out.println("Ingredients needed:");
      totalBread = numLunches * NUM_BREAD;
      totalKidMeat = numKids * OZ_KID_MEAT;
      totalAdultMeat = numAdults * OZ_ADULT_MEAT;
      totalMeat = totalKidMeat + totalAdultMeat; 
      System.out.println("  " + totalBread + " slices of bread");
      System.out.println("  "+(double)totalMeat + " oz deli meat");
      System.out.println("");
     
      loavesBread = Math.ceil((double)totalBread / 22);
      packsMeat = Math.ceil((double)totalMeat / 16);
      System.out.println("Need to purchase:");
      System.out.println("  " + loavesBread + " loaves of bread");
      System.out.print("  " + packsMeat);
      System.out.println(" packs of deli meat");
      System.out.println("");
      
      
      System.out.println("Cost per lunch for fruit, chips, and beverage?");
      costExtras = scan.nextDouble();
      System.out.println("");
      
      
      sandwichCost = (loavesBread * PER_LOAF) + (packsMeat * PER_PACK_MEAT);
      totalExtra = costExtras * (numKids +numAdults);
      System.out.println("Sandwich total is " + sandwichCost);
      System.out.println("Fruit, chips, and drink total is " + totalExtra);
      System.out.println("");
      
      totalLunch = sandwichCost + totalExtra;
      System.out.println("Total lunch program cost for one day: $ " + totalLunch);
        
     
      
      return;
   }
   
}
