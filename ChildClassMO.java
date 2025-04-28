package ab53;

public class ChildClassMO extends ParentClass
{
	void login1()
	{
		System.out.println("Login with mailid or mobile number");
	}
	//void login()
	{
		System.out.println("Login with Mobile Number");
		super.login();
	}
public static void main(String[] args) 
{
	ChildClassMO c1=new ChildClassMO();
	c1.login();
	c1.login1();
	
}
}
