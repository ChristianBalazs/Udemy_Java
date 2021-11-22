package com.home.main;

public class LogicalAndOperator {

	public static void main(String[] args) {
		
		
		int topScore = 100;
		
		// == means equal to
		// != means is NOT equal to
		// > means greater than
		// >= means greater or equal
		// < means less than 
		// <= means less or equal
		
		
		if (topScore == 100) {
			System.out.println("You got the high score");
		}
		
		if (topScore != 10) {
			System.out.println("topScore is not 10");
		}
		
		
		if (topScore > 80) {
			System.out.println("You got above 80 score");
		}

		
		if (topScore >= 100) {
			System.out.println("topScore is greater or equal to 100");
		}
		
		if (topScore < 200) {
			System.out.println("topScore is less than 200");
		}
		
		if (topScore <= 100) {
			System.out.println("topScore is less or equal than 100");
		}
		
		
		
		// && is Logical AND operator
		// && means both conditions have to be true
	
		int firstScore = 80;
		int secondScore = 60;
		
		// firstScore > secondScore is the 1st operand 
		// firstScore <100 is the 2nd operand 
		// && between the operands means BOTH operands have to be TRUE,
		// meaning both those conditions have to be true
		if (firstScore > secondScore && firstScore <100) {
			System.out.println("Greater than secondScore and less than 100");
		}
		
		
		
		
		
		
		
		
	}

}
