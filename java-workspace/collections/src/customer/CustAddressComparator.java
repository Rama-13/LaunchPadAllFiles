package customer;

import java.util.Comparator;

public class CustAddressComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.getCustAddress().compareTo(o2.getCustAddress())<0?-1:0;
	}

}
