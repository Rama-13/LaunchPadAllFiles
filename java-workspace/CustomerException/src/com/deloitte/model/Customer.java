package com.deloitte.model;

import com.deloitte.myappexceptions.InvalidCustomerIdException;
import com.deloitte.myappexceptions.InvalidCustomerNameException;
import com.deloitte.myappexceptions.NegativeBillAmountException;

public class Customer {
	
	private int customerId;
	private String customerName;
	private int billAmount;
	
	public Customer()
	{
				
	}

	


	public Customer(int customerId, String customerName, int billAmount) {
		super();
		if(customerName.length() < 6)
		{
		this.customerName = customerName;
		}
		
		else
		{
			try {
				throw new InvalidCustomerNameException("Name shouldn't have more than 6 characters");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(customerId>0)
		{
		this.customerId = customerId;
		}
		else
		{
			try {
				throw new InvalidCustomerIdException("Customer Id can't be negative");
			} catch (InvalidCustomerIdException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(billAmount>0)
		{
		this.billAmount = billAmount;
	}
		else
		{
			try {
				throw new NegativeBillAmountException("Bill can't be negative");
			} catch (NegativeBillAmountException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}




	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + billAmount;
		result = prime * result + customerId;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
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
		if (billAmount != other.billAmount)
			return false;
		if (customerId != other.customerId)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", billAmount=" + billAmount
				+ "]";
	}


	
}
