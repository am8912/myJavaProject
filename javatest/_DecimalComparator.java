package javatest;

public class _DecimalComparator {

	public static void main(String[] args) {
		areEqualByThreeDecimalPlaces(5.123,6.123);
		System.out.println(areEqualByThreeDecimalPlaces(5.132,6.123));

	}
	public static boolean areEqualByThreeDecimalPlaces(double a,double b) {
		if((int)(a*1000) == (int)(b*1000)){
			return true;
		}else {
			return false;
		}
	}
	// Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
	// The method should return boolean and it needs to return true if two double numbers 
	// are the same up to three decimal places. 
	// Otherwise, return false.
}
