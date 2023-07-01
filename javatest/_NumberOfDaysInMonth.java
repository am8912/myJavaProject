package javatest;

public class _NumberOfDaysInMonth {

	public static void main(String[] args) {
		getDaysInMonth(5,2018);
		System.out.print(getDaysInMonth(2,2017));
	}

	public static boolean isLeapYear(int year) {
		int step1 = year % 4;
		int step2 = year % 100;
		int step3 = year % 400;
		if (year < 1 && year > 9999) {
			return false;
		} else if (step1 == 0 && (year >= 1 && year <= 9999)) {
			if (step2 == 0 && (year >= 1 && year <= 9999)) {
				if (step3 == 0 && (year >= 1 && year <= 9999)) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	public static int getDaysInMonth(int month, int year) {
		if (month < 1 || month > 12) {
			return -1;
		}
		if (year < 1 || year > 9999) {
			return -1;
		}
		switch (month) {
		case 2:
			if (isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}
		case 4: 
		case 6:
		case 9:
		case 11:
			return 30;
		default: 
			return 31;
		}
	}	
//	public static int getDaysInMonth(int month, int year) {
//		if(month < 1 || month > 12 ) {
//			return -1;
//		}	
//		if(year < 1 || year > 9999) {
//			return -1;
//		}
//		switch(month){
//			case 2:
//				if(isLeapYear(2)) {
//					return 29;
//				}else {
//					return 28;
//				}	
//			case 4:	
//			case 6:	
//			case 9:	
//			case 11:
//				return 30;
//			default:
//				return 31;
//		}
//	}
}	
