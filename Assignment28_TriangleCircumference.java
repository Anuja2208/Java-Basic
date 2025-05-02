package assignmentsab53;
import java.util.Scanner;
//WAP to print Circumference of Triangle using Scanner Class
public class Assignment28_TriangleCircumference 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the value of a,b and c");
		
		int a=   s1.nextInt();
		int b=   s1.nextInt();
		int c=   s1.nextInt();
		
		int trianglecicumference=a+b+c;
		System.out.println(trianglecicumference);
		
		s1.close();

	}

}
