package main;

public class Variables {

	public static void main(String[] args) {
		
		
		// Use a declaration statement to define a variable 
		// int is the data type (whole number)
		// myFirstNumber is the name of the variable
		// = is the assign operator
		// 5 is the value assigned to the variable
		
		// Java will create a memory location in RAM to store the variable
		// everything to the RIGHT of = equal sign is called an Expression
		int myFirstNumber = 5;				
		// use println command to print the value of the myFirstNumber, get 5 
		System.out.println(myFirstNumber);
		
		
		// if we use "myFirstNumber" between quotes we get the text printed not the value of the variable
		// when using "" double quotes that is a string literal , not a variable
		System.out.println("myFirstNumber");
		
		
		// use a different expression for the variable 
		int mySecondNumber = 10+5;		
		System.out.println(mySecondNumber);// get 15
		
		
		// use a more complex expression 
		int myThirdNumber = (10 + 5) * 10 + 2;
		System.out.println(myThirdNumber);// get 152
		
		
		// Can create a new variable to store the sum of previous variables
		int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
		System.out.println(myTotal);
		
		int myLastOne = 1000 - myTotal;
		System.out.println(myLastOne);// get 828

	}

}
