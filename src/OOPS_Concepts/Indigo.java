package OOPS_Concepts;

public class Indigo extends Cars
{	@Override
	public String Car_Color() 
   {
	 String color = "White";
	 
	 //System.out.println(color);
	 
	 return color;
		
	}

	@Override
	public String Car_Type() 
	{
	  String type = "Sedan";
	  //System.out.println(type);
	  
	  return type;
		
	}
	
	public void Car_Info()
	{
		System.out.println("Following are the car details:");
		System.out.println("Car Color: "+this.Car_Color());
		System.out.println("Car Type: "+this.Car_Type());
	}
	

	public static void main(String[] args) 
	{
		Cars c = new Indigo();
		c.Car_Color();
		c.Car_Type();
	    c.Car_Info();
	    

	}

}