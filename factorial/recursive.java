package factorial;

import java.util.*;
public class recursive {
     public static void main(String []args)
     {
        //Take input from the user
        //Create an instance of the Scanner Class
        Scanner scan = new Scanner(System.in);
        //Declare and Initialize the variable
        System.out.println("Enter the number: ");
        int input = scan.nextInt();
        
        int baseCase = 1;
        int number = 1;
        
        while(baseCase<=input)
        {
        	number=number*baseCase;
        	baseCase++;
        }
        System.out.println("Factorial of the number: "+number);  
     }   
}