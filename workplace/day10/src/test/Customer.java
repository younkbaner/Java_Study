package test;

public class Customer {
	
	private String firstName;
	private String lastName;
	private Account account;
	
	//构造器
	public Customer(String f,String l) {
		firstName=f;
		lastName=l;
	}

	//方法
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	
}
