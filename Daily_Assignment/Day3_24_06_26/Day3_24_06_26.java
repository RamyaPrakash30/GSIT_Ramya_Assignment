/*Student Grade Calculator (if-else-if)

Problem Statement
Write a Java program that accepts the marks of a student (out of 100) and displays the corresponding grade based on the following criteria.

Grading Criteria
Marks	Grade
90 - 100	A
75 - 89		B
60 - 74		C
40 - 59		D
0  - 39		Fail			*/


package daily_assignment;

public class Day3_24_06_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int marks=56;
if(marks>=90)
{
	System.out.println("Grade A");
}
else if(marks>=75)
{
	System.out.println("Grade B");
}
else if(marks>=60)
{
	System.out.println("Grade C");
}
else if(marks>=40)
{
	System.out.println("Grade D");
}
else
{
	System.out.println("Fail");
}
	}

}
