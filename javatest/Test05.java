package javatest;

public class Test05 {

	public static void main(String[] args) {
		//boolean gameover = true;
		//int score = 800;
		//int levelCompleted = 5;
		//int bonus = 100;
		//int finalScore = score;
		
		//if(gameover == true) {
		//	finalScore += (levelCompleted * bonus);
		//	System.out.println("Your final score was " + finalScore);
		// Your final score was 1300	
		
		//boolean gameover = true;
		//int score = 10000;
		//int levelCompleted = 8;
		//int bonus = 200;
		//int finalScore = score;
	
		//if(gameover = true) {
		//	finalScore += levelCompleted * bonus;
		//	System.out.println("Your final score was " + finalScore);
		// Your final score was 11600
		boolean gameover = true;
		int score = 10000;
		int levelCompleted = 8;
		int bonus = 200;
		int finalScore = score;
		
		if(gameover) {
			finalScore += levelCompleted * bonus;
			finalScore += 1000;
			System.out.println("Your final score was " + finalScore);
		
		calculateScore(true,800,5,100);
		// 避免複製錯誤，可命名新的method，並把前面if陳述句刪除。下方新定義的method會由灰色轉為黑色。
		//if(gameover = true) {
		//	finalScore += levelCompleted * bonus;
		//	System.out.println("Your final score was " + finalScore);
		
		
		}
	// public static void methodName(p1type p1, p2type p2,{more}) {
		// Method statements form the method body
	}
	public static void calculateScore(boolean gameover,int score,int levelCompleted,int bonus) {
		// calculateScore(true,800,5,100)
		// boolean gameover = true;
		// int score = 800;
		// int levelCompleted = 5;
		// int bonus = 100;
		
		int finalScore = score;
		
		if(gameover) {
			finalScore += levelCompleted * bonus;
			finalScore += 1000;
			System.out.println("Your final score was " + finalScore);
		
		}
		
		// Method return type is a declared data type for the data that
		// willbe returned from the method
	// public static datatype methodName(p1type p1, p2type p2,{more}) {
		
		// datatype:void 不會返回任何數據
		// Method statements
		
		//;
	// } return value
	}
	// public static int calculateMyAge(int dateOfBirth) {
		// return (2023-dateOfBirth); 
		// 返回整數int為可行的
	


}
