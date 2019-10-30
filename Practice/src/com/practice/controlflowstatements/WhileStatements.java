package com.practice.controlflowstatements;

public class WhileStatements {
	public static void main(String[] args) {
//		int count = 0;
//		while(count != 6) {
//			System.out.println("count value is "+ count);
//			count++;
//		}
//		
//		count=1;
//		while(true) {
//			if(count == 6) {
//				break;
//			}
//			System.out.println("count value is "+ count);
//			count++;
//		}
//		
		//do while loop
//		count = 1;
//		do {
//			System.out.println("count value was "+ count);
//			count++;
//		}while(count !=6);
		
//		int number = 4;
//		int finishNumber = 20;
//		
//		
//		while(number <= finishNumber) {
//			number++;
//			if(!isEvenNumber(number)) {
//				continue;
//			}
//			System.out.println("even number "+ number);
//		}
		
		
		
		int number = 4;
		int finishNumber = 20;
		int evenNumbersFound = 0;
		
		
		while(number <= finishNumber) {
			number++;
			if(!isEvenNumber(number)) {
				continue;
			}
			System.out.println("even number "+ number);
			evenNumbersFound++;
			if(evenNumbersFound >= 5) {
				break;
			}
		}
		System.out.println("total even numbers found  = "+ evenNumbersFound);
				
	}
	
	public static boolean isEvenNumber(int number) {
		if((number % 2) == 0) {
			return true;
		}else {
		return false;
		}
	}

}
