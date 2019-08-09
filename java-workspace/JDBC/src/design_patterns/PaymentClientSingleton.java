package design_patterns;

public class PaymentClientSingleton {
	
public static void main (String[]args)
{
	PaymentSingleton payment1 = PaymentSingleton.getpaymentObj();
	PaymentSingleton payment2 = PaymentSingleton.getpaymentObj();
	payment1.pay(1200000);
	payment2.pay(1200000);
}

}
