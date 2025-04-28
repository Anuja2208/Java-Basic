package ab53;
public class AutomationTesting 
{
	static void add()
	{
		System.out.println("Addition");
	}
	static void add(int a)
	{
		System.out.println("Addition");
	}
	void sub() 
	{
		System.out.println("Subtraction");
	}
	void sub(int a) 
	{
		System.out.println("Subtraction");
	}
	AutomationTesting()
	{
		System.out.println("1st Constructor");
	}
	AutomationTesting(String a)
	{
		System.out.println("2nd Constructor");
	}
	public static void main(String[] args) 
	{
		add();
		add(50);
		AutomationTesting a=new AutomationTesting();
				a.sub();
				a.sub(100);
		new AutomationTesting();
		new AutomationTesting("Anuja");
		
		
	}

}
