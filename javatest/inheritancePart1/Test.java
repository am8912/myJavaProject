package javatest.inheritancePart1;

import javatest.StringUtil;

public class Test extends StringUtil {
// 繼承
	public static void main(String[] args) {
		Dog dog = new Dog("大型", 19.8);
		dog.move("33.6"); // 重複使用父類別的方法
// 員邊六位	
		System.out.println(addZero("125", 6, false));
	}

}
