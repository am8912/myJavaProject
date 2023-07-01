package javatest;

public class Test21 {

	public static void main(String[] args) {
		back(10);
//		printStarPattern(10);
//		testPrintStar(10);
//		calculateFactorial(3);
//		System.out.println(calculateFactorial(5));
		
		// 本地的變數跟範圍
		int i = 0;
		boolean isLoginIn = true;
		while(isLoginIn) {
			System.out.println("user login");
			if(i==5) {
				isLoginIn = false;
			}
			i++;
		}
	}
//	public static void back(int num) {
//
//		String star = "*";
//		for(int j = num ; j > 0 ; j--) {
//			for(int i = j; i > 0 ; i--) {
//				star += "*";
//			}
//		}
//		System.out.println(star);
//		star = "";
//	}
	
    /*
     *  印出倒著的階梯
     */
	public static void back(int num) { // Layer
	    
	    for (int j = num; j > 0; j--) { // Step1.第一圈迴圈控制要跑幾層
	    	String star = ""; // Step2.每次新的"層"要清空上一層的星星
	        for (int i = j; i > 0; i--) { // Step3.第2個迴圈組出星星的長度
//	        	System.out.println("要跑"+j+"星星"); // (第9層需要9個"*")
	            star += "*";
	        }
	        System.out.println(star); 
//	        star = "";
	    }
	}
	
//	public static int calculateFactorial(int num) {
//		if(num < 1) {
//			return num;
//		}
//		int count = 0 ;
//		int sum = num;
//		for(int i = num; i >= 1; i--){
//			System.out.println(i);
//		 	
//		}
//		return "" + System.out.println(i);
//	}
	
    /*
     *  算出參數的階層(乘積)
     *  請使用迴圈計算並輸出給定數字的階乘。階乘是指所有小於等於該數字的正整數的乘積。
     *  例如，5 的階乘為 5! = 5 * 4 * 3 * 2 * 1 = 120。
     */
	public static int numberCount(int num) {
		int result = 1; // 要回傳的結果
		
		int i = 1;
		while(i <= num) {
			result = result*i;
			i++;
		}
//		for(int i = 1; i <= num; i++) {
//			result = result*i; // 宣告int i=1 一路乘到丟進來的參數num
//		}
		return result;
	}
}	
