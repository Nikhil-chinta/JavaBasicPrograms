package com.practice.javaprograms;

public class PrimitiveTypesChallenge {
	
	public static void main(String[] args) {
		
		byte byteValue = 10;
		short shortValue = 20;
		int intValue = 50;
		
		long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
		System.out.println(longTotal);
		System.out.println();
		
		short shortTotal = (short) (1000 + 10 * (byteValue + intValue + shortValue));
		System.out.println(shortTotal);
	}
}
