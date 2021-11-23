package com.home.main;

public class LogicalOrOperator {

	public static void main(String[] args) {
		
		
		// AND operator means both operands have to be true
		// OR operator means ANY operand has to be true
		
		int firstScore = 80;
		int secondScore = 60;
		
		// here both operands are true
		if ((firstScore >secondScore) || (firstScore > 60)) {
			System.out.println("firstScore is greater than 60");
		}
	
		// here only first operand is true
		if ((firstScore >secondScore) || (firstScore >= 100)) {
			System.out.println("firstScore is greater than secondScore or greater than 100");
		}
		

	}

}
