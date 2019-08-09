package Woody;

public class Employee {
	int emp_id;
	String name;
	
	public Employee (String name, int emp_id)
	{
		this.emp_id = emp_id;
		this.name = name;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (emp_id != other.emp_id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public static void main(String []args)
	{
		Employee e1 = new Employee("Rama", 15020);
		Employee e2 = new Employee("Rama", 15020);
		Employee e3 = e1;
		
		
		System.out.println(e1.equals(e2));
		System.out.println(e1==e2);
		System.out.println(e3.equals(e1));
		System.out.println(e3 == e1);
		
	}
}
