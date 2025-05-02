package assignmentsab53;
//WAP to call Constructor with parameter and without parameter
public class Assignment17_Constructor 
{
	Assignment17_Constructor()
	{
		System.out.println("1st non parameterized constructor");
	}
	Assignment17_Constructor(String a)
	{
		System.out.println("2nd parameterized constructor");
	}
	
	public static void main(String[] args) 
	{
		//Assignment17 a1=new Assignment17();
		//Assignment17 a2=new Assignment17("AB53");
		new Assignment17_Constructor();
		new Assignment17_Constructor("Anuja");
		
	}

}
