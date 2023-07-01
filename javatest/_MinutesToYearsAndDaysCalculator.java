package javatest;

public class _MinutesToYearsAndDaysCalculator {

	public static void main(String[] args) {
		printYearsAndDays(50000000);
	}
	public static void printYearsAndDays(long minutes) {
		long yy = (int)(minutes / 525600);
		long zz = (int)((minutes % 525600)/1440);
		if(minutes < 0) {
			System.out.println("Invalid Value");
		}else {
			System.out.println(minutes + " min = " + yy + " y and " + zz + " d");
		}
	}
}
