/**
 * This is the Savings account
 * @author justinrodrigues
 *
 */
public class SavingsAccount extends BankAccount{
	
	/*
	 * This is the rate for the savings account
	 */
	private double rate = 0.025;
	
	/*
	 * This is the savingsNumber for each account
	 */
	private int savingsNumber = 0;
	
	/*
	 * Account number
	 */
	private String accountNumber;
	
	/**
	 * This is the constructor for savings account
	 * @param accountName
	 * @param inBalance
	 */
	public SavingsAccount(String accountName, double inBalance) {
		
		//This gets the constructor from BankAccount
		super(accountName, inBalance);
		
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	/**
	 * This is a copy constructor that mkes a new savings account 
	 * @param savAccount
	 * @param amount
	 */
	public SavingsAccount(BankAccount savAccount, double amount) {
		
		/*
		 * Creates a new bank account by calling the 
		 * constructor from the super class
		 */
		super(savAccount, amount);
		
		//This increments the amount of saving accounts
		savingsNumber++;
		
		this.accountNumber = savAccount.getAccountNumber() + "-" + savingsNumber;
		
	}
	
	/*
	 * This method will give interest to said user
	 */
	public void postInterest() {
		
		//This here is to get the interest for the user
		double interest = getBalance() * rate;
		
		//This "Deposits" it
		deposit(interest);
	}
	
	//Getters and setters
	
	public int getSavingsNumber() {
		return savingsNumber;
	}
	
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}
	
	
	
	
}
