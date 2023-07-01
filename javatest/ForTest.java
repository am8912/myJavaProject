package javatest;

public class ForTest {

	public static void main(String[] args) {
		
		// 迴圈
		for(int number = 1;number < 7;number += 2)
			System.out.println("number = " + number);
		
//		for(int i = 1; i <= 100; i++) { // (初始化;條件;更新)
//			System.out.println(i + ",");
		String star = "*";	
		for	(int i = 1; i <= 5; i++){ // 只單純用來控制迴圈的數量
		  	System.out.println(star);
		  	star += "*";
		}	
		for(int i = 1; i <= 5; i++) { // (初始化;條件;更新)
			for(int j = 1; j <= 3; j++) {
				System.out.println(j);
			}
		  	
		}
		for(int i = 1; i <= 9; i++) {
//			System.out.println(i);
			for(int c = 1; c <= 9; c++) {
				int sum = multiplication(i,c);
				System.out.print(" "+i + " * " + c + " = " + sum+" "); // System.out.println("c的迴圈")
			}
//			System.out.println("i的迴圈最後");
			System.out.println();
		}
		testPrintStar(19);
	}
	
	public static void testPrintStar(int layer) {
		String star = "*";
		for	(int i = 1; i <= layer; i++){
			System.out.println(star);
		  	star += "*";
		}
	}
	
	public static int multiplication (int foreNum, int afterNum) {
		return foreNum * afterNum;
	}
	
}
