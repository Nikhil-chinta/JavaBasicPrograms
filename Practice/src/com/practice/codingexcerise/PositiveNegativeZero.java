package com.practice.codingexcerise;

import java.awt.Checkbox;

import org.omg.CORBA.PUBLIC_MEMBER;

public class PositiveNegativeZero {
	
	public static void checkNumber(int number) {
		if(number > 0) {
			System.out.println("positive");
		}else if (number < 0) {
			System.out.println("negative");
		}
//		else if (number == 0) {
//			System.out.println("zero");
//		}
		else {
			System.out.println("zero");
		}
	}
	
	public static void main(String[] args) {
		checkNumber(0); 
	
	}

	

}
