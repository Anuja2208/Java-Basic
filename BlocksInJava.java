package ab53;

public class BlocksInJava 
{
	//SIB Static Initialization Block
	static
	{
	System.out.println("SIB");
	}
	static
	{
		System.out.println("SIB 1");
	}
	//IIB Instance Initialization Block
	{
		System.out.println("IIB");
	}
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		new BlocksInJava();  //object creation
		new BlocksInJava();

	}
	static
	{
		System.out.println("SIB 2");
	}

}
