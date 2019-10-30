package com.practice.methodoverloading;

public class Main {
	public static void main(String[] args) {
		calculateScore("Nik", 500);
		calculateScore(10);
		calculateScore();
	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player "+ playerName + " scored " + score + " points.");
		return score * 5000;
	}
	
	public static int calculateScore( int score) {
		System.out.println("Unnamed Player scored " + score + " points.");
		return score * 5000;
	}
	public static int calculateScore( ) {
		System.out.println("No player name and score");
		return 0;
	}
	
	public static void calculatescore( ) {
		
	}

}
