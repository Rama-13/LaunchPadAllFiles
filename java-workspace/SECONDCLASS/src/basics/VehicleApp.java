package basics;


class Vehicle
{
  int modelNumber;
  public Vehicle(String carType)
  {
	  System.out.println("VEHICLE 2nd CONS CALLED "+carType);
	  
  }

}
class Car extends Vehicle
{
 public Car()
 {
	 super("Hurican");
	 System.out.println("CAR DEF CONS CALLED");
	 
 }
 
 public Car(String carType)
 {
	 super(carType);
	 modelNumber = 2009;
 }


}

public class VehicleApp {
	
	public static void main(String []args)
	{
	
	
	Car c = new Car();
	

}
}
