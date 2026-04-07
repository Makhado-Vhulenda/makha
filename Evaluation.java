/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstproject;

/**
 *
 * @author makha
 */
import java.util.Scanner;
public class Evaluation {
    public static void main(String[]args){
    Scanner values = new Scanner (System.in);
    //We declared num1,num2,num3 to an int data type
    double num1, num2, num3;
    //We asked the user to input the data for the above variable.
    System.out.println("In this program we are going to evaluate A to see if it is the greatest, middle or smallest");
    System.out.println("Enter your first number A: ");
    num1 = values.nextDouble();
    System.out.println("Enter your Second number B: ");
    num2 = values.nextDouble();
    System.out.println("Enter your Third number C: ");
    num3 = values.nextDouble();
    //These if statements are used to give the user the message after comparing their values with A 
    if(num1 < num2 && num1 < num3){
    System.out.println("Our A is the Smallest of all values");}
    if(num1 > num2 && num1 > num3){
        System.out.println("Our A is the Greatest of all the values");
    }
    if(num1 > num2 && num1 < num3){
        System.out.println("Our A is the Middle value between B and C");
    }
    if(num1 > num3 && num1 < num2){
      System.out.println("Our A is the Middle value between B and C");  
    }
    if(num1 == num2 || num1 == num3){
        System.out.println("The value of A is not suppose to be equal to B or C");
        System.out.println("Try again and your values must never be equal to one another!!!");
    }
    }
}
