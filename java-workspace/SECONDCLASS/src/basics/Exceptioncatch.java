package basics;

public class Exceptioncatch {

	public void display()
	{
		
		int i = 10;
		
        try {
			i = 10 / 0;
		} catch (Exception e) {
			System.out.println("There is an error but");
		}
        finally{
        System.out.println("The number is :" +i);
        
        }
	}
	
	
	public static void main (String []args)
	{
		
		Exceptioncatch a = new Exceptioncatch();
	
	    a.display();
	
	}
		
	
}
