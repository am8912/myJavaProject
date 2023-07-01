package javatest;

public class Test18 {

	public static void main(String[] args) {
		for(int counter = 1;counter <=5;counter++) {
			System.out.println(counter);
		}
		for(double rate = 2.0; rate <= 5.0; rate++) {
			double interAmount = calculateInterest(10000.0,rate);
			System.out.println("10,000 at " + rate + "% interest = " +interAmount);
		}
		for(double rate = 7.5; rate <= 10; rate += 0.25) {
			double interAmount = calculateInterest(100.00,rate);
			if(interAmount>8.5) { // 假設利率只算到8.5的寫法
				break;
			}
			System.out.println("$ 100.00 at " + rate + "% interest = $" +interAmount);
		}
		

	}
	public static double calculateInterest(double amount,double interestRate) {
		return  (amount * (interestRate / 100));
	}
	
}
