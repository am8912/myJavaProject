package javatest;

public class Test10 {

	public static void main(String[] args) {
		int highScore = calaulateHighScorePosition(1500);
		displayHighScorePosition("Tim",highScore);
		
		highScore = calaulateHighScorePosition(499);
		displayHighScorePosition("Bob",highScore);
		
		highScore = calaulateHighScorePosition(99);
		displayHighScorePosition("Sam",highScore);
		
		highScore = calaulateHighScorePosition(-1000);
		displayHighScorePosition("Ann",highScore);
	}
	public static void displayHighScorePosition(String playerName,int playerHighScorePosition) {
		System.out.println(playerName + " managed to get into " +  playerHighScorePosition + " on the high score list");
		
	}
	public static int calaulateHighScorePosition(int playerScore){
		int position =0;
		if(playerScore >= 1000) {
			position = 1 ;
		}else if(playerScore >= 500){
			position = 2;
		}else if(playerScore >=100){
			position = 3;
		}
			return position; 
	
	}
}
