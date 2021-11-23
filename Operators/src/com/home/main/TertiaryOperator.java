package com.home.main;

public class TertiaryOperator {

	public static void main(String[] args) {
		
		// Ternary operator is used to assign one of TWO values to a variable
		// based on a certain condition
		
		
		//Create a boolean variable isCar and assign value false
		boolean isCar = false;
		
		// Ternary Operator ?:
		// uses two symbols ? and :
		// uses three operands
		
		// isCar == true is the 1st operand
		// ? is the 1st symbol of ternary
		// true is the 2nd operand
		// : is the 2nd symbol
		// false is the 3rd operand
		
		
		// Create a boolean wasCar and assign a value by using ternary operator against the previous boolean
		// is similar to a if else statement
		
		// if isCar == true operand is true, then 
		// wasCar will have value of true, otherwise
		// wasCar will have value of false
		
		
		//Check if wasCar is true
				
		boolean wasCar = (isCar == true) ? true:false;
		
		if (wasCar == true) {
			System.out.println("wasCar is true"); // will not print
		}
		// since isCar is set to false, wasCar will be false based on ternary operator
		
		
		isCar = true;// change isCar to true
		wasCar = (isCar == true) ? true:false;
		
		// Check again 
		// will print because wasCar was assigned value true by tertiary operator
		if (wasCar == true) {
			System.out.println("wasCar is true"); //will print
		}
		
		
		
		//Another example
				
		int clientAge = 20;
		// clientAge >18 is the condition of the ternary
		// if clientAge is higher than 18, means the condition is true, therefore
		// allowToEnter will be set to true
		boolean allowToEnter = clientAge >18 ? true : false;
		
		if (allowToEnter == true) {
			System.out.println("Client can enter");
		}
		
		
		//Another example		
		// clientAge is below 18, therefore allowToEnter will be set to false
		int clientAge2 = 17;
		boolean allowToEnter2 = clientAge2 > 18 ? true : false;
		
		if (allowToEnter2 == false) {
			System.out.println("Not allowed to enter");
		}
		
		
		
		

	}

}
