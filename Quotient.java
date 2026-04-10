 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstproject1;

/**
 *
 * @author makha
 */
import java.util.Scanner;
public class Quotient {
   public static void main(String[]args){
       Scanner values = new Scanner (System.in);
       //we ask user to enter the values in a double data type
       System.out.println("Enter the Divided value");
       Double Divided = values.nextDouble();
       //we ask user to enter the Divisor
       System.out.println("Enter the Divisor value");
       Double Divisor = values.nextDouble();
      
       Double Quotient = Division(Divided,Divisor);
       System.out.println("The quotient of the values you entered is " + Quotient);
   } 
   //this is a method to divide two numbers
   public static Double Division(Double num1, Double num2){
    Double Quotient = num1/num2;
    
    return Quotient;
   }
}
