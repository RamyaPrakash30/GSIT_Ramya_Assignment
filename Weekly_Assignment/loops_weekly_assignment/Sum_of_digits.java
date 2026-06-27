/*3) Sum of Digits

Question:
Write a Java program to find the sum of digits of the number 4567.

Expected Output:

Sum of digits = 22*/

package loops_weekly_assignment;

public class Sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		int i;
		for(i=7; i>=4; i--)
		{
		 a =i+a;
		}
	System.out.println("Sum of digits = "+ a);
		
	}

}
