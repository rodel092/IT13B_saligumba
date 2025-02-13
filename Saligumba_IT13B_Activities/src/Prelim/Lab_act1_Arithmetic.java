/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prelim;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab_act1_Arithmetic {
    public static void main(String[] args){
    Scanner in= new Scanner(System.in); 
    
     System.out.println("Input first number");
     int myFirstNumber= 0;
     myFirstNumber=in.nextInt();
     System.out.println("Input second number");
     int mySecondNumber= 0;
     mySecondNumber=in.nextInt();
     System.out.println("Input third number");
     int myThirdNumber= 0;
     myThirdNumber=in.nextInt();
     
     int x = 3;
     
     System.out.println(myFirstNumber + " * " + mySecondNumber + " + " + myThirdNumber + " = " + (myFirstNumber * mySecondNumber + myThirdNumber) );
     System.out.println("(" + myFirstNumber + " - " + mySecondNumber + " )" + " % " + myThirdNumber + " = " + ((myFirstNumber - mySecondNumber) % myThirdNumber ));
     System.out.println("(" + myFirstNumber + " + " + mySecondNumber + " + " + myThirdNumber + ")" + " / " + x + " = " + ((myFirstNumber + mySecondNumber + myThirdNumber) / x));
     System.out.println(myFirstNumber + " * " + myThirdNumber + " - " + "(" + mySecondNumber + " * " + mySecondNumber + ")" + " = " + (myFirstNumber * myThirdNumber - (mySecondNumber * mySecondNumber))); 
             
     
     
    }
    
}
