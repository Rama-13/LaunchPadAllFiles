
/*
Exercise: Write class that declares the following String.
		“The quick brown fox jumps over the lazy dog”.
Perform the following modifications to the above string using appropriate methods.

1.	Print the character at the 12th index. 
2.	Check whether the String contains the word “is”. 
3.	Add the string “and killed it” to the existing string. 
4.	Check whether the String ends with the word “dogs”. 
5.	Check whether the String is equal to “The quick brown Fox jumps over the lazy Dog”.
6.	Check whether the String is equal to “THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG”.                                
7.	Find the length of the String. 
8.	Check whether the String matches to “The quick brown Fox jumps over the lazy Dog”. 
9.	Replace the word “The” with the word “A”. 
10.	Split the above string into two such that two animal names do not come together. 
11.	Print the animal names alone separately from the above string. 
12.	Print the above string in completely lower case. 
13.	Print the above string in completely upper case.
14.	Find the index position of the character “a”. 
15.	Find the last index position of the character “e”.
*/

package basics;

import java.util.StringTokenizer;

public class StringAnswer {
	
	
	public static void main(String []args)
	{
		String name = "The quick brown fox jumps over the lazy dog";
		String name2 = "The quick brown Fox jumps over the lazy Dog";
		String name3 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		
		System.out.println(name.charAt(12));
		if(name.endsWith("dog"))
		{
			System.out.println("4.Yes it ends with a dog");
		}
		
		
			System.out.println("5."+name.equals(name2));
			System.out.println("6."+name.equals(name3));
			System.out.println("7."+name.length());
			System.out.println("8."+name.matches(name2));
			
		StringTokenizer tokenizer = new StringTokenizer(name," ");
		while(tokenizer.hasMoreTokens())
		{
			if(tokenizer.nextToken().equals("jumps"))
			{
				System.out.println("Yes it has is");
				break;
			}
					
		}
		 System.out.println(name += " and killed it");
		 System.out.println(name.replace("The","A"));
		 System.out.println(name.toUpperCase());
		 System.out.println(name.toLowerCase());
		 
		
	}
	
	
	
	

}
