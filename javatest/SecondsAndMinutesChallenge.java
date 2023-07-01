package javatest;

public class SecondsAndMinutesChallenge {

	public static void main(String[] args) {

//		getDurationString(100);
//		getDurationString(100,20);
//		double hours = (int)(getDurationString(100,20) / 60);
//		double newminutes = (getDurationString(100,20) % 60);
//		double newseconds = 100 % 60;
//		System.out.println(hours+ "h " + newminutes + " m " + newseconds + "s ");
		getDurationString(3945);
		System.out.println(getDurationString(3945)); // This is the first case
		System.out.println(getDurationString(65,45)); // This is the second case
		System.out.println(getDurationString(-1));
		
	}
	public static String getDurationString(int seconds) {
		
		if(seconds < 0) {
			return "Invalid data for seconds(" + seconds + "), must be a positive integer value.";
		}
		
		// Two step approach to get hours
		int minutes = seconds / 60;
//		int hours = minutes / 60;
//			System.out.println("hours = " + hours);
		
//		int remainingMinutes = minutes % 60;
//			System.out.println("minutes = " + minutes);
//			System.out.println("remainingMinutes = " + remainingMinutes);
		
//		int remainingSeconds = seconds % 60;
//			System.out.println("remaingSeconds = " + remaingSeconds);	
		
//		return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s ";
		return getDurationString( seconds, minutes);
		
		// One step approach to get hours
//		int hours1 = seconds / 3600;
//		System.out.println("hours1 = " + hours1);
	}
	public static String getDurationString(int seconds, int minutes) {
		
		if (minutes < 0) {
			return "Invalid data for minutes(" + minutes + "), must be a positive integer value.";
		
		}if (seconds <=0 || seconds >= 59) {
			return "Invalid data for seconds(" + seconds + "), must be between 0 and 59.";
		}
		
//		int minutes = seconds / 60; up 第2個方法中因為有相同的參數名稱，所以可直接刪掉
		int hours = minutes / 60;
		
		int remainingMinutes = minutes % 60;
		int remainingSeconds = seconds % 60;
		
		return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s ";
	}
	
//	public static double getDurationString(int seconds) {	
//		return seconds / 60;
//	}
//	public static double getDurationString(int seconds, int minutes) {
//		return minutes + getDurationString(seconds);
//	}
			
}
