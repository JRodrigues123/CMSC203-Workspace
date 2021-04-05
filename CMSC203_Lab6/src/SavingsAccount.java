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
	
	public SavingsAccount(String accountName, double inBalance) {
		
		super(accountName, inBalance);
	}
}
