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
public class Greet {
    public static void main(String[]args){
        
        String greet = hello();
        JOptionPane.showMessageDialog(null,""+ greet);
    }
    public static String hello(){
        
        String greet = "Ndaa Vhotakala";
        
        return greet;
    }
}
