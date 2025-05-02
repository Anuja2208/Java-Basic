package assignmentsab53;
import java.util.Scanner;
//WAP to print Area of Square using Scanner Class
public class Assignment29_SquareArea 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the value of a and a1");
		int a=    s1.nextInt();
		int a1=   s1.nextInt();
		
		int squarearea=a*a1;
		System.out.println(squarearea);
		
		s1.close();

	}

}
