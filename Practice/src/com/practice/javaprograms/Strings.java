package com.practice.javaprograms;

public class Strings {

	public static void main(String[] args) {
		
		/*byte
		 * short
		 * integer
		 * long
		 * float
		 * double
		 * char
		 * boolean
		 */
		String myString  = "This is a string";
		System.out.println("myString is equal to "+ myString);
	
		myString = myString + ", and a lot more !";
		System.out.println("myString is equal to "+ myString);
		
		myString = myString + " \u00a9 2019";  // \u00a9 is unicode for copyright symbol!!
		System.out.println("myString is equal to " +  myString);
		
		String numberString = "250.5";
		numberString = numberString + " 49.5";
		System.out.println(numberString);
		
		String lastString = "10 ";
		int myInt = 50;
		lastString = lastString + myInt;
		System.out.println("lastString is equal to " + lastString );
		
		double doubleNumber = 120.47d;
		lastString = lastString + doubleNumber;
		System.out.println("lastString is equal to " + lastString );
		
		// Strings in java are immutable, you cannot change a String after it's created, instead a new String is created
		
		
		
	}
}
