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
public class Speed_detector {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        //We declared our distance,time,speed
        double distance,time,speed;
        //We rrequested the user to input distance,time,speed
        System.out.println("Enter the distance the car traveled");
        distance = input.nextDouble();
        
        System.out.println("Enter the time it took for the car to travel in seconds");
        time = input.nextDouble();
        //We calculate the speed
        speed = distance/time;
        System.out.println("Your speed is: " + speed + "m/s");
    }
}
