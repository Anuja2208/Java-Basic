package assignmentsab53;
//"WAP on logical operators with AND, OR, AND-NOT and Or-not"
public class Assignment09_LogicalOperators 
{
	int a=100;
	int b=60;		
	public static void main(String[] args) 
	{
		int a=100;
		int b=60;	
		if (a>b && a==b)
		{
			System.out.println("AND Operator");
		}
		if (a>b || a==b)
		{
			System.out.println("OR Operator");
		}
		if (!(a>b && a==b))
		{
			System.out.println("AND Operator");
		}
		if (!(a>b || a==b))
		{
			System.out.println("OR Operator");
		}

	}

}
