package com.home.main;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Operators {

	public static void main(String[] args) {
		
	// Operators are symbols that perform a specific operation
	// Operand is any object that is manipulated by operators
	// Expression is formed by combining variables, literals, method return values and operators
		
		
		// Have two operators here
		// equal (=) operator and plus (+) operator
		int result = 1 + 2; // 1 + 2 = 3
		System.out.println("1 + 2 = " + result);
		
		int previousResult = result;
		System.out.println("previousResult = " + previousResult);
		
		// (-) minus operator
		result = result - 1 ;// 3 - 1 = 2
		System.out.println("3 - 1 = " + result);
		
		// (*) multiply operator
		result = result * 10; // 2 * 10 = 20
		System.out.println("2 * 10 = " + result);
		
		// (/) divide operator
		result = result /5 ; // 20/ 5 = 4
		System.out.println("20 / 5 = " + result);
		
		// (%) remainder operator
		result = result % 3; // the remainder of (4 % 3 ) = 1 leftover
		System.out.println("4 % 3 = " + result);
			
				

	}

}
