package hello;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Module11 {

	public static void main(String[] args) {
		System.out.println("請輸入月份");
		Scanner sc = new Scanner(System.in); // new + 類別名稱-->建立物件
		String str = sc.next();
//		String str = sc.nextLine();
		System.out.println(str);
		sc.close(); // 才不會佔記憶體空間
		
//	彈出式視窗(額外補充，已經很少人使用)	
//		String str = JOptionPane.showInputDialog("請輸入banana");
//		JOptionPane.showInputDialog(null,str);
//		System.out.println(str);
//	轉換輸入文字為數字	
//		int age = Integer.parseInt(str);
//		System.out.println("是否成年" + (age>18));
		double monthOfYear = Double.parseDouble(str);
		System.out.println("是否為上半年" + (monthOfYear<=6));
	}

}
