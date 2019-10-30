package com.practice.controlflowstatements;

public class SwitchStatements {
	public static void main(String[] args) {
		//int value = 3;
//		if(value == 1) {
//			System.out.println("value is 1");
//		}else if(value == 2) {
//			System.out.println(" value is 2");
//		}else {
//			System.out.println("was not 1 or 2");
//		}
		
//		int switchValue = 3;
//		switch (switchValue) {
//		case 1:
//			System.out.println("value was 1");
//			break;
//		case 2: 
//			System.out.println("value was 2");
//			break;
//		
//		default:
//			System.out.println("was not 1 or 2");
//			break;
//		}
		
		char charValue = 'E';
		switch (charValue) {
		case 'A':
			System.out.println("It is A");			
			break;
		case 'B':
			System.out.println("It is B");
			break;
		case 'C':
			System.out.println("It is C");
			break;
		case 'D':case 'E':
			System.out.println("It is "+ charValue);
			break;
		

		default:
			System.out.println("A, B, C, D or E was not typed");
			break;
		}
		
	}

}
