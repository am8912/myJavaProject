package javatest;

public class _FirstAndLastDigitSum {

	public static void main(String[] args) {
		
	}
    public static int sumFirstAndLastDigit(int number) {
     	if(number < 0) {
    		return -1;
    	}
    	int fistNumber = 0;
    	int lastNumber = number % 10 ; // 餘數為最後一個數
    	while(number >= 0) {
    		if(number < 10){
    		fistNumber = number;
    		}
    		number /= 10; // 去掉尾數
    	}
    	return fistNumber + lastNumber;
    }
}
