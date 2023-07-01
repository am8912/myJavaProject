package javatest;

public class classTest {
	/*
	 * The class(類別), the object(物件),
	 * static可調用的(靜態) & instance(實例) fields(成員、屬性) and methods(方法)
	 */
	
		// Object-物件,Class-類(別)
	public static void main(String[] args) {
		Math.round(3.67123); // Math類別
		
//		int a = 10;跟下方一樣的概念
//		Test21 test = new Test21(); 其實可以不用宣告
		
		// 靜態方法可直接由"類名"調用
		// 建立物件，使用類別內的方法
		Test21 test = new Test21();
		// ClassName.methodName();
		test.back(9); // 回調別的頁面的方法
		
		ForTest.multiplication(20, 30);
		System.out.println(ForTest.multiplication(20, 30));
		// 要使用實例方法，要先創建一個實例或對象。
		// 假設有一個類別（Class）叫做 MyClass，其中包含一個實例方法 myMethod：
		
		// 創建 MyClass 的對象實例
		// MyClass myObject = new MyClass();
		
		// 使用對象實例調用 myMethod
		// myObject.myMethod(arg1, arg2);
	}
}
