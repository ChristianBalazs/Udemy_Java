package com.home.main;

public class EqualSign {

	public static void main(String[] args) {
		
		
		// = sign used below is used to assign value 50 to int variable newValue
		int newValue = 50;
		
		// using same = sign below we get an error
		// need to use == double equal instead of single equal =
		
		
		
//		if (newValue = 50) {
//			System.out.println("This is an error");
//		}
		
		
		// using == double equal means we check if newValue is EQUAL to 50
		if (newValue == 50) {
			System.out.println("this is not an error");
		}
		
		
		//Remember :
		// = single equal to assign (assignment operator)
		// == double equal to check if the value is EQUAL to (equal to operator)
		
		
		// Equal to operator with booleans
		boolean isCar = true;
		if (isCar == true) {
			System.out.println("True, Car is here");
		}

		// Abbreviation for true
		// use (isDog) without equal to means checking if isDog value is TRUE
		boolean isDog = true;
		if (isDog) {
			System.out.println("True, the dog is here");
		}
		
		
		// NOT Equal to != (NOT operator or Logical Complement Operator)
		
		boolean isCat = true;
		if (isCat != false) {
			System.out.println("Cat is NOT equal to false");
		}
		
		// Abbreviations for NOT Operator
		// use "!" sign in front of the variable name
		boolean isMouse = false;
		if (!isMouse) {
			System.out.println("Mouse is NOT equal to true");
		}
		
		
		
		
	}

}
