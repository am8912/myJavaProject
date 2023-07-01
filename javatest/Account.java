package javatest;

public class Account {

	private String number;
	private double balance;
	private String customerName;
	private String customerEmail;
	private String customerPhone;
	
// 存款方法	
	public void depositFunds(double depositAmount) {
		balance += depositAmount;
		System.out.println("Deposit of $" + depositAmount +" made. New balance is $" + balance);
	}
// 取款方法
	public void withdrawFund(double withdrawalAmount) {
		if(balance - withdrawalAmount < 0) {
			System.out.println("Insufficient Funds! You only have $" + 
					balance + " in your account.");
		}else {
			balance -= withdrawalAmount;
			System.out.println("Withdrawal of $" + withdrawalAmount + 
					"processed, Remaining balance = $" + balance);
		}		
	}
// 數據過於繁瑣會使用Constructor建構子
// 名字需和類一樣、沒有返回類型，一個類可以有1個或多個建構子(其中包含空的無參數建構子)
// 目的用於初始化創建的對象	
// public class Account{ // This is the class declaration
//		public Account() { // This is the constructor declaration
//			// constructor code is code to be executed as the object is created.
//		}
//	}
	public Account() {
// this.()statement必須是第一個語句		
//		this("56789", 2.50, "Default name", "Default address","Default phone");
		System.out.println("Empty constructor called");
	}
	public Account(String number, double balance, String customerName, String email, String phone) {
		System.out.println("Account constructor with parameters called"); 
// 不能寫成setNumber(number);
// 還是要用this.()去初始化值
		
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		customerEmail = email; // 名稱不同無需使用this.()
		customerPhone = phone;
	}
	
// 右鍵Source-> Generate Getters & Setters
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
}
