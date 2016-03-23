package OOPS_Concepts;
import java.io.*;

interface NewInfo
{
	abstract String fuel();
	
}

public abstract class Cars 
{

	abstract String Car_Color();
	
	abstract String Car_Type();
	
	public void Car_Info()
	{
		System.out.println("Following are the car details:");
		System.out.println("Car Color:");
		System.out.println("Car Type:");
	}

}