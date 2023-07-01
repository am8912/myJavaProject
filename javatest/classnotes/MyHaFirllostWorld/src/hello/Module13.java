package hello;

import java.util.Scanner;

// import javax.swing.JOptionPane;

public class Module13 {

	public static void main(String[] args) {
		System.out.println("age?");
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); // 可以讀一段"空格"之前的文字
//		String str = sc.nextLine(); // 可以讀一段"換行"之前的文字
		System.out.println(str);
		sc.close(); // 才不會佔記憶體空間
	
		int age = Integer.parseInt(str);
//		System.out.println("是否成年" + (age>18));
//		double monthOfYear = Double.parseDouble(str);
//		System.out.println("是否為上半年" + (monthOfYear<=6));
		if(age < 18) {
			System.out.println("未成年");
		}else if(age <= 65){
			System.out.println("成年");
		}else{
			System.out.println("老年");
		}
	}

}
