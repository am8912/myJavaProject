package javatest.inheritancePart1;

public class Dog extends Animal {

// 繼承另一個類的屬性和方法，子類可以繼承父類的非私有成員（屬性和方法）
// 並可以擴展或修改父類的功能。	(延伸、重複使用)
	public Dog(String size, double weight) {
		super("Dog", size, weight); // 直接拿Animal的建構子來用就好(可按F3確認)
	}// 把type的"dog"寫死
	
	

}
