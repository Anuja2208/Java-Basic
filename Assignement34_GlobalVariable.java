package assignmentsab53;

public class Assignement34_GlobalVariable 
{
	double salary=30000;
	static int a=50;
	static int b=25;
	int c=75;
	int d=25;
	
	static void add()
	{
		System.out.println(a+b);
		Assignement34_GlobalVariable a1=new Assignement34_GlobalVariable();
		System.out.println(a1.c+a1.d);
	}
	void sub() 
	{
		System.out.println(a-b);
		Assignement34_GlobalVariable a1=new Assignement34_GlobalVariable();
		System.out.println(a1.c-a1.d);
	}

	public static void main(String[] args) 
	{
		System.out.println(a);
		System.out.println(b);
		add();
		Assignement34_GlobalVariable a1=new Assignement34_GlobalVariable();
		System.out.println(a1.c);
		System.out.println(a1.d);

	}

}
