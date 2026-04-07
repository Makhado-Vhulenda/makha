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
public class Positive_Negative {
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);
        System.out.println("This program will tell you if your number is positive or negative");
        //We declared num1
        double num1;
        //Request an input from user
        System.out.println("Enter your First number");
        num1 = num.nextDouble();
        //If statements which will appear if they meet the condition 
        if(num1 >= 0){
            System.out.println("Your number is a positive");
        }
        if(num1 < 0){
            System.out.println("Your number is a Negative");
        }
    }
}
