package javatest;

public class Test06 {

	public static void main(String[] args) {
		
		boolean gameover = true;
		int score = 10000;
		int levelCompleted = 8;
		int bonus = 200;
		int finalScore = score;
		
		if(gameover) {
			finalScore += levelCompleted * bonus;
			finalScore += 1000;
			System.out.println("Your final score was " + finalScore);
		
		int highScore = calculateScore(true,800,5,100);
		System.out.println("The highScore is " + highScore);
		// The highScore is 2300
		
		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		finalScore = score;
		
		System.out.println("The next highScore is " + 
		calculateScore(gameover,score,levelCompleted,bonus));
		// The next highScore is 12600
		
		}
	}
	public static int calculateScore(boolean gameover,int score,int levelCompleted,int bonus) {
				
		int finalScore = score;
		
		if(gameover) {
			finalScore += levelCompleted * bonus;
			finalScore += 1000;
				
		}
		return finalScore;
	}
	public static boolean isTooYoung(int age) {
		boolean result = false;
		if(age<21) {
			return true;
		}
		return result;
	}


}
