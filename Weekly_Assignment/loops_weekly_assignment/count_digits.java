/*) Count Digits

Question:
Write a Java program to count the number of digits in the number 987654 using a loop.

Expected Output:

Number of digits = 6*/




package loops_weekly_assignment;

public class count_digits {
	public static void main(String[] args) {
		int count=0;
		
		for(int digit=987654; digit!=0;digit=digit/10)
		{
			count++;
		}
		System.out.println("Number of Digits = " + count);
	}
}
