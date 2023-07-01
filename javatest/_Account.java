package javatest;

public class _Account {

	public static void main(String[] args) {
		
//		Account bobsAccount = new Account();
// 如果數據過於繁瑣，會使用Constructor（建構函式），設置物件的初始狀態。
// 必須使用this語句來調用建構函數		
		Account bobsAccount = new Account("12345", 1000.00, 
				"Bob Brown", "myemail@bob.com","(087) 1234-5678");
// 建構函數重載		
		System.out.println(bobsAccount.getCustomerName());
		System.out.println(bobsAccount.getBalance());

		
//		bobsAccount.setNumber("12345");
//		bobsAccount.setBalance(1000.00);
//		bobsAccount.setCustomerName("Bob Brown");
//		bobsAccount.setCustomerEmail("myemalil@bob.com");
//		bobsAccount.setCustomerPhone("(087)12345678");
		
		bobsAccount.withdrawFund(100.0);
		bobsAccount.depositFunds(250);
	}

}
