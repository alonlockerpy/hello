
public class vehicle 
{
	double Size;
	int Doors;
	int Wheels;
	String Engine;
	String Desel;
	String Oil;
	
	public vehicle(double size)
	{
		this.Size = size;
	}
	
	public String engine()
	{
		if(Size <= 10)
		{
			return Oil;
		}
		return Desel;
	}
	
	private int doors()
	{
		if (Size <= 5)
		{
			return 4;
		}
		return 2;
	}
	
	public void getDoors()
	{
		System.out.println("This car can have " + doors() + " doors.");
	}
	
	public void getWheels(String engine)
	{
		if (engine.equals(Oil))
		{
			System.out.println("This car can have 4 wheels.");
		}
		else
		{
			System.out.println("This car can have 6 or more wheels");
		}
	}

}
