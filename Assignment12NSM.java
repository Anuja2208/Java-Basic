package assignmentsab53;
//WAP to call one non static method in the main method
public class Assignment12NSM 
{
	void add()
	{
		System.out.println("Addition");
	}
	void sub() 
	{
		System.out.println("Subtraction");
	}
	void mul()
	{
		System.out.println("Multiplication");
	}
	public static void main(String[] args) 
	{
		Assignment12NSM a=new Assignment12NSM();
		a.add();
		a.sub();
		a.mul();
		
	}

}
