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
public class Odd_or_Even {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        //We declared the num1 to integer data type
        int num1;
        //We ask the user to input their num1
        System.out.println("Enter your value and your value must be a whole number");
        num1 = input.nextInt();
        //These if statements are telling us if a number is odd or even number      
        if(num1%2 == 0){
            System.out.println("Your number is an even number");
        }
        if(num1%2 != 0){
            System.out.println("Your number is an odd number");
        }
    }
}
