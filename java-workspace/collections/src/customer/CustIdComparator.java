package customer;

import java.util.Comparator;

public class CustIdComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer arg0, Customer arg1) {
		return arg0.getCust_id()>arg1.getCust_id()?-1:1;
	}

}
