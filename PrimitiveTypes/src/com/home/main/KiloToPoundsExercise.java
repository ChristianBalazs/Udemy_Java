package com.home.main;

public class KiloToPoundsExercise {

	public static void main(String[] args) {
		
		// Exercise :
		// Convert a given number of pounds to kilogram
		// 1 pound is equal to 0.45359237 of a kilogram
		
		
		double ratioConvert = 0.45359237d;
		int weightInPounds = 20;
		double weightInKilos = weightInPounds * ratioConvert;
		
		System.out.println(weightInPounds+" pounds of weight is " + weightInKilos + " in kg");
		
		
		

	}

}
