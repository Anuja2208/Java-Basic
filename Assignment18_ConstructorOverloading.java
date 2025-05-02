package assignmentsab53;
//WAP on Constructor Overloading
public class Assignment18_ConstructorOverloading 
{
	Assignment18_ConstructorOverloading()
	{
		System.out.println("1st Constructor");
	}
	Assignment18_ConstructorOverloading(int a)
	{
		System.out.println("2nd Constructor");
	}
	Assignment18_ConstructorOverloading(int a,char b,String name)
	{
		System.out.println("3rd Constructor");
	}
	public static void main(String[] args) 
	{
	/*	ConstructorOverloading c=new ConstructorOverloading();
		ConstructorOverloading c1=new ConstructorOverloading(300);
		ConstructorOverloading c2=new ConstructorOverloading(50,'A',"Anuja");  */
		new Assignment18_ConstructorOverloading();
		new Assignment18_ConstructorOverloading(50);
		new Assignment18_ConstructorOverloading(100,'b',"Gaikwad");
	}
	
}