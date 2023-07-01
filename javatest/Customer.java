package javatest;

public class Customer {
	private String name;
	private double creditLimit;
	private String email;
	
	public Customer() {
		this("Nobody", "nobody@nowhere.com");
	}
	public Customer(String name, String email) {
		this(name, 1000, email);
	}
	public Customer(String name, double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}
	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmail() {
		return email;
	}

//	Constructor challenge
//	Create three constructors for this class:
	
//	1.First, create a constructor for all three fields which should assign the arguments
//	  directly to the instance fields.
//	2.Second, create a no args constructor that calls another constructor, passing some
//	  literal values for each argument.
//	3.And lastly, create a constructor with just the name and email parameters, which also
//	  calls another constructor.

}
