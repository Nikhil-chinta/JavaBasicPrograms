package com.practice.Ifkeyword;

public class IfKeywordsAndCodeBlocks {
	public static void main(String[] args) {

		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		

//		if (score < 5000 && score > 1000) {
//			System.out.println("your score was less than 5000");
//		}else if(score < 1000){
//			System.out.println(" your score is less than 1000");
//		}
//		else {
//			System.out.println("got here");
//		}

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println(" Your final score was "+ finalScore);
		}
		
	}

}
