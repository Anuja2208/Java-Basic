package assignmentsab53;
//WAP with combination of 3 static parameterized methods and try calling all of them
public class Assignment15 
{
	static void add(int a)
	{
		System.out.println("Parameter 1");
	}
	static void add(double a)
	{
		System.out.println("Parameter 2");
	}
	static void add(char a)
	{
		System.out.println("parameter 3");
	}
	public static void main(String[] args) 
	{
		add(400);
		add(34.6789);
		add('A');
		
	}

}
