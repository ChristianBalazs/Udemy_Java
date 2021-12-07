package com.home.main;

public class Strings {

	public static void main(java.lang.String[] args) {
		
		// String is a sequence of characters
		// Can contain a large sequence of characters limited by memory,
		// or MAX_VALUE of an int whihc is 2.14 billion
		
		
		//Define a string variable
		String myString = "This is a string" ;
		
		//Print out the string
		System.out.println("myString is: " + myString);
		
		//Add new text to the string
		myString = myString + " and this is more.";
		
		// Print the new string
		System.out.println("myString is: " + myString);
		
		// Add a Unicode character to the string
		myString = myString + "\u00A9 2019";		
		System.out.println("myString is: " + myString);
		
		
		
		// numbers recorded into String data types are appended NOT Added
		// those numbers are treated as text 
		String numberString = "250.55";
		numberString = numberString + "49.45";
		System.out.println(numberString); // get 250.5549.45
		
		
		// When trying to add a integer to a String , Java will treat the int as text 
		String lastString = "10";
		int myInt = 50; //myInt is a int data type
		lastString = lastString + myInt; //myInt will be treated as text 50 NOT number 50
		System.out.println(lastString); // get 1050, text "50" appended to text "10"
		
		
		// Adding a double data type to a String will convert the double into a text
		double doubleNumber = 120.47d;
		lastString = lastString + doubleNumber;
		System.out.println(lastString); // get 1050120.47
		
		
		
		//myInt and doubleNumber are still integer and double data types
		// if we add them we get the result of a mathematical addition
		
		doubleNumber = doubleNumber + myInt;
		System.out.println(doubleNumber); // get 170.47
		
		System.out.println("doubleNumber is: " + doubleNumber);
		
		//Strings are immutable
		
		// When using + plus operator with Strings it will append one text to another text 	
		
		
		
		
		

	}

}
