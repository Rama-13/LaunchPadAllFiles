package Woody;

public class CountDoctors {
	
	static int num =0;
String doctorname;
public CountDoctors ()
{
  doctorname = "Null";
  num++;
}

public CountDoctors(String name, int fees)
{
	num++;
}

public static void print()
{
	System.out.println("no. of doctor objects created = "+num);}
 
public static void main(String []args) {
	
	CountDoctors d1 = new CountDoctors();
	CountDoctors d2 = new CountDoctors("Rama", 40000);
	CountDoctors.print();
	
	
}

}
