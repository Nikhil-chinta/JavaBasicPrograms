package com.practice.javaprograms;

public class FloatAndDouble {
	public static void main(String[] args) {
		
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Float minimum value = "+ myMinFloatValue);
		System.out.println("Float maximum value = "+ myMaxFloatValue);
		System.out.println();
		
		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("Double minimum value = "+ myMinDoubleValue);
		System.out.println("Double maximum value = "+ myMaxDoubleValue);
		System.out.println();
		
		
		int myIntValue = 5 / 3;
		float myFloatValue = 5f / 3f;
		double myDoubleValue = 5d / 3d;
		System.out.println("myIntValue = "+ myIntValue);
		System.out.println("myFloatValue = "+ myFloatValue);
		System.out.println("myDoubleValue = "+ myDoubleValue);
		System.out.println();
		
		
		double numberOfPounds = 200d;
		double convertedKilograms = numberOfPounds * 0.45359237d;
		System.out.println("Converted kilograms = "+ convertedKilograms);
		
		
	}

}
