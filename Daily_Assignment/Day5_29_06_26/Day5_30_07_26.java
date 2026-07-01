/*solve below questions using while loop

1)Print every alternate uppercase letter

Output:
A C E G I ... Y*/



package daily_assignment;

public class Day5_30_07_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char num1='A';
		char num2='Y';
		
		
		while(num1<=num2)
		{
			System.out.print(num1+" ");
			num1+=2;
		}
		
		/*
		 * 2)Print ASCII values of A to Z
		 * 
		 * Output: A = 65 B = 66 ... Z = 90
		 */

		char num4='A';
		char num5='Z';
		
		
		
		System.out.println(" ");
		
		while(num4<=num5)
		{
			int ascii=num4;
			System.out.print(ascii +" ");
			num4 ++ ;
			
		}
		
		
		
		
		
		
		
	}

}







