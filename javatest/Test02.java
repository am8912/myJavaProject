package javatest;

public class Test02 {

	public static void main(String[] args) {
		boolean gameOver = false;
		int score = 2000;
		int levelCompleted = 5;
		int bonuce = 100;

		// ||(或)&&(並)

		if (score > 1000 && score < 5000) {
			System.out.println("分數在1000~5000之間");
		} else if (score < 1000) {
			System.out.println("分數小於1000");
		} else {
			System.out.println("無法判斷");
		}
		compareNumber(30, 25);
	}

	// yourScoreRange
	// Method 方法
	public static void compareNumber(int a, int b) {
		if (a > b) {
			System.out.println("第一個參數值比較大");
		} else {
			System.out.println("第二個參數值比較大");
		}
	}

	// 5-41-------------------------------------------

	public static void mainTest01(String[] args) {
		double kilometer = (100 * 1.609344);
		int highScore = 50;
		if (highScore > 25) {
			highScore = 1000 + highScore; // add bonus points
		}
		int health = 10;
		if ((health < 25) && (highScore > 1000)) {
			highScore = highScore - 1000;
		}
	}

	public static void mainTest02(String[] args) {
		int myVariable = 50;
		myVariable++;
		myVariable--;
		System.out.println("This is test");

	}

}
