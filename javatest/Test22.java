package javatest;

public class Test22 {

	public static void main(String[] args) {
		
//		int number = 0;
//		while (number < 50) {
//			number += 5;
//			if (number % 25 ==0) { // 排除被25整除的數
//				continue;
//			}
//			System.out.print(number + "_");
//		}
		int num = 4;
		int finishNumber = 20;
		int evenCount = 0; // 設定偶數變數數量
		int oddCount = 0; // 設定奇數變數數量
		
		// boolean condiction = true
		// condition是否 num 小於等於 finishNumber
		while(num <= finishNumber) {
			num++; // num會先+1,所以4+1=5才是第1個數字。
			if(!isEvenNumber(num)) {
				oddCount++;
				continue; // 排除非偶數的數字，繞過下一行。
			}
			System.out.println("Even number " + num);
			evenCount++;
			if(evenCount >= 5) {
				break;
			}
		}	
		System.out.println("Total odd numbers found = " + oddCount);
		System.out.println("Total even numbers found = " + evenCount);
// 回顧while statement		
		int number = 0;
		while(number < 15) {
			number++; // 初始數字為1
			
			if(number <= 5) {
				System.out.println("Skipping number " + number);
				continue;
			}
			System.out.println("number = " + number);
			
			if(number >= 10) {
				System.out .println("Breaking at " + number);
				break;
			}
			
		}
}
	
	public static boolean isEvenNumber(int num) {
		if((num % 2) == 0) {
			return true;
		}else {
			return false;	
		}
	}

}	
//		for(int i =1; i <= 5 ; i++) {
//			System.out.println(i);
//		}
//		int j = 1; // 另一種寫法(**)
//		while(j <= 5) {
//			System.out.println(j);
//			j++;
//		}
//		int j = 1;
//		boolean isReady = false;
//		do {
//			if(j > 5) {
//				break;
//			}System.out.println(j);
//				j++;
//				isReady = (j > 0);
//		}while(isReady) ; // while(condition)";"在結尾是必須的，do-while至少執行一次
		
//		另一種寫法(**)
//		int j = 1;
//		while(true) {
//			if(j > 5) {
//				break;
//			}
//			System.out.println(j);
//			j++;
//		}
	
//	for(init; expression; increment) {
//	}
	
//	while(expression){
//	}
	
// 	do{
//	}while(expression);
	
