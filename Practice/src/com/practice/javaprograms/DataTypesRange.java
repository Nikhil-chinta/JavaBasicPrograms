package com.practice.javaprograms;

public class DataTypesRange {
	public static void main(String[] args) {
		int myValue = 1000;
		
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Integer minimum value = " + myMinIntValue);
		System.out.println("Integer maximum value = " + myMaxIntValue);
		System.out.println("Busted Max int value = "+ (myMaxIntValue + 1) );
		System.out.println("Busted Min int value = "+ (myMinIntValue - 1) );
		int myMaxIntTest = 2_14_74_83_647;
		System.out.println();
		
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte minimum value = "+ myMinByteValue);
		System.out.println("Byte maximum value = "+ myMaxByteValue);
		System.out.println();
		
		short myMinShortValue = Short.MIN_VALUE; 
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Short minimum value = "+ myMinShortValue);
		System.out.println("Short maximum value = "+ myMaxShortValue);
		System.out.println();
		
		long MyLongValue = 100L;
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Long minimum value = "+ myMinLongValue);
		System.out.println("Long maximum value = "+ myMaxLongValue);
		System.out.println();
		long bigLongLiteralValue = 2_14_74_83_64_234L;
		System.out.println(bigLongLiteralValue);
		System.out.println();
		
		short bigShortLiteralValue = 32767;
		
		int myTotal = (myMinIntValue / 2);
		
		byte myNewByteValue = (byte) (myMinByteValue / 2);
		
		short myNewShortValue = (short) (myMinShortValue / 2);
	}

}
 