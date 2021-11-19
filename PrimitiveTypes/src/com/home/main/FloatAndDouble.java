package com.home.main;

import java.time.chrono.MinguoChronology;

public class FloatAndDouble {

	public static void main(String[] args) {
		
		//Unlike whole numbers, floating point numbers have fractional parts
		//Floating point numbers are known as real numbers
		
		//Two primitive types of float numbers in Java
		
		//float - single precision number, occupies 32 bits
		//double - double precision number, occupies 64 bits
		
		
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		
		System.out.println("Float Min value = " + myMinFloatValue);
		System.out.println("Float Max value = " + myMaxFloatValue);
		
		
		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		
		System.out.println("Double Min value = " + myMinDoubleValue);
		System.out.println("Double Max value = " + myMaxDoubleValue);
		
		
		// By default Java uses int type for whole numbers and double type for float numbers
		
		int myIntValue = 5;
		double myDoubleValue = 5.25;
		
		// If we declare a float variable with 5.25 value we get an error 
		// Java by default assigns 5.25 as a double , but we created a float 
		//float myFloatValue = 5.25;
		
		// so we need to cast it
		float myFloatValue = (float) 5.25;
		// or use "f" letter at the end of 5.25 like
		float myNewFloatValue = 5.25f;
		
		
		//By default, when creating a float or a double the syntax is
		// <number.(dot)number(f) letter or (d) letter at the end of the number
		float FloatValue = 5.25f;
		double DoubleValue = 5.25d;
		
		

	}

}
