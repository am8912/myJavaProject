package javatest;

public class _NumberPalindrome {

	public static void main(String[] args) {
		

	}
	public static boolean isPalindrome(int number) {

		int temp = number;
		
		int reverse =0; // 相反之後的數值
		
		while(number>0 || number<0) {
			int digit = number % 10;// 取餘數
			// 2357
			
			// reverse
			// 7000-> 7 70 700 7000
			// 50->5 50 500
			// 30->3 30
			// 2->2
			// 將reverse*10，原本的數字就向左移一位，為下一個位數騰出空間。
			// 將上一步得到的個位數（digit）加到 reverse 上，這樣就把個位數放在了反轉數字的最左邊。
			reverse = reverse * 10 + digit; // 取倒過來的數值
			System.out.println(reverse);
			number /= 10 ; // 更新number
			
		}
		 return temp == reverse;
	}
	
}
