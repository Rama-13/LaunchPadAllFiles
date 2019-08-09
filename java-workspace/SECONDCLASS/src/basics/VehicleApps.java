package basics;

//abstract classes and their usage
abstract class Vehicles
{
  int modelNumber;
  public abstract void startEngine();
public void musicSystem()
{
System.out.println("Music");	
}

}
class Cars extends Vehicles
{
  
	@Override
	public void startEngine() {
		System.out.println("Start the car!");
		
	}

}

class Bikes extends Vehicles
{
	
@Override
public void startEngine() {
	System.out.println("Your Bike has started");
	
}

}

public class VehicleApps {
	
	public static void main(String []args)
	{
	
	
	Cars c = new Cars();
	c.startEngine();
	Bikes b = new Bikes();
	b.startEngine();
	

}
}

