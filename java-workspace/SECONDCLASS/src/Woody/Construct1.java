package Woody;

public class Construct1 {
	int num;
	public Construct1()
	{
		System.out.println("Bazzinga");
	}

	public Construct1(String name)
	{
		num = 20;
	}
	public void display()
	{
		System.out.println(" your number is " +num);
	}
	public static void main (String []args)
	{

		Construct1 b = new Construct1 ("Rama");
		b.display();
		Bladerunner c = new Bladerunner("Agent K");
		c.const2();


	}


}


