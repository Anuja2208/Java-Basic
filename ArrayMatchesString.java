package ab53;

public class ArrayMatchesString 
{
public static void main(String[] args) 
{
	String s1="care";
	//if the given string consist of exact 4 letters in it or not
	boolean b1=s1.matches("....");
	System.out.println(b1);
	
	//if the string start with c
	boolean b2=s1.matches("c(.*)");//(.*)indicates multi character
	System.out.println(b2);
	//check if the given string ends with e
	boolean b3=s1.matches("(.*)e");
	System.out.println(b3);
	
	String s2="Spiderman";
	//batman,heman,wonder woman,aquaman,superman,antman,ironman,manager,salman khan,
	//check if the given string have man in it
	
	boolean b4=s2.matches("(.*)man(.*)");
	System.out.println(b4);
	
	
}
}
