package customer;

public class Customer implements Comparable<Customer> {
	private int cust_id;
	private String custname;
	private String custAddress;
	private int bill;
	
	public Customer()
	{
		cust_id = 100;
		custname = "null";
		custAddress = "CampNou";
		bill = 0;
	}
	
public Customer(int cust_id, String custname, String custAddress, int bill) {
		super();
		this.cust_id = cust_id;
		this.custname = custname;
		this.custAddress = custAddress;
		this.bill = bill;
	}

@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bill;
		result = prime * result + ((custAddress == null) ? 0 : custAddress.hashCode());
		result = prime * result + cust_id;
		result = prime * result + ((custname == null) ? 0 : custname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (bill != other.bill)
			return false;
		if (custAddress == null) {
			if (other.custAddress != null)
				return false;
		} else if (!custAddress.equals(other.custAddress))
			return false;
		if (cust_id != other.cust_id)
			return false;
		if (custname == null) {
			if (other.custname != null)
				return false;
		} else if (!custname.equals(other.custname))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "\nCustomer [cust_id=" + cust_id + ", custname=" + custname + ", custAddress=" + custAddress + ", bill="
				+ bill + "]";
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public int getBill() {
		return bill;
	}

	public void setBill(int bill) {
		this.bill = bill;
	}

	public static void main (String []args)
	{
		Customer cust1 = new Customer(1500,"Rama","Banglore",15000);
		Customer cust2 = new Customer(1500,"Rama","Banglore",15000);
		System.out.println(cust1.equals(cust2));
		System.out.println(cust1.hashCode());
		System.out.println(cust2.hashCode());
	}

	
	
	@Override
	public int compareTo(Customer o)
	{
	/* Sorting based on Bill amount{
		if(this.getBill()>o.getBill())
		{
			return 1;
		}
		else
		{
		return -1;
		}
	}*/
		
	if(this.getCustname().compareTo(o.getCustname()) <0) //Sorting based on Custname
	{
		return -1;
	}
	else
	{
	return 0;
	}
	}
	
	

}
