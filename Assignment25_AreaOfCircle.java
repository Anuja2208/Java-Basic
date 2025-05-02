package assignmentsab53;
import java.util.Scanner;
//WAP to print Area of Circle using Scanner Class
public class Assignment25_AreaOfCircle 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		double pi=Math.PI;
		System.out.println("Please enter the value of rarius");
				
		double r=    s1.nextDouble();
		
		double area=pi*r*r;
		System.out.println(area);
		
		
		s1.close();

	}

}
