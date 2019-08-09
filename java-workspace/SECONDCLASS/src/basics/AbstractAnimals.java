package basics;

abstract class AbstractAnimals {
	
	
	public abstract void eat();
	public void sleep()
	{
		System.out.println("They all sleep the same way");
	}
	public abstract void roam();
	public abstract void makeSound();
	
	
}

abstract class Feline extends AbstractAnimals{
	
@Override
public void roam() {
	System.out.println("All Felines roam the same way");
	}
	
	
}


class Lion extends Feline{
	
	@Override
	public void eat() {
	System.out.println("Lion eats like a King");
		
	}
	@Override
	public void makeSound() {
		System.out.println("A lion ROARS!");
		
	}
		
}

class Tiger extends Feline{
	
	@Override
	public void eat() {
	System.out.println("Tiger eats like a.... well.. A TIGER!");
		
	}
	@Override
	public void makeSound() {
		System.out.println("A Tiger also roars but not ROARS!");
		
	}
		
}

class Cat extends Feline{
	
	@Override
	public void eat() {
	System.out.println("Cat eats a rat");
		
	}
	@Override
	public void makeSound() {
		System.out.println("A Cat Meows");
		
	}
		
}

class Hippo extends AbstractAnimals
{
	
@Override
public void roam() {
System.out.println("Hippos roam cutely :)");
	
}
@Override
	public void makeSound() {
		System.out.println("Hippo sounds like a Hippo");
		
	}
@Override
	public void eat() {
		System.out.println("Hippo eats like a Hippo");
		
	}
}

abstract class Canines extends AbstractAnimals
{
	
@Override
public void roam() {
System.out.println("Canines roam the same");
	
}

}

class Dog extends Canines
{
	
@Override
public void eat() {
	System.out.println("Dog eats Cat");
	
}@Override
	public void makeSound() {
		System.out.println("Dog barks");
		
	
}


}







