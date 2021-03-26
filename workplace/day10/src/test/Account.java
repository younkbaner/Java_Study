package test;

public class Account {

	private int id;
	private double balance;
	private double  annualInterestRate;
	
	//构造器
	public Account(int id,double balance,double  annualInterestRate) {
		this.id=id;
		this.balance=balance;
		this. annualInterestRate= annualInterestRate;
	}
	
	//方法
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	
	public void withdraw(double amount) {
		if(balance<amount) {
			System.out.println("余额不足,取款失败");
			return;
		}
		balance-=amount;
		System.out.println("成功取出"+amount);
		
	}
	
	public void depoist(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("存款成功:"+amount);
		}
	}
	
	
}
