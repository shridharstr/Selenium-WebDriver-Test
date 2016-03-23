package Selenium_Test;
import java.io.*;

public class ConstructorClass 
{
	static int a,b; //class variables
	
	int m=10, n=20; //instance variables 
	
	public ConstructorClass() // default constructor
	{ 
		System.out.println("This is the Constructor Class.");	
		System.out.println("The values of m and n are:"+m+" "+n);
		m++; n++;
		System.out.println("The values after increment are:"+m+" "+n);
		
	}
	
	public ConstructorClass(int a, int b) //overloaded constructor
	{
		this.a = a;
		this.b = b;
		System.out.println("Values of static variables:"+a+" "+b);
	}
	
	public static void main(String[] args) 
	{
		ConstructorClass c1= new ConstructorClass();
	}
	
}
