
package MIDTERM;

import java.util.Scanner;

public class PALINDROME {

    public static void main(String[] args) {
        
        String original;
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a word: ");
       
        original=in.nextLine();
        
        String reverse_original= new StringBuilder(original).reverse().toString();
        
        if (original.equalsIgnoreCase(reverse_original)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
         
        }
        
        
        
        
        
        
    }

}