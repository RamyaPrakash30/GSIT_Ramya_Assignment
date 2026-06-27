/*5)Print Fibonacci Series

Question:
Write a Java program to print the first 10 terms of the Fibonacci series using a loop.

Expected Output:

0 1 1 2 3 5 8 13 21 34*/


package loops_weekly_assignment;

public class Fibonaci_serious {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int first = 0;
        int second = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.print(first+" ");

            int next = first + second;
            first = second;
            second = next;

	}
	}

}
