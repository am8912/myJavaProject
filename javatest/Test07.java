package javatest;

public class Test07 {

	public static void main(String[] args) {
		String employmentID = "56481";
		employmentID = addZero(employmentID,8,false);
		
		String result = ""; // 空字串
		currencyConverter(35000); // 匯率換算
		result = currencyConverter(35000);
		System.out.println(result);
		testMethod("hello",13.156);
		
	}
	// return type 返回型別
	// void 此方法不用回傳東西
	public static String currencyConverter(int twd) {
		double currency = 0.032600262;
		return "" + (twd * currency);
	}
	/**
	 * 字串補0
	 * @param str 要補0的字串
	 * @param num 補0後的字串長度
	 * @param isBehind true:補0在後/false:補0在前
	 * @return
	 */
	public static String addZero(String str, int num, boolean isBehind){
		String z = "";
        for (int i=str.length() ; i<num; i++)
        {
            z = z + "0";
        }
        return isBehind?str + z:z + str;
	}
	public static void testMethod(String a,double b) {
		System.out.println("param_1:" + a);
		System.out.println("param_1:" + b);
	}
} 
