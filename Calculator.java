/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package firstproject1;

/**
 *
 * @author makha
 */
import javax.swing.JOptionPane;

public class Calculator {
    // i created my own method for addition
    public static double addition(double num1, double num2){
        double result = num1 + num2;
        return result;
    }
    // i created my own method for subtraction
    public static double subtraction(double num1, double num2){
        double result = num1 - num2;
        return result;
    }
    // i created my own method for multiplication
    public static double multiplication(double num1, double num2){
        double result = num1 * num2;
        return result;
    }
        // i created my own method for division
    public static double division(double num1, double num2){
        double result = num1 / num2;
        return result;
    }
    //this is our main method
    @SuppressWarnings("empty-statement")
    public static void main(String[]args){
        
        String name = JOptionPane.showInputDialog(null,"Hello can you please enter you name: ");
       JOptionPane.showMessageDialog(null,"Welcome " + name +"\n follow the steps for the calculation \n 1.You will enter your first number \n 2.You will enter your second number"
               + "\n 3.You can enter any number decimal or whole numbers but your number must be greater than zero"
               + "\n 4.After entering your two numbers then you will choose what you want from add,subtract,multiply or divide"
               + "\n 5.And we will provide you with the answer ");
       
       double number1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your first number"));
       
       double number2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter your second number"));
       
       int choose = Integer.parseInt(JOptionPane.showInputDialog(null,"Thank you for entering the numbers"
               + "\n Now below you have to choose from 1 to 4 \n You can only choose one option, if you enter an option which is not there it won't run"
               + "\n 1.Add \n 2.Subtract \n 3.Multiply \n 4.Divide"));
       
       if(choose == 1){
           double result = addition(number1,number2);
           JOptionPane.showMessageDialog(null,"Your answer after addition is: \n"+result);
       }
       else if(choose == 2){
           double result = subtraction(number1,number2);
           JOptionPane.showMessageDialog(null,"Your answer after subtraction is:\n "+result);
       }
       else if(choose == 3){
           double result = multiplication(number1,number2);
           JOptionPane.showMessageDialog(null,"Your answer after multiplication is: \n"+result);
       }
       else if(choose ==4){
           double result = division(number1,number2);
           JOptionPane.showMessageDialog(null,"Your answer after division is: \n"+result);
       }
       else{
           JOptionPane.showMessageDialog(null,"Your option is invalid run the program again");
       }
       for (choose = 0; choose < 4; choose++);
       
       //----------------------------Fisrt repeat------------------------------------------------------------
       int resume = Integer.parseInt(JOptionPane.showInputDialog(null,"Do you want to continue, choose from 1 and 2 \n 1.Yes \n 2.No"));
       if(resume == 1){
                   choose = Integer.parseInt(JOptionPane.showInputDialog(null,"Thank you for entering the numbers"
               + "\n Now below you have to choose from 1 to 4 \n You can only choose one option, if you enter an option which is not there it won't run"
               + "\n 1.Add \n 2.Subtract \n 3.Multiply \n 4.Divide"));
                   
        if(choose == 1){
           double result = addition(number1,number2);
           JOptionPane.showMessageDialog(null,"Your answer after addition is: \n"+result);
       }
       else if(choose == 2){
           double result = subtraction(number1,number2);
           JOptionPane.showMessageDialog(null,"Your answer after subtraction is:\n "+result);
       }
       else if(choose == 3){
           double result = multiplication(number1,number2);
           JOptionPane.showMessageDialog(null,"Your answer after multiplication is: \n"+result);
       }
       else if(choose ==4){
           double result = division(number1,number2);
           JOptionPane.showMessageDialog(null,"Your answer after division is: \n"+result);
       }
       if (resume == 2){
           JOptionPane.showMessageDialog(null,"Your option is invalid run the program again");
       }
       //--------------------------------------Second repeat----------------------------------------------------------------------------
        resume = Integer.parseInt(JOptionPane.showInputDialog(null,"Do you want to continue, choose from 1 and 2 \n 1.Yes \n 2.No"));
       if(resume == 1){
                   choose = Integer.parseInt(JOptionPane.showInputDialog(null,"Thank you for entering the numbers"
               + "\n Now below you have to choose from 1 to 4 \n You can only choose one option, if you enter an option which is not there it won't run"
               + "\n 1.Add \n 2.Subtract \n 3.Multiply \n 4.Divide"));
                   
        if(choose == 1){
           double result = addition(number1,number2);
           JOptionPane.showMessageDialog(null,"Your answer after addition is: \n"+result);
       }
       else if(choose == 2){
           double result = subtraction(number1,number2);
           JOptionPane.showMessageDialog(null,"Your answer after subtraction is:\n "+result);
       }
       else if(choose == 3){
           double result = multiplication(number1,number2);
           JOptionPane.showMessageDialog(null,"Your answer after multiplication is: \n"+result);
       }
       else if(choose ==4){
           double result = division(number1,number2);
           JOptionPane.showMessageDialog(null,"Your answer after division is: \n"+result);
       }
       else{
           JOptionPane.showMessageDialog(null,"Your option is invalid run the program again");
       }
       }
       if(resume == 2){
           JOptionPane.showMessageDialog(null,"Bye");
       }
       //--------------------------------------Third repeat----------------------------------------------------------------------------
        resume = Integer.parseInt(JOptionPane.showInputDialog(null,"Do you want to continue, choose from 1 and 2 \n 1.Yes \n 2.No"));
       if(resume == 1){
                   choose = Integer.parseInt(JOptionPane.showInputDialog(null,"Thank you for entering the numbers"
               + "\n Now below you have to choose from 1 to 4 \n You can only choose one option, if you enter an option which is not there it won't run"
               + "\n 1.Add \n 2.Subtract \n 3.Multiply \n 4.Divide"));
                   
        if(choose == 1){
           double result = addition(number1,number2);
           JOptionPane.showMessageDialog(null,"Your answer after addition is: \n"+result);
       }
       else if(choose == 2){
           double result = subtraction(number1,number2);
           JOptionPane.showMessageDialog(null,"Your answer after subtraction is:\n "+result);
       }
       else if(choose == 3){
           double result = multiplication(number1,number2);
           JOptionPane.showMessageDialog(null,"Your answer after multiplication is: \n"+result);
       }
       else if(choose ==4){
           double result = division(number1,number2);
           JOptionPane.showMessageDialog(null,"Your answer after division is: \n"+result);
       }
       else{
           JOptionPane.showMessageDialog(null,"Your option is invalid run the program again");
       }
       }
       else{
           JOptionPane.showMessageDialog(null,"Bye");
       }
       }
       else{
           JOptionPane.showMessageDialog(null,"Bye");
       }
    }
}
