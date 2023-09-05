package hello;

import java.math.BigDecimal;

public class Module01 {
	static byte _1;
	public static void main(String[] args) { // 在方法裡面宣告稱為區域變數，方法外的宣告就稱為實體變數、類別變數。
		// 1.循序結構
		
		System.out.println(0.1+0.2); // 0.3
		
		BigDecimal num1=new BigDecimal("0.1"); // 浮點數問題的解決方案(內建)
		BigDecimal num2=new BigDecimal("0.2");
		System.out.println(num1.add(num2));
		
		
		byte byte_1 = 1; // 宣告變數 (宣告、使用方法) 
		short short_1 = 1;
		int int_1 = 1;
		long long_1 = 2147483648L; // 尾數+大寫方便閱讀
		
		char char_1 = 'A'; // (?)
		char char_2 = '\u0B87';
		int c_2 = 2951;
		char practice = '\u00C2';
		System.out.println((char)c_2);
		System.out.println(practice + "" + practice); // print出兩個符號 +""+ 強制轉為字串
		
		float float_1 = 0.1f;
		double double_1 = 1;
		boolean boolean_1 = false; // 2.選擇結構 3.循環結構
		int UP = 1;
		int DOWN = 2;
		// 特殊的命名規範
		int _=1; // private嚴格的私有化變數(特定程式裡面運作)
		int $=1; // 系統變數(工具中特定的數值)
		
		System.out.println(byte_1);
		System.out.println(short_1);
		System.out.println(int_1);
		
		System.out.println(char_1);
		System.out.println((int)char_1); // Unicode代號 65
		System.out.println(char_2); // Unicode代號 65
		
		
		System.out.println(double_1);
		System.out.println(boolean_1);
		System.out.println(float_1);
		System.out.println(long_1);
		System.out.println("s"+1);
		
		int age = 87,salary = 45000;
		System.out.println(age);
		System.out.println(salary);
	}
	public static boolean hasSharedDigit(int num01, int num02) {
		return false;
//		if(num01<10 && num02<10) {
//			return false;
//		}
//		if(num01>99 && num02>99) {
//			return false;
//		}
//		int digit = 0;
//	    while(int i<num01 || i<num02) {
//	    	
//	    	i /= 10;
//	    }
//		
//		return false;
	}
}
