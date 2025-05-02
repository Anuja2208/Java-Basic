package assignmentsab53;
//WAP with combination of 4 non static parameterized methods and try calling all of them
public class Assignment14 
{
	void add(String a) 
	{
		System.out.println("Method 1");
	}
	void add(int a) 
	{
		System.out.println("Method 2");	
	}	
	void add(boolean a)
	{
		System.out.println("Method 3");
	}
	void add(float a)
	{
		System.out.println("Method 4");
	}
public static void main(String[] args) 
	{
		Assignment14 a=new Assignment14();
		a.add("Deshmulkh");
		a.add(500);
		a.add(true);
		a.add(6.67f);
	}

}
