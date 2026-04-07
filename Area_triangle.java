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
public class Area_triangle {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        //We declared base, area, height
        double height, base, area;
        
        System.out.println("We are going to be calculating the area of a triangle");
        //We requested the user to input height and base of triangle
        System.out.println("Enter the height");
        height = input.nextDouble();
        
        System.out.println("Enter the base");
        base = input.nextDouble();
        //We calculated the area and gave an output
        area = 0.5*height*base;
        System.out.println("The area of the specified triangle is " + area);
    }
}
