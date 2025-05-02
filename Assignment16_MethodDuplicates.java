package assignmentsab53;
//WAP for Method overloading for static and non static method. 
public class Assignment16_MethodDuplicates 
{
	static void add()
	{
		System.out.println("Method Overloading 1");
		
	}
	static void add(int a,int b)
	{
		System.out.println("Method Overloading 2");
		
	}
	void add(double a,char b)
	{
		System.out.println("Method Overloading 3");
		
	}
	void add(String a,String b)
	{
		System.out.println("Method Overloading 4");
		
	}
	public static void main(String[] args) 
	{
		add();
		add(50,300);
		Assignment16_MethodDuplicates n=new Assignment16_MethodDuplicates();
		n.add(3.15, 'D');
		n.add("Anuja","Deshmukh");
	}

}
