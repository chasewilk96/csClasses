/*
 * weight conversion program
 */
package weight;

/**
 *
 * @author Chase Wilkinson
 */
import java.util.Scanner;

public class Weight {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      double weight;
      double ounces;
      double tons;
      
      System.out.println("Weight Conversion program");
      
      System.out.println("Enter Weight in pounds: ");
      weight = scan.nextDouble();
      
      System.out.println(weight + " pounds is equivalent to: ");
      ounces = weight * 16;
      tons = weight / 2000;
      System.out.println("     " + ounces + " ounces");
      System.out.println("     " + tons + " tons");
   }
   
}
