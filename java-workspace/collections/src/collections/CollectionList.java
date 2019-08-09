package collections;


import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import customer.CustAddressComparator;
import customer.CustIdComparator;
import customer.Customer;

public class CollectionList {
	public static void main(String []args)
	{
		List<Customer> a = new LinkedList<Customer>();
		//The data type mentioned above should be a class data type not a primitive one.  You can use Wrapper Classes.
	Scanner sc = new Scanner(System.in);
	int option = sc.nextInt();
		a.add(new Customer(5010,"Rama","CampNou",1600));
		a.add(new Customer(5020,"Dembele","CampNou",1000));
		a.add(new Customer(5030,"Hazard","Bernabeu",1500));
		a.add(new Customer(5040,"Lewandowski","Allianz Arena",1400));
		a.add(new Customer(5050,"K.Debruyne","Etihad",1450));
		a.add(new Customer(5060,"Henderson","Anfield",1100));
		//System.out.println(a);
		//System.out.println(a.size());
		//System.out.println(a.lastIndexOf(a));
		
		 Iterator <Customer> iterator = a.iterator();
		if(option == 0)
		{
		Collections.sort(a);
		}
		if(option ==1)
			{Collections.sort(a, new CustIdComparator());
			}
		if(option ==2)
		{
			Collections.sort(a,new CustAddressComparator());
		}
		if(option == 3)
		
		{
			Collections.sort(a,new Comparator<Customer>() {
// Using Interface and anonymous classes without having to create a new class.
			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.getBill()>o2.getBill() ?-1:1;
				}
		
			});
		}
		
		System.out.println(a);
		/*while(iterator.hasNext())
		{
			Customer cust = iterator.next();
			if(cust.getCustAddress().equals("CampNou") || cust.getBill()>1200)
			{
				System.out.println(cust);
			}
				
		}*/
		
		
	}
		}
	
	
	
	



