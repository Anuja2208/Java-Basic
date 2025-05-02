package assignmentsab53;
import java.util.Scanner;
//WAP to print Circumference of Square using Scanner Class
public class Assignment30_SquareCircumference
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the value of a");
		
		double a=     s1.nextDouble();
		
		double squarecircumference=4*a;
		System.out.println(squarecircumference);
		

		s1.close();
	}

}
