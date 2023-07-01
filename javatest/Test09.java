package javatest;

public class Test09 {

	public static void main(String[] args) {
		int highScore = calaulateHighScorePosition(1500);
		displayHighScorePosition("Tim",highScore);
		
		highScore = calaulateHighScorePosition(500);
		displayHighScorePosition("Bob",highScore);
		
		highScore = calaulateHighScorePosition(100);
		displayHighScorePosition("Sam",highScore);
		
		highScore = calaulateHighScorePosition(25);
		displayHighScorePosition("Ann",highScore);
	}
	public static void displayHighScorePosition(String playerName,int playerHighScorePosition) {
		System.out.println(playerName + " managed to get into " +  playerHighScorePosition + " on the high score list");
		
	}
	public static int calaulateHighScorePosition(int playerScore){
		if(playerScore >= 1000) {
			return 1 ;
		}else if(playerScore >= 500 && playerScore < 1000){
			return 2;
		}else if(playerScore >=100 && playerScore < 500){
			return 3;
		}else {
			return 4;
		}
		
	} 
}
