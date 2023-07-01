package javatest;

public class MethodOverLoading {

	public static void main(String[] args) {
		hasEqualSum(2,3,5);
		intcalculateScore("Tim",500); // String要記得""!!!!!!!!
		int newScore = intcalculateScore("Tim",500);
		System.out.println(newScore); // 500000
		intcalculateScore(7);
		System.out.println("5ft, 8in = " + convertToCentimeters(5,8) + " cm ");
		System.out.println("68in = " + convertToCentimeters(68) + "cm ");
		
	}
	
	//(點一下method -> ALT + SHIFT + J)
	/**
	 * 比較第1個+第2個是否等於第3個
	 * @param no1
	 * @param no2
	 * @param no3
	 * @return
	 */
	public static boolean hasEqualSum (int no1, int no2, int no3){
		if((no1 + no2)== no3){
         return true;
		}else {
         return false;
      }
	}
	/**
	 * 比較第1個+第2個是否等於第3個+第4個
	 * @param no1
	 * @param no2
	 * @param no3
	 * @param no4
	 * @return
	 */
	public static boolean hasEqualSum (int no1, int no2, int no3, int no4){
		if((no1 + no2)== (no3 + no4)){
         return true;
		}else {
         return false;
      }
	}
// Ctrl + Shift + C 把所選的範圍全部註解掉
//	public static void doSomething(int parameterA) {
//		method body
//		}
//	public static void doSomething(float parameterA) {
//		method body
//		}
//	public static void doSomething(int parameterA, float parameterB) {
//		method body
//		}
//	public static void doSomething(float parameterA, int parameterB) {
//		method body
//		}
//	public static void doSomething(int parameterA, int parameterB, int parameterC, float parameterD){ {
//		method body
//		}
//5-51--------------------------------------------------
	
	public static int intcalculateScore(String playerName, int score) {
		System.out.println("Player " + playerName + " scored " + score + " points");
		return score * 1000;
	}
	public static int intcalculateScore(int score) {
		System.out.println("Unnamed player scored " + score + " points");
		return score * 1000;
	}
	public static double convertToCentimeters(int inches) {
		return inches * 2.54 ;
	}
	public static double convertToCentimeters(int inches, int feet) {
		// return  convertToCentimeters((feet * 12) + inches) ;
		int feetToInches = feet * 12;
		int totalInches = feetToInches + inches;
		double result = convertToCentimeters(totalInches);
		return result;
	}
	
	
}
