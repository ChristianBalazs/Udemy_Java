package com.home.main;

public class OperatorsExercise {

	public static void main(String[] args) {
		
		//Exercise
		// 1 Create a double variable with value 20.00
		// 2 Create another double variable with value 80.00
		// 3 Add both numbers together and multiply by 100.00
		// 4 Use remainder operator to get the remainder from operation in step 3 and 40.00
		// 5 Create a boolean variable that assigns value true if remainder in #4 is 0 or false if it is not zero
		// 6 Output the boolean variable
		// 7 Write if-then statement with "Got some remainder" if the boolean in step 5 is not true.
		
		
		//Solution:
		
		// 1
		double num1 = 20.00d;
		// 2
		double num2 = 80.00d;
		//3
		double totalNums = (num1 + num2) * 100.00d ;
		// 4
		double remainderNum = totalNums % 40.00;
		// 5
		boolean isRemainderZero = remainderNum == 0 ? true : false;
		// 6
		System.out.println(isRemainderZero);
		// 7
		if (!isRemainderZero) {
			System.out.println("Got some remainder");
		}
		
	
		

	}

}
