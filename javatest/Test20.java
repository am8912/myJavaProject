package javatest;

public class Test20 {

	public static void main(String[] args) {
		
		int count = 0;
		int sum = 0;
		for(int i = 1; i < 1000; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				count++;
				sum += i; // 將i加到sum上
				System.out.println("Found a mach = " + i);
			}
			if(count == 5) {
				break;	
			}
			
		}
		System.out.println("sum = " + sum);
	}

//  錯誤示範
//	for(int number = 100; number > 0; number +=10) {
//		System.out.println(number);
//		中間的質設定錯誤，會導致循環到integer的最大值且溢出循環到最小值。
//	}	
	
//	題目 Sum 3 and 5 Challenge
//	 ㆍCreate a for loop using a range of numbers from 1 to 1000 inclusive.
//	 ㆍSum all the numbers that can be divided by both 3 and 5.
//	 ㆍPrint out the numbers that have met the above conditions.
//	 ㆍBreak out of the loop once you have found 5 numbers that met the conditions above.
}
