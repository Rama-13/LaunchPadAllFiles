package basics;

import java.util.StringTokenizer;

public class StringDemos {
	
	public static void main (String []args)
	{
		String name = "Rama";
		String name1 = new String("Jay");
		name = "Laxman";
		name = name + "a";
		
	// String is immutable, meaning it can't be changed but as in below when you assign name = "Laxman", name will create a new memory allocation and point it to Laxman and not Rama. However, Rama remains unchanged and is now eligible for garbage collection.		
		
		name.concat("Kumar");
		System.out.println(name.substring(2, 4));
		// begin index is inclusive and end index is exclusive in substring
		System.out.println(name1.charAt(2));
		System.out.println();
		System.out.println(name);
		
		StringBuffer name3 = new StringBuffer("LM");
				
				System.out.println(name3.capacity());
		name3.append("10000000000000000000");
		System.out.println(name3);
		System.out.println(name.toUpperCase());
		System.out.println(name3.capacity());
		
		String quote = "Once upon a time in Hollywood";
		String reverse = "";
		StringTokenizer tokenizer = new StringTokenizer(quote," ");
		
		while(tokenizer.hasMoreTokens())
		{
			reverse = tokenizer.nextToken() + " " + reverse;
		}
		StringTokenizer token = new StringTokenizer(reverse," ");
		while(token.hasMoreTokens())
		{
		System.out.println(token.nextToken());
		}
		
	}

}
