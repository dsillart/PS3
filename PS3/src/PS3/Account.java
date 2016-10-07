package PS3;
import java.util.Date;
import PS3.InsufficientFundsException;

public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account(int identification, double accountBalance, double rate) {
	this.id = identification;
	this.balance = accountBalance;
	this.annualInterestRate = rate;
	this.dateCreated = new Date();
	}
	
	public Account() {
		this(0,0,0);
	}
	
	public Account(int id, double balance) {
		this(id,balance,0);
	}
	
	public int getID() {
		return id;
	}
	
	public double getBalance() {
			return balance;
	}
	
	public double getannualInterestRate() {
		return annualInterestRate;
	}
	
	public Date getdateCreated() {
		return dateCreated;
	}
	
	public void setID(int newID) {
		this.id = newID;
	}
	
	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}
	
	public void getAnnualInterestRate(int newRate) {
		this.annualInterestRate = newRate;
	}	

	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	
	public void withdraw(double amount) throws InsufficientFundsException {

		if(amount <= balance) {
			balance -= amount;
			}
		else {
			double needs = amount - balance; throw new InsufficientFundsException(needs);
			}
	}
	
	public void deposit(double amount)
	   {
	      balance += amount;
	   }
}
