
// Created a custom package inside Java project 
package com.home.main;


public class PrimitiveTypes {

	public static void main(String[] args) {
		
		int myValue = 10000;
		
		// int (Integer) is a whole number
		
		int myMinIntValue = Integer.MIN_VALUE;
		
		int myMaxIntValue = Integer.MAX_VALUE;
		
		System.out.println("Integer Min value = " + myMinIntValue);
		System.out.println("Integer Max value = " + myMaxIntValue);
		
		// int is a primitive type  
		// Integer is a Wrapper class for int 
		// using Integer we can perform operations on that wrapper class
		// Wrapper class is a used for all 8 primitive data types
		
		
		// Overflow - when trying to assign a value over the max size of that data type
		System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
		
		// Underflow - when trying to assign a value below the lower limit of that data type
		System.out.println("Busted MIN value= " +  (myMinIntValue - 1));
		
	}

}
