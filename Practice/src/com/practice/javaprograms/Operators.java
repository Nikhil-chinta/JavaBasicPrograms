package com.practice.javaprograms;

public class Operators {

	public static void main(String[] args) {

		int result = 1 + 2; // 1 + 2 = 3

		System.out.println("1 + 2 is " + result);
		int previousResult = result;
		System.out.println("previousResult = " + previousResult);
		result = result - 1; // 3 - 1 = 2
		System.out.println("3 - 1 = " + result);
		System.out.println("previousResult = " + previousResult);

		result = result * 10; // 2 * 10 = 20
		System.out.println("2 * 10 = " + result);

		result = result / 5; // 20 / 5 = 4
		System.out.println("20 / 5 = " + result);

		result = result % 3; // 4 % 3 = 1 % returns the remainder.
		System.out.println("4 % 3 = " + result);

		// result = result +1;
		result++; // 1 + 1 = 2
		System.out.println("1 + 1 = " + result);

		result--; // 2 - 1 = 1;
		System.out.println("2 - 1 = " + result);

		// result = result + 2
		result += 2; // 1 + 2 = 3
		System.out.println("1 + 2 = " + result);

		// result = result * 10
		result *= 10; // 3 * 10 = 30
		System.out.println("3 * 10 = " + result);

		// result = result / 3
		result /= 3; // 30 / 3 = 10
		System.out.println("30 / 3 = " + result);

		// result = result - 2
		result -= 2; // 10 - 2 = 8
		System.out.println("10 - 2 = " + result);

		boolean isAlien = false;
		if (isAlien == false) {
			System.out.println("It is not an alien!");
			System.out.println("and I am scared of aliens");
		}

		int topScore = 80;
		if (topScore < 100) {
			System.out.println("You got high score");
		}
		// && operator ( And)
		int secondTopScore = 81;
		if ((topScore > secondTopScore) && (topScore < 100)) {
			System.out.println("greater than second top score and less than 100");
		}

		// ||operator ( OR)
		if ((topScore > 90) || (secondTopScore <= 90)) {
			System.out.println("either or both of the conditions are true");
		}

		int newValue = 50;
		if (newValue == 50) {
			System.out.println(" This is true ");
		}

		boolean isCar = false;
		if (isCar) {
			System.out.println("isCar is not true!!");
		}

		// ternary operator
		isCar = true;
		boolean wasCar = isCar ? true : false;
		if (wasCar) {
			System.out.println("wasCar is true");
		} else {
			System.out.println("wasCar is false");
		}

		double firstDoubleValue = 20.00d;
		double secondDoubleValue = 80.00d;
		double resultDoubleValue = ((firstDoubleValue + secondDoubleValue) * 100.00d);
		System.out.println(" resultDoubleValue  is : " + resultDoubleValue);
		double remainderOfResult = resultDoubleValue % 40.00d;
		System.out.println(" remainderOfResult  is : " + remainderOfResult);
		boolean newBoolValue = (remainderOfResult == 0) ? true : false;
		System.out.println("newBoolValue is : " + newBoolValue);
		if (!newBoolValue) {
			System.out.println(" remainder is 0");
		} else {
			System.out.println(" got some remainder");
		}

	}

}
