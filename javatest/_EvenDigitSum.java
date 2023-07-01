package javatest;

public class _EvenDigitSum {

	public static void main(String[] args) {
		getEvenDigitSum(10);
		System.out.println(getEvenDigitSum(10));

	}
	public static int getEvenDigitSum(int number) {
		if(number<0) {
			return -1;
		}
		int sum = 0; // 初始化偶數合為0
		while(number > 0) {
			int digit = number % 10;
			if(number % 2 == 0) {
				sum += digit;
			}
			number /= 10;
		}
		return sum; 
	}
}
