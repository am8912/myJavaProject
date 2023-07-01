package javatest;

public class _Customer {

	/* 可執行的程式碼應該放在方法內部，或是使用靜態區塊（static block）。
     * 
     */
	public static void main(String[] args) {
		Customer customer = new Customer("Ann", 100, "ann@email.com");
		System.out.println(customer.getName());
		System.out.println(customer.getCreditLimit());
		System.out.println(customer.getEmail());
// 調用兩個constructor		
		Customer secondCustomer = new Customer();
		System.out.println(secondCustomer.getName());
		System.out.println(secondCustomer.getCreditLimit());
		System.out.println(secondCustomer.getEmail());

		Customer thirdCustomer = new Customer("Joe","joy@email.com");
		System.out.println(thirdCustomer.getName());
		System.out.println(thirdCustomer.getCreditLimit());
		System.out.println(thirdCustomer.getEmail());

	}

}
