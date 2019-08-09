package basics;

class GarbageCollection {
	
@Override
protected void finalize() throws Throwable
{
	
System.out.println("I've officially Overrided");
}

}
class Gc2
{
}


class Gc1
{
	
public static void main (String []args)
{
	GarbageCollection a = new GarbageCollection();
	Gc2 b = new Gc2();
	b = new Gc2();

	// finalize gets called only when there is an object available for garbage collection from the class in which Finalize is overrided.

 System.out.println("A new object is created Lads");
 System.gc();



}


}
