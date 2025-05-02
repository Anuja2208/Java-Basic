package assignmentsab53;
//WAP to call one non static method in the main method
public class Assignment11_NonStaticMethod 
{
	void add()
	{
		System.out.println("Addition");
	}
	public static void main(String[] args) 
	{
		Assignment11_NonStaticMethod n=new Assignment11_NonStaticMethod();
		n.add();
	}

}
