package daily_assignment;

public class Day4_29_06_26 {

	public static void main(String[] args) {

		int num = 59371;
		int largestDigit = 0;

		for(;num > 0;)
		{
		    int digit = num % 10;//6,7,,8,9,7

		    if(digit > largestDigit)
		    {
		        largestDigit = digit;//6
		    }

		    num = num / 10;//79876
		}

		System.out.println("Largest Digit = " + largestDigit);
		
	}

}
