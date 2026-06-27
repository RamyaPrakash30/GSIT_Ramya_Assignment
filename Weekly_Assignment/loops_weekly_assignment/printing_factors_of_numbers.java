/*4) Question: Print Factors of a Number

Question:
Write a Java program to print all the factors of the number 24 using a loop.

A factor is a number that divides another number completely without leaving a remainder.

Expected Output:

Factors of 24 are:
1
2
3
4
6
8
12
24*/

package loops_weekly_assignment;

public class printing_factors_of_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=24;
		int i;
		
		  System.out.println("Factors of " + num + " are:");
		
		for ( i=1;i<=num;i++)
		{
			if(num % i == 0)
			{
			
				System.out.println(i);
			}
			
			
		}
		
		
	}

}
