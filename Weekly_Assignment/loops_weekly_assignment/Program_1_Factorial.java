/*1) Factorial of a Number

Question:
Write a Java program to calculate the factorial of 6 using a loop.

Expected Output:

Factorial of 6 = 720
*/


package loops_weekly_assignment;

public class Program_1_Factorial {
	public static void main(String[] args) {
	
	int fact = 1;
	
	for (int i=1 ; i<=6; i++)
	{
		fact=fact*i;
	}
	System.out.println("Fatorial of 6 = "+ fact);
	}
}



//6! = 6*5*4*3*2*1=720.
