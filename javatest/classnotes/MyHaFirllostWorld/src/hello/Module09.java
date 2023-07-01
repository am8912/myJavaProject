package hello;

public class Module09 {

	public static void main(String[] args) {
//		([判斷式]?[true的回傳]:[false的回傳])
	int age = 20;
	boolean x=(age>18?true:false);
	System.out.println(x);
//	int i = true?false?1:2:3;
//	int i = (true?(false?1:2):3);
//	int i = true?2:3;
//	i=?
	String str1 = "apple";
	String str2 = "apple";
	String str3 = new String("apple");
	System.out.println(str1==str2); // 比較對象stack裡的值
	System.out.println(str1==str3); // 比較對象stack裡的值
	
	
	}
	
}
