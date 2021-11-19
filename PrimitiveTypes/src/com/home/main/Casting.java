package com.home.main;

public class Casting {

	public static void main(String[] args) {
		
		int myMinIntValue = Integer.MIN_VALUE;	
		byte myMinByteValue = Byte.MIN_VALUE;
		short myMinShortValue = Short.MIN_VALUE;
		
		
		int myTotal = (myMinIntValue / 2);
		
		
		// what is inside the () is treated like an int by Java
		// By Default Java uses numbers like integer
		
		// Get an error here :
		//byte myNewByteValue = (myMinByteValue / 2);
		
		
		// Casting means to treat or convert a number from one type to another 
		// Added a (byte) cast in front of the ()
		byte myNewByteValue = (byte) (myMinByteValue / 2);
		
		//Same error her, we need to cast to short 
		//short myNewShortValue = (myMinShortValue / 2);
		
		//Result:
		short myNewShortValue = (short) (myMinShortValue / 2);

	}

}
