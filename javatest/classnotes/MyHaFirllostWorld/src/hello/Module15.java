package hello;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Module15 {

	public static void main(String[] args) {
		String m = JOptionPane.showInputDialog("月份");
		
		switch(m){
			case "四月":
			case "六月":
			case "九月":
			case "十一月":
				System.out.println("30天");
				break;
			case "二月":
				System.out.println("28");
				break;
			default:
				System.out.println("31天");
				break;
		}	
	}

}

