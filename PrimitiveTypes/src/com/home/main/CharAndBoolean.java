package com.home.main;

public class CharAndBoolean {

	public static void main(String[] args) {
		
		// Char can store only a single character
		// for storing a character use single quotes '' and NOT double ""
		// A char occupies two bytes of memory which is 16 bits 
		
		
		char myChar = 'D';
		System.out.println(myChar); //get D
		
		// A char can be used to represent Unicode characters
		// Unicode can represent 65535 different types of characters
		// use '\ u'  to signal to Java we are reffering to Unicode
		
		
		// 0044 is the Unicode for chracter D
		char myUnicode = '\u0044';				
		System.out.println(myUnicode); // get D
		
		
		// 00A9 is the Unicode for Copyright character
		char myCopyrightChar = '\u00A9';
		System.out.println(myCopyrightChar); // get ©
		
		
		
		// A boolean value allows for two choices 
		// True or False
		// Yes or No
		// 1 or 0
		
		
		boolean myTrueBoolean = true;
		boolean myFalseBoolean = false;
		
		boolean isCustomerOverTwentyOne = true;
		
	

	}

}
