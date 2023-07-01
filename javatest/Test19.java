package javatest;

public class Test19 {

	public static void main(String[] args) {
		System.out.println("0 is " + (isPrime(0)?"":"NOT")+" a prime number ");
		System.out.println("1 is " + (isPrime(1)?"":"NOT")+" a prime number ");
		System.out.println("2 is " + (isPrime(2)?"":"NOT")+" a prime number ");
		System.out.println("3 is " + (isPrime(3)?"":"NOT")+" a prime number ");
		System.out.println("7 is " + (isPrime(7)?"":"NOT")+" a prime number ");
		System.out.println("9 is " + (isPrime(9)?"":"NOT")+" a prime number ");
		

		int count = 0;
		for (int i = 10; i <= 50; i++) { //	for (int i = 10; count < 3 && i <= 50; i++)也可以寫成這樣，就只會print出前3個值
			if (isPrime(i)) {
				System.out.println("Number " + i + " is a prime number");
				count++;
				if(count == 3) {
					System.out.println("Found 3 - Exiting for loop");
					break;
				}
			}
		}
		System.out.println("Total number of prime numbers between 10 and 50 is " + count);
		
	}

	public static boolean isPrime(int wholeNumber) {
		if (wholeNumber <= 2) { // 0、1不是質數
			return (wholeNumber == 2);
		}
		for (int divisor = 2; divisor < wholeNumber; divisor++) {
			if (wholeNumber % divisor == 0) {
				return false;
			}
		}
		return true;
	}
//	題目 The For Loop Challenge
//	Create a prime number counter variable, that will keep count of how many prime numbers
//	were found.
//	Create a for statement, using any range of numbers, where the maximum number is <=
//	1000.
//	For each number in the range:
//	ㆍCheck to see if it's a prime number using the isPrime method.
//	ㆍIf the number is prime, print it out and increment the prime number counter variable.
//	ㆍOnce the prime number counter equals three, exit the loop (Hint, use the break
//	statement to exit).	

}
