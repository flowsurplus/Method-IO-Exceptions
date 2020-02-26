// Michael Jay Marajas Methods, IO, and Exceptions

// COP 2800C 

// 2/13/2020

// Purpose: To produce output on a text file as well as create for and while loops. To also further knowledge in if-else statements in Java
import java.util.Scanner;
import java.util.*;
import java.io.*; 
public class SecondMethods {

	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		
		int b = 1;
		
		// Creating a file object for the pyramid
		PrintStream o = new PrintStream(new File("triangle.txt")); 
		
		 // Store the System.out before you assigned it a new value
        PrintStream console = System.out; 
		
		 Scanner user_input = new Scanner(System.in);
		 //Duplication method using a while loop
		    String first_name;
		    System.out.println("What is your first name? (Do not use spaces)");
		    first_name = user_input.next();
		    while (b < 21) {
		    System.out.println(first_name);
		    b++;
		    }
		    
		Scanner user_Age = new Scanner(System.in); 
		System.out.print ("What is your age?");
		int userAge = user_Age.nextInt();
		int doubleAge = userAge * 2;
		System.out.println("Your current age is " + userAge + " and double that would be " + doubleAge);
		if ((userAge >= 13) && (userAge <= 19)) {
			System.out.println("Since you are " +userAge + " years old, you are a teenager");
		}
		else {
			System.out.println("Since you are " + userAge + " years old, you are NOT a teenager");
		}
		
		//This is the sole output for the console (Works fine without the attempt to write it in a text file)
		Scanner user_Custom = new Scanner(System.in); 
		System.out.print ("Can you give me a number between 3 and 50?");
		int customNum = user_Custom.nextInt();
		if ((customNum >= 3) && (customNum <= 50)) {
			 for (int i = 1; i <= customNum; i++) { 
				  
		            // For Loop for spaces before the star
		            for (int j = customNum; j >= i; j--) { 
		                System.out.print(" "); 
		                
		            } 
		  
		            // For Loop for the actual stars
		            for (int j = 1; j <= i; j++) { 
		                System.out.print("* "); 
		            } 
		  
		            // This is for the new line to start the next row
		          
		            System.out.println(); 
			 }
		      
		        }
			 
		else {
			System.out.print ("That is not a number between 3 and 50. Please try again");
		}
		
		// Produce output on a text file by referencing PrintStream and duplicating the For loop! Took a lot of tries to get it right
		if ((customNum >= 3) && (customNum <= 50)) {
			 for (int c = 1; c <= customNum; c++) { 
				 System.setOut(o); 
		         System.out.println();
		            // For Loop for spaces before the star
		            for (int m = customNum; m >= c; m--) { 
		                System.out.print(" "); 
		                
		            } 
		  
		            // For Loop for the actual stars
		            for (int m = 1; m <= c; m++) { 
		                System.out.print("* "); 
		            } 
		  
		            // This is for the new line to start the next row
		            // This is the redirection of the print output to a text file
		            System.setOut(o); 
		            System.out.println();
			 }
	}
	}
}
