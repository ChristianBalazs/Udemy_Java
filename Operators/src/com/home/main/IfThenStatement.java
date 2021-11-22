package com.home.main;

public class IfThenStatement {

	public static void main(String[] args) {
		
		
		// One = equal sign means assignment, assign a value to a variable
		// Two == equal sign means are the compared operands identical / same value
		// isAlien == false means "isAlien" have the same value as "false" 
		
		//Create a boolean 
		boolean isAlien = false;
		
		// use a if then statement
		// inside () is the logical condition
		// inside {} is the code block/ code to execute if the condition is TRUE
		if (isAlien == false) {
			System.out.println("It is not an alien!");
		}
		
		
		// the print will not be run because the condition inside () is not true
		if (isAlien == true) {
			System.out.println("Oh no, aliens are here");
		}
		
		
		
		

	}

}
