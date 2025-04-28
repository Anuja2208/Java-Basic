package ab53;

import java.util.Arrays;

public class ArraysAreEqual 
{
public static void main(String[] args) 
{
	int array1 []=new int[4];
	int array2 []=new int[4];
	
	
	array1[0]=15;
	array1[1]=20;
	array1[2]=25;
	array1[3]=30;

	array2[0]=30;
	array2[1]=34;
	array2[2]=25;
	array2[3]=20;
	
	boolean b1= Arrays.equals(array1, array2);
	System.out.println(b1);
	if(b1==true)
	{
		System.out.println("Arrays are equal");
	}
	else
	{
		System.out.println("Arrays are NOT equal");
	}
	
}
}
