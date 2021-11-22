package com.home.main;

public class FloatingPointPrecision {

	public static void main(String[] args) {
		
		
		int myIntValue = 5;
		float myFloatValue = 5f;
		double myDoubleValue = 5d;
		
		System.out.println("integer value is = " + myIntValue); // get 5
		System.out.println("float value is = " + myFloatValue); // get 5.0
		System.out.println("double value is = " + myDoubleValue); //get 5.0
		System.out.println();
		
		
		int myIntValue2 = 5 / 2;
		float myFloatValue2 = 5f / 2f;
		double myDoubleValue2 = 5d / 2d;
		
		System.out.println("integer2 value is = " + myIntValue2); //get 2
		System.out.println("float2 value is = " + myFloatValue2); //get 2.5
		System.out.println("double2 value is = " + myDoubleValue2); //get 2.5
		System.out.println();
		
		
		int myIntValue3 = 5 / 3;
		float myFloatValue3 = 5f / 3f;
		double myDoubleValue3 = 5d / 3d;
		
		System.out.println("integer3 value is = " + myIntValue3);
		// get 1
		
		System.out.println("float3 value is = " + myFloatValue3);
		//get 1.6666666
		// Float has 7 decimal numbers precision
				
		System.out.println("double3 value is = " + myDoubleValue3);
		// get 1.6666666666666667
		// Double has 16 decimal numbers precision
		
		
		//By DEFAULT Java uses double as the main data type for floats
		//Similarly, for whole numbers, Java uses int as the default data type
		
		

	}

}
