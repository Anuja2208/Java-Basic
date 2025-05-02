package assignmentsab53;
import java.util.Scanner;
//WAP to print Area of Triangle using Scanner Class
public class Assignment27_TriangleArea 
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the value of b and h");
		double b=   s1.nextDouble();
		double h=   s1.nextDouble();
		
		double trianglearea = 0.5*b*h;
		System.out.println(trianglearea);
				
		s1.close();
	}

}
