import java.util.Scanner;

public class Sum {
	int num; //instance variable
public void display()
{
	
System.out.println(num);
	}

	public static void main(String[] args) {
		int a,b;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		Sum d = new Sum();
		
		
		if(a+b < 0)
		{
			System.out.println("Oops! Bazinga");
		}
		else
		{
			System.out.println("The sum of two numbers is " +(a+b));
		}
		scanner.close();
	}
}
