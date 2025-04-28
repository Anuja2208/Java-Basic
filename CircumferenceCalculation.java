package ab53;
import java.util.Scanner;
public class CircumferenceCalculation 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Plaese enter the value of a and b");
		int a=   s1.nextInt();
		int b=   s1.nextInt();
		int rectanglecircumference=2*(a+b);
		System.out.println(rectanglecircumference);
		
		Scanner s2=new Scanner(System.in);
		System.out.println("Please enter the value of a1");
		double a1=     s2.nextDouble();
		double squarecircumference=4*a1;
		System.out.println(squarecircumference);
				
		Scanner s3=new Scanner(System.in);
		System.out.println("Please enter the value of a2,b1 and c");
		int a2=   s3.nextInt();
		int b1=   s3.nextInt();
		int c=   s3.nextInt();
		int trianglecicumference=a2+b1+c;
		System.out.println(trianglecicumference);
		
        Scanner s4=new Scanner(System.in);
		double pi=Math.PI;
		System.out.println("Please enter the value of rarius");
		double r=    s4.nextDouble();
		double circlecumference=2*pi*r;
		System.out.println(circlecumference);
		
		s1.close();
		s2.close();
		s3.close();
		s4.close();

	}

}
