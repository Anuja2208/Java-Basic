package assignmentsab53;
//WAP with combination of static and non static methods and try calling both of them
public class Assignment13SNSMcalling 
{
	static void add()
	{
		System.out.println("Addition");
	}
	void sub()
	{
		System.out.println("Subtraction");
	}
	public static void main(String[] args) 
	{
		add();
		Assignment13SNSMcalling a=new Assignment13SNSMcalling();
		a.sub();
		
	}

}
