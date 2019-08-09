package design_patterns;

public class PaymentSingleton {
	
	static PaymentSingleton payment = new PaymentSingleton();
	//Step1 : Make your constructor private
	private PaymentSingleton()
	{
		System.out.println("Object of payment created");
	}
	public static PaymentSingleton getpaymentObj()
	{
		return payment;
	}
	public void pay(int amount)
	{
		
		 System.out.println("Payment done of INR: "+amount);
	}

}
