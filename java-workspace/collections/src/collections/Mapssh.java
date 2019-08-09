package collections;

import java.util.Map;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;


public class Mapssh {
	
	public static void main(String []args)
	{
		Map<Integer,String>data = new Hashtable<Integer,String>();
		data.put(98115,"Rama");
		data.put(98116,"Ramaa");
		data.put(98117,"Ramaaaha");
		data.put(98118,"Ramaaahaa");
		data.put(98119,"Ramaaahaaa");
		data.put(98120,"Ramaaahaaaaa");
		for(Map.Entry<Integer, String> baad : data.entrySet())
		System.out.println(baad.getKey() +":" + baad.getValue());
		
		
	}

}
