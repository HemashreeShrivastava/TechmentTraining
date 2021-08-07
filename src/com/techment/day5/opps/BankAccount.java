package com.techment.day5.opps;
class Customer
{
	int cuctomerId;
	String customerName;
	Account account;
	public Customer(int cuctomerId, String customerName, Account account) {
		super();
		this.cuctomerId = cuctomerId;
		this.customerName = customerName;
		this.account = account;
	}
	void displayCustomerDetail()
	{
		System.out.print("customer id :"+cuctomerId+"\t");
		System.out.print("Customer name :"+customerName+"\t");
		System.out.print("Account No. :"+account.accountNo+"\t");
		System.out.print("Account type:"+account.accountType+"\t");
		System.out.print("balance:"+account.balance+"\t");
		System.out.print("ifsc:"+account.ifscCode+"\t");
		System.out.print("branch:"+account.branch+"\t");
		System.out.print("\n");
		
	}	
	
}
class Account
{
	int accountNo;
	String accountType;
	double balance;
	int ifscCode;
	String branch;
	public Account(int accountNo, String accountType, double balance, int ifscCode, String branch) {
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.balance = balance;
		this.ifscCode = ifscCode;
		this.branch = branch;
	}

	
}
public class BankAccount {

	public static void main(String[] args) {
		Account account1 =new Account(112568,"Current",1000.0,4532,"Durg");
		Customer cust1 =new Customer(100,"Honey",account1);
		Account account2 =new Account(112568,"Saving",500.0,2432,"Raipur");
		Customer cust2 =new Customer(105,"Seema",account2);
		cust1.displayCustomerDetail();
		cust2.displayCustomerDetail();

	}

}
