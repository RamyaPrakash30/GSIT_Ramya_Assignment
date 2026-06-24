/*Assignment 1: ASCII Code Program

Question:
1. Write a Java program to print the ASCII value of the following characters:
•	A 
•	a 
•	0 
•	@ 

Assignment 2: Print Triangle using println()
Question:
Write a Java program to print the following triangle pattern using only System.out.println() statements.

Assignment 3: Type Casting
Question:
Create a Java program that:
1.	Stores 10.75 in a double variable. 
2.	Explicitly typecasts it to an int variable. 
3.	Prints both values.

*/

package daily_assignment;

public class Day2_23_06_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //-----------------------------question1------------------------------------------------------------
		System.out.println("-------------------------------answer1-----------------------------------------");
		char alpha1='A';
		int alphatoInt1=alpha1;
		System.out.println("The value of A is ASCII:"+alphatoInt1);
		
		char alpha2='a';
		int alphatoInt2=alpha2;
		System.out.println("The value of a is ASCII:"+alphatoInt2);
		
		
		char alpha3='0';
		int alphatoInt3=alpha3;
		System.out.println("The value of 0 is ASCII:"+alphatoInt3);
		
		char alpha4='@';
		int alphatoInt4=alpha4;
		System.out.println("The value of 0 is ASCII:"+alphatoInt4);
		
		System.out.println("-------------------------------answer2-----------------------------------------");
		
    //-----------------------------question2------------------------------------------------------------
		
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		
    //-----------------------------question3------------------------------------------------------------
		
		System.out.println("-------------------------------answer3(1)-----------------------------------------");
		double value1toDouble=10.75;
		int value1toInt=(int)value1toDouble;
		
		System.out.println("The value of double: "+value1toDouble);	
		System.out.println("The value of int: "+value1toInt);
			
	}
	
}


