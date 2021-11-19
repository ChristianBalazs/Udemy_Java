package com.home.main;

public class PrimitiveTypesExercise {

	public static void main(String[] args) {
		
		// To do :
		// create a byte variable with a valid byte number
		// create a short variable with a valid short number
		// create a int variable with a valid int number
		// create a long variable equal to 50000 plus 10 times the sum of byte + short+int
		
		
		//Solution:
		
		
		byte myByteNo = 10;
		short myShortNo = 20;
		int myIntNo = 50;
		
		long myLongTotal = 50000L + 10*(myByteNo + myShortNo + myIntNo);
		
		System.out.println(myLongTotal);//get 50800
		
		//If we use short instead of long we get an error, so we need to cast the expression from int to short type
		//short myShortTotal = 1000 + 10*(myByteNo + myShortNo + myIntNo);
		
		//After casting:
		short myShortTotal = (short) (1000 + 10*(myByteNo + myShortNo + myIntNo));
		System.out.println(myShortTotal); //get 1800
		
		//int is the best data type to use with Java most of the time

	}

}
