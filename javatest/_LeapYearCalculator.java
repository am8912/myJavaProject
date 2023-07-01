package javatest;

public class _LeapYearCalculator {

	public static void main(String[] args) {
		isLeapYear(1800);
		System.out.println(isLeapYear(1800));
	}
    public static boolean isLeapYear(int year) {
		
		if(year <= 0 && year > 9999) {
			return false;
		}else if(year % 4 != 0 && (year > 0 && year <= 9999)){
			return false;
		}else if(year % 4 == 0 && year % 100 != 0 && (year > 0 && year <= 9999)){
			return true;
		}else if(year % 4 == 0 && year % 100 == 0 && year % 400 != 0 &&(year > 0 && year <= 9999)){
			return false;
		}else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0 &&(year > 0 && year <= 9999)){
			return true;	
		}else { 
			return false;
		}		
	}
    //閏年計算器
    //編寫一個 isLeapYear 方法，參數類型為 int，名稱為 year。

    //該參數需要大於或等於 1 且小於或等於 9999。

    //如果參數不在該範圍內，則返回 false。

    //否則如果在有效範圍內，則計算年份是否為閏年，如果是閏年則返回true，否則返回false。

    //要確定某一年是否為閏年，請按照下列步驟操作：
    //1.如果年份能被4整除，則轉第2步，否則轉第5步。
    //2. 如果年份可以被 100 整除，則轉到第 3 步。否則，轉到第 4 步。
    //3. 如果年份可以被 400 整除，則轉到第 4 步。否則，轉到第 5 步。
    //4. 該年為閏年（有366天）。方法 isLeapYear 需要返回 true。
    //5. 年份不是閏年（有 365 天）。方法 isLeapYear 需要返回 false。

    //以下年份不是閏年：
    //1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
    //這是因為它們可以被 100 整除但不能被 400 整除。
    //(year == 1700 || year == 1800 || year == 1900 || year == 2100 || year == 2200 || year == 2300 || year == 2500 || year == 2600)
    
    //下列年份為閏年：
    //1600, 2000, 2400
    //這是因為它們可以被 100 和 400 整除。
    
//    public static boolean isLeapYear (int year){
//      int step1 = year % 4;
//		int step2 = year % 100;
//		int step3 = year % 400;
//		
//		
//		if(year<=1) {	
//			return false;
//		}else if(year>=9999) {
//			return false;
//		}
//		if(step1==0) {
//			if(step2==0) {
//				if(step3==0) {
//					return true;
//				}else {
//					return false;
//				}
//			}else {
//				return true;
//			}
//		}else {
//			return false;
//		}
//    }
}

