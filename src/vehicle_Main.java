
public class vehicle_Main
{
	public static void main(String[] args)
	{
		String Desel = "v8";
		String Oil = "v4";
		vehicle car = new vehicle(4.3);
		vehicle bus = new vehicle(22.4);
		
		String EngineType = car.engine();

		System.out.println("The vehicle have " + EngineType +" engine type.");
		car.getDoors();
		car.getWheels(Oil);
		
	}

}
