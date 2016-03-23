package OOPS_Concepts;
import java.io.*;

public class ParentClass 
{
	public ParentClass()
	{
				
	}
}


class ChildClass extends ParentClass
{	
	
	ChildClass()
	{
		
	}
	
		
	public void DisplayInfo(String name, int age)
	{
		System.out.println("The user details are:");
		System.out.println("Name:"+name+" "+"Age:"+age);
	}
	
	public void DisplayInfo(String degree, String address)
	{
		System.out.println("The user qualification details are:");
		System.out.println("Degree:"+degree+" "+"Address:"+address);
		
	}
	
	public void DisplayInfo(String Bank_Account_Type, String Card_Type, String Online_Trans)
	{
		System.out.println("The user banking details are:");
		System.out.println("Bank Account Type:"+Bank_Account_Type+" "+"Card Type: "+Card_Type+" "
		+"Frequent Online Transaction: "+Online_Trans);
	}
	
	public static void main(String[] args) 
	{
		
		

	}

}
