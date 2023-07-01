package javatest;

public class Test17 {

	public static void main(String[] args) {
		printDayOfWeek(0);	
		printDayOfWeek(1);
		printDayOfWeek(2);
		printDayOfWeek(3);
		printDayOfWeek(4);
		printDayOfWeek(5);
		printDayOfWeek(6);
		printDayOfWeek(7);
		printWeekDay(0);
		printWeekDay(1);
		printWeekDay(2);
		printWeekDay(3);
		printWeekDay(4);
		printWeekDay(5);
		printWeekDay(6);
		printWeekDay(7);
		
//	int value = 3;
//	if (value == 1){
//		System.out.println("Value was 1");
//	}else if(value == 2){
//		System.out.println("Value was 2");
//	}else {
//		System.out.println("Value was 2");
//	}
	
//	The switch statement
	
//	switch(value) {
//		case x:
	//code for value == x
//			break;
//		case y:	
	//code for value == y
//			break;
//		defaut;	
	//code for value not equal to x or y
//	}
	int switchValue = 3;
	
	switch(switchValue) {
		case 1: // 冒號!!
			System.out.println("Value was 1");
			break;
		case 2:
			System.out.println("Value was 2");
			break;
		case 3: case 4: case 5:
			System.out.println("Was a 3, a 4, or a 5");
			System.out.println("Actually it was a " + switchValue);
			break; // 如果沒有break statement會繼續往下print出結果
		default:
			System.out.println("Was not 1, 2, 3, 4, or 5");
			break;
		}
	char charValue = 'A';
	switch(charValue) {
		case 'A':
			System.out.println("A is able");
			break;
		case 'B':
			System.out.println("B is baker");
			break;
		case 'C':
			System.out.println("C is charlie");
			break;
		case 'D':
			System.out.println("D is dog");
			break;
		case 'E':
			System.out.println("E is easy");
			break;
		default:
			System.out.println("Letter " + charValue + " was not found in the switch");
			break;
		
	}
		
	 // long、float、double、boolean不能使用
	
//	switch(switchValue) {
//	case 1 -> System.out.println("Value was 1");
//	case 2 -> System.out.println("Value was 2");
//	case 3,4,5 ->{
//		System.out.println("Was a 3, a 4, or a 5");
//		System.out.println("Actually it was a " + switchValue);
//		}
//	default -> System.out.println("Was not 1, 2, 3, 4, or 5");
//	} Java14 only
	
	String month = "APRIL";
	System.out.println(month + " is in the " + getQuarter(month) + " quarter");
}	
	public static String getQuarter(String month) {
		switch(month) {
			case "JANUARY":
			case "FEBRUARY":
			case "MARCH":
				return "1st";
			case "APRIL":
			case "MAY":
			case "JUNE":
				return "2nd";
			case "JULY":
			case "AUGUST":
			case "SEPTEMBER":
				return "3rd";
			case "OCTOBER":
			case "NOVEMBER":
			case "DECENBER":	
				return "4th";
		}
		return "bad";
//		
//		switch(month) {
//		case "JANUARY", "FEBRUARY", "MARCH" -> { yield "1st"; } 另一種寫法
//		case "APRIL", "MAY", "JUNE" -> "2nd";
//		case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
//		case "OCTOBER", "NOVEMBER", "DECENBER" -> "4th";
//		default -> {
// 			String badResponse = month + "is bad";
//			yield badResponse;
//		}
	}
	public static String printDayOfWeek(int day) {
	   String dayOfWeek;
	    switch (day) {
        case 0:
            dayOfWeek = "Sunday";
            break;
        case 1:
            dayOfWeek = "Monday";
            break;
        case 2:
            dayOfWeek = "Tuesday";
            break;
        case 3:
            dayOfWeek = "Wednesday";
            break;
        case 4:
            dayOfWeek = "Thursday";
            break;
        case 5:
            dayOfWeek = "Friday";
            break;
        case 6:
            dayOfWeek = "Saturday";
            break;
        default:
            dayOfWeek = "Invalid Day";
    }

	    System.out.println(day + " stands for " + dayOfWeek);
	    return dayOfWeek;
	
//	public static String printDayOfWeek (int day) {
//		String dayOfWeek = switch(day) {
//			case 0 -> { yield "Sunday";}
//			case 1 -> "Monday";
//			case 2 -> "Tuesday";
//			case 3 -> "Wednesday";
//			case 4 -> "Thursday";
//			case 5 -> "Friday";
//			case 6 -> "Saturday";
//			default -> "Invalid Day";
//			};
//			
//			System.out.println(day + " stand for " + dayOfWeek);
//		}
	}
	public static String printWeekDay(int day) {
		String dayOfWeek = "Invalid Day";
		if (day == 0) {
			dayOfWeek = "Sunday";
		}else if(day == 1) {
			dayOfWeek = "Monday";
		}else if(day == 2) {
			dayOfWeek = "Tuesday";
		}else if(day == 3) {
			dayOfWeek = "Wednesday";
		}else if(day == 4) {
			dayOfWeek = "Thursday";
		}else if(day == 5) {
			dayOfWeek = "Friday";
		}else if(day == 6) {
			dayOfWeek = "Saturday";
		}
		return day + " stand for " + dayOfWeek;
	}
}
