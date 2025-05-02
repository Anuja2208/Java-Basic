package assignmentsab53;
import java.util.Scanner;
//WAP to print Circumference of Circle using Scanner Class
public class Assignment26_CircumferenceOfCircle 
{

	public static void main(String[] args) 
	{
        Scanner s1=new Scanner(System.in);
		
		double pi=Math.PI;
		System.out.println("Please enter the value of rarius");
				
		double r=    s1.nextDouble();
		
		double circumference=2*pi*r;
		System.out.println(circumference);
		
		
		s1.close();

	} 

}
