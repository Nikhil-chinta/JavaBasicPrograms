package com.practice.parsingvaluefromstring;

public class Parsing {
	
	public static void main(String[] args) {
		String numberAsString = "2019.125";
		System.out.println("numberAsString = "+ numberAsString);
		
	//	int number = Integer.parseInt(numberAsString);
		double number = Double.parseDouble(numberAsString);
		
		System.out.println("number = "+ number);
		
		numberAsString += 1;
		number += 1;
		System.out.println("numberAsString = "+ numberAsString);
		System.out.println("number = "+ number);
	}

}
